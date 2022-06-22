package lab5;

import lab1.*;

public class Main {
    static public void main(String[] args) {

        int n;
        n = (int) (9 + Math.random() * 5);
        System.out.println("Массив длинной: " + n);
        Auto[] list = new Auto[n];
        Factory Factoryauto = new FactoryAuto();

        for (int i = 0; i < n; i++) {
            int j = (int) (Math.random() * 9);
            list[i] = Factoryauto.actionFactory(j);
        }

    }
}
