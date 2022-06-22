package lab1;
import java.util.ArrayList;
import lab1.Auto;
public class Luxury extends Auto{
    private final String ready = "Класс Luxury";
    private boolean Passenger_seat;
    public Luxury(ArrayList<String> newType1, float newType2, float newType3, boolean newType4) {
        super(newType1, newType2, newType3);
        Passenger_seat = newType4;
    }

    public void setPassenger_seat(boolean newType){
       Passenger_seat = newType;
    }
    public boolean getPassenger_seat (){
        return Passenger_seat;
    }
    public String getDescription() {
        return ready;
    }
}
