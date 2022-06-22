package lab2;

 class Consumer implements Runnable{
  private int input = 10;
  private Repository repository;

  public void addRepository(Repository repository) {
   this.repository = repository;
  }

  @Override
  public void run() {
   while (true) {
    if (repository.removeNumberProduct(input)) {
     System.out.println("Потреблен товар. Количество товара на складе " + repository.getNumberProduct());
    }
    else {
     System.out.println("Cклад пуст!");

     while (true){
      repository.setProduced(false);
      if (repository.getNumberProduct() > repository.getBulk()/2) {
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
