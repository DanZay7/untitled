package Lab6;
import lab1.*;
import java.util.ArrayList;

public class Off_RoadAutoFactory implements AbstractFactory{
    //Фабрика для создания машин пригодных для бездорожья или плохой дороги
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

    public Off_RoadAutoFactory(){
        car1.add("Ferrari");
        car2.add("Lamborghini");
        car3.add("BMW");
        car4.add("Cadillac");
    }

    public  Auto[] createSet(int type1, int type2){
        Auto[] rosterAuto = new Auto[2];
        rosterAuto[1] = createMinivans(type1);
        rosterAuto[2] = createSUVs(type2);
        return rosterAuto;
    }

    @Override
    public Minivans createMinivans(int type){
        if (type==1){
            return new Mini_MPV(car1,p4,w1,6,true);
        }else {
            return new Mini_MPV(car2,p5,w1,5,true);
        }
    }



    @Override
    public SUVs createSUVs(int type) {
        if (type == 1) {
            return new Sport_utility_vehicle(car4, p4, w1, false);
        } else if (type == 2) {
            return new Off_road_vehicle(car3, p4, w2, false);
        } else {
            return new Sport_utility_vehicle(car4, p4, w3, false);
        }
    }
}
