package Lab6;

import lab1.*;

import java.util.ArrayList;

public class ForCityAutoFactory implements AbstractFactory{
    //Фабрика для создания машин пригодных для езды по городу
    ArrayList<String> car1= new ArrayList<>();
    ArrayList<String> car2= new ArrayList<>();
    ArrayList<String> car3= new ArrayList<>();
    ArrayList<String> car4= new ArrayList<>();
    int w0 = 2;
    int w1 = 4;
    int w2 = 6;
    int w3 = 8;

    int p1 = 300;
    int p2 = 400;
    int p3 = 500;
    int p4 = 600;
    int p5 = 1000;

    public ForCityAutoFactory(){
        car1.add("Mercedes");
        car2.add("Tayota");
        car3.add("Cadillac");
        car4.add("BMW");
    }

    public  ArrayList<Auto> createSet(int type1, int type2){
        ArrayList<Auto> rosterAuto = new ArrayList<>();
        rosterAuto.add(createMinivans(type1));
        rosterAuto.add(createSUVs(type2));
        return rosterAuto;
    }


    @Override
    public Minivans createMinivans(int type){
        if (type==1){
            return new Compact_MPV (car1,p4,w1,6,true);
        }else  {
            return new Large_MPV(car3,p3,w1,4,false);
        }
    }



    @Override
    public SUVs createSUVs(int type){
        if (type==1){
            return new Crossover_SUV(car4,p4,w1,false);
        }else {
            return new Crossover_SUV(car3,p4,w3,false);
        }
    }
}

