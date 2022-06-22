package lab2;

class Manufacturer implements Runnable{

    private int output = 5;
    private Repository repository;

    public void addRepository(Repository repository){
        this.repository = repository;
    }

    @Override
    public void run(){
        while (true){
            if (repository.addNumberProduct(output)) {
                System.out.println("Произведен товар. Количество товара на складе " + repository.getNumberProduct());
            }
            else {
                System.out.println("Произведен товар. Cклад полн!!");
                while (true){
                    repository.setProduced(true);
                    if (repository.getNumberProduct() < repository.getBulk()/2) {
                        break;
                    }
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
