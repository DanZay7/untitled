package lab2;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    int N = 100;
    private int NumberProduct;
    private final int bulk = N;
    private boolean isProduced = false;


    public void setProduced(boolean produced) {
        isProduced = produced;
    }

    public boolean isProduced() {
        return isProduced;
    }




    Repository(int NumberProduct){
        this.NumberProduct = NumberProduct;
    }

    public synchronized int getNumberProduct() {
        return NumberProduct;
    }

    public synchronized void setNumOfProduct(int NumberProduct) {
        this.NumberProduct = NumberProduct;
    }


    public int getBulk() {
        return bulk;
    }

    public synchronized boolean addNumberProduct(int NumberProduct){

        while (isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.NumberProduct < bulk - NumberProduct){
            this.NumberProduct = this.NumberProduct+ NumberProduct;
            isProduced = true;
            notify();
            return true;
        }
        else {
            isProduced = true;
            notify();
            return false;
        }
    }

    public synchronized boolean removeNumberProduct(int NumberProduct){
        while (!isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.NumberProduct - NumberProduct > 0){
            this.NumberProduct = this.NumberProduct - NumberProduct;
            isProduced = false;
            notify();
            return true;
        }
        else {
            isProduced = false;
            notify();
            return false;
        }
    }
}
