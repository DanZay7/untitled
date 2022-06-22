package lab7;

import java.util.ArrayList;
import java.util.List;

public class Building implements Collection{
    private Room[] floor_1 = new Room[10];
    private ArrayList<Room> floor_2 = new ArrayList<>();
    private List<Room> floor_3 = new ArrayList<>();


    public Building(Room[] floor1, ArrayList<Room> floor2, List<Room> flour3) {
        this.floor_1 = floor1;
        this.floor_2 = floor2;
        this.floor_3 = flour3;
    }

    public Room[] getFloor_1() {
        return floor_1;
    }

    public void setFloor_1(Room[] floor_1) {
        this.floor_1 = floor_1;
    }

    public ArrayList<Room> getFloor_2() {
        return floor_2;
    }

    public void setFloor_2(ArrayList<Room> floor_2) {
        this.floor_2 = floor_2;
    }

    public List<Room> getFloor_3() {
        return floor_3;
    }

    public void setFloor_3(List<Room> floor_3) {
        this.floor_3 = floor_3;
    }


    @Override
    public Iterator getIterator() {
        return new RoomIterator();
    }
    private class RoomIterator implements Iterator{
        private int index;
        private int len;
        private int lenF1;
        private int lenF2;
        private int lenF3;



        public RoomIterator() {
            lenF1 = floor_1.length;
            lenF2 = floor_2.size();
            lenF3 = floor_3.size();
            len = lenF1 + lenF2 + lenF3;
        }

        @Override
        public boolean hasNext() {
            return index < len;
        }

        @Override
        public Object next() {
            if (index < lenF1){
                return floor_1[index++];
            } else if ( (index >= lenF1) && (index < (lenF1+lenF2))){
                index++;
                return floor_2.get(index - 1 - lenF1);
            } else if (index >= (lenF1+lenF2) && index < (lenF1+lenF2+lenF3)){
                index++;
                return floor_2.get(index - 1 - lenF1 - lenF2);
            } else {
                index++;
                return floor_2.get(index - 1 - lenF1 - lenF2 - lenF3);
            }
        }
    }
}
