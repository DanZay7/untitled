public class test {
    public class ProduceAndConsume {
        // Устанавливаем общую переменную COUNT
        private static volatile int COUNT;

        public static void main(String[] args) {
            //Режиссер
            // Создаем три потока, каждый поток является производителем, производитель выполняет один раз, чтобы получить COUNT + 1
            for (int i = 0; i < 3; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // Каждый производитель может работать десять раз подряд
                            for (int j = 0; j < 10; j++) {
                                synchronized (ProduceAndConsume.class) {
                                    // Если производитель начинает ждать после COUNT> 10
                                    // Примечание: здесь не используется оценка if, чтобы не дать методу ожидания снова вовремя оценить COUNT после возврата
                                    while (COUNT + 1 > 10) {
                                        // Текущий поток снимает блокировку и ожидает пробуждения
                                        ProduceAndConsume.class.wait();
                                    }
                                    // Производим, если инвентарь не полон
                                    produce();
                                    System.out.println(Thread.currentThread().getName() + "Производство, общий инвентарь" + COUNT);
                                    // Спать некоторое время после каждого рождения
                                    Thread.sleep(500);
                                    // Если есть запасы после производства, разбудить всех ожидающих потребителей
                                    ProduceAndConsume.class.notifyAll();
                                }
                                // Спящий на некоторое время, оставляя время другим потокам для конкуренции за блокировки
                                Thread.sleep(500);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }).start();
            }

            // потребитель
            // Создаем три потока, указывая, что есть три потребителя
            for (int i = 0; i < 3; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while(true) {
                                // Все три потребителя могут продолжать потреблять
                                synchronized (ProduceAndConsume.class) {
                                    // Если инвентарь равен 0, прекращаем потребление
                                    while (COUNT == 0) {
                                        ProduceAndConsume.class.wait();
                                    }
                                    consume();
                                    System.out.println(Thread.currentThread().getName() + "Расход, общий инвентарь" + COUNT);
                                    Thread.sleep(500);
                                    ProduceAndConsume.class.notifyAll();
                                }
                                Thread.sleep(500);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        }
        // Синхронный способ производства и потребления
        public static synchronized void produce(){
            COUNT ++;
        }
        public static synchronized void consume(){
            COUNT --;
        }
    }

}
