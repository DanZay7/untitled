package lab7;
import lab4.*;
public class Room {

    private TypeOfRoom type;

    private double size;

    public Room(TypeOfRoom type, double size) {
        this.type = type;
        this.size = size;
    }

    public static Room generate(int type,double size) {
        if (type > 6){
            return new Room(TypeOfRoom.LivingRoom,size);
        }else if (type > 4){
            return new Room(TypeOfRoom.Office,size);
        }else {
            return new Room(TypeOfRoom.Shop, size);
        }

    }

    public TypeOfRoom getType() {
        return type;
    }

    public void setType(TypeOfRoom type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
