package lab1;

import java.util.ArrayList;
import lab1.Auto;
public class Sports extends Auto {
    private final String ready = "Класс Sports";
    private boolean For_race;
    public Sports(ArrayList<String> newType1, float newType2, float newType3, boolean newType4) {
        super(newType1, newType2, newType3);
        For_race = newType4;
    }
    public void setFor_race(boolean newType){
        For_race = newType;
    }
    public boolean getFor_race (){
        return For_race;
    }
    public String getDescription() {
        return ready;
    }
}
