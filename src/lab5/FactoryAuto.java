package lab5;

import lab1.*;
import java.util.ArrayList;

public class FactoryAuto extends Factory{
    public Auto createAuto(int type){
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

        Auto auto = null;

        if (type==0){
            auto = new Compact_executive(b4,w1,p1,true);
        }
        else if (type==1){
            auto = new Premium_compact(b4,w1,p1,false);
        }
        else if (type==2){
            auto = new Compact_MPV(b1,w1,p2,3,true);
        }
        else if (type==3){
            auto = new Mini_MPV(b1,w2,p2,3,false);
        }
        else if (type==4){
            auto = new Large_MPV(b5,w3,p4,4,false);
        }
        else if (type==5){
            auto = new Crossover_SUV(b4,w1,p3,true);
        }
        else if (type==6){
            auto = new Off_road_vehicle(b2,w1,p4, true);
        }
        else if (type==7){
            auto = new Sport_sedan(b1,w1,p2,false);
        }
        else if (type==8){
            auto = new Sport_utility_vehicle(b5,w1,p3,false);
        }
        else if (type==9){
            auto = new Supercar(b3,w0,p4,true);
        }
        return auto;
    }
}



