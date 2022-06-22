package lab2;

public class Main {
    static public void main(String[] args){

        Repository repository = new Repository(100);
        Consumer consumer = new Consumer();
        Manufacturer manufacturer = new Manufacturer();

        consumer.addRepository(repository);
        manufacturer.addRepository(repository);

        Thread manufacturerThread = new Thread(manufacturer);
        Thread consumerThread = new Thread(consumer);

        manufacturerThread.start();
        consumerThread.start();
    }
}
