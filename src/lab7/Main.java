package lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room[] roomes1 = new Room[10];
        for (int i = 0; i < 10; i++){
            roomes1[i] = Room.generate( i,i*10);
        }



        ArrayList<Room> rooms2 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            rooms2.add(Room.generate( i,i*10));
        }

        ArrayList<Room> rooms3 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            rooms3.add(Room.generate( i,i*10));
        }

        Building building = new Building(roomes1,rooms2,rooms3);

        counter(building);
        counter("\nПощадь жилых помещений: ", TypeOfRoom.LivingRoom, building);
        counter("\nПощадь магазинных помещений: ", TypeOfRoom.Shop, building);
        counter("\nПощадь офисных помещений: ", TypeOfRoom.Office, building);

    }

    public static void counter(String str,TypeOfRoom type, Building building){
        double square = 0;
        Iterator iterator = building.getIterator();
        while (iterator.hasNext()){
            Room r = (Room) iterator.next();
            if (r.getType() == type)
                square += r.getSize();
        }
        System.out.println(str + square);
    }

    public static void counter(Building building){
        double square = 0;
        Iterator iterator = building.getIterator();
        while (iterator.hasNext()){
            Room r = (Room) iterator.next();
            square += r.getSize();
        }
        System.out.println("\nОбщая площадь: " + square);
    }
}
