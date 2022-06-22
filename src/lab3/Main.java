package lab3;

import lab1.*;
import java.util.ArrayList;

public class Main {
    static public void main(String[] args) {

        int n;
        n = (int) (9 + Math.random()*12);
        System.out.println("Массив длинной: " + n);
        AutoInterface[] list = new AutoInterface[n];


        ArrayList<String> b1= new ArrayList<>();
        b1.add("BMW");


        ArrayList<String> b2= new ArrayList<>();
        b2.add("Lada");
        b2.add("ВАЗ");

        ArrayList<String> b3= new ArrayList<>();
        b3.add("Lamborghini");


        ArrayList<String> b4= new ArrayList<>();
        b4.add("Mercedes");

        ArrayList<String> b5= new ArrayList<>();
        b5.add("Toyota");


        int w0 = 2;
        int w1 = 4;
        int w2 = 6;
        int w3 = 8;

        int p1 = 300;
        int p2 = 400;
        int p3 = 500;
        int p4 = 600;

        for (int i = 0; i < list.length; i++){
            int j = (int) (Math.random()*9);
            if (j==0) {
                list[i] =  new Compact_executive(b4,w1,p1,true);
            }
            else if (j==1) {
                list[i] = (AutoInterface) new Premium_compact(b4,w1,p1,false);
            }
            else if (j==2){
                list[i] =  new Compact_MPV(b1,w1,p2,3,true);
            }
            else if (j==3){
                list[i] =  new Mini_MPV(b1,w2,p2,3,false);
            }
            else if (j==4){
                list[i] =  new Large_MPV(b5,w3,p4,4,false);
            }
            else if (j==5){
                list[i] =  new Crossover_SUV(b4,w1,p3,true);
            }
            else if (j==6){
                list[i] =  new Off_road_vehicle(b2,w1,p4, true);
            }
            else if (j==7) {
                list[i] = new Sport_sedan(b1, w1, p2, false);
           }
            else if (j==8){
                list[i] =  new Sport_utility_vehicle(b5,w1,p3,false);
            }
            else if (j==9){
                list[i] =  new Supercar(b3,w0,p4,true);
            }
       }
       for (AutoInterface auto : list) {
           double j = Math.random();
           if (j > 0.5) {
               auto = new Outbid(auto);
           }
           else if (j < 0.5) {
               auto = new Broken(auto);
           }
           System.out.println(auto.getDescription());
       }
    }
}
