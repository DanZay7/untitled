package lab1;
import java.util.ArrayList;
import lab1.Auto;
public class Minivans extends Auto{
    private final String ready = "Класс Minivans";
    private float Series;
    private boolean Trunk;
    public Minivans(ArrayList<String> newType1, float newType2, float  newType3, float  newType4, boolean  newType5) {
        super(newType1,newType2,newType3);
        Series = newType4;
        Trunk = newType5;
    }
    public  void setSeries (float newType){
        Series = newType;
    }
    public  float getSeries(){
        return Series;
    }
    public void setTrunk(boolean newType){
        Trunk = newType;
    }
    public boolean getTrunk (){
        return Trunk;
    }
    public String getDescription() {
        return ready;
    }
}
