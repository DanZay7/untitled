package Lab6;

import lab1.Auto;
import lab5.Factory;
import lab5.FactoryAuto;

public class Main {
    static public void main(String[] args) {

        int n;
        n = 12;
        System.out.println("Массив длинной: " + n);
        Auto[] list = new Auto[n];
        AbstractFactory Off_road = new Off_RoadAutoFactory();
        AbstractFactory ForCityAuto = new ForCityAutoFactory();
        System.out.println("Машины пригодные для бездорожья или плохой дороги");
        for (int i = 0; i <= n-2; i+= 2) {
            int k1 = (int) (1 + Math.random() * 2);
            int k2 = (int) (1 + Math.random() * 2);

            list[i] = Off_road.createMinivans(k1);
            list[i+1] = Off_road.createSUVs(k2);


        }
        for (Auto a : list) {
            System.out.println(a.getDescription());
        }
        System.out.println("Машины пригодные для езды по городу");
        for (int i = 0; i <= n-2; i += 2) {
            int k1 = (int) (1 + Math.random() * 2);
            int k2 = (int) (1 + Math.random() * 2);

            list[i] = ForCityAuto.createMinivans(k1);
            list[i+1] = ForCityAuto.createSUVs(k2);


        }
        for (Auto b : list) {
            System.out.println(b.getDescription());
        }
    }
}

