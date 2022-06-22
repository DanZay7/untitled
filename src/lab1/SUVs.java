package lab1;

import java.util.ArrayList;
import lab1.Auto;
public class SUVs extends Auto {
    private final String ready = "Класс SUVs";
    private boolean Four_wheel_drive;
    public SUVs(ArrayList<String> newType1, float newType2, float newType3, boolean newType4) {
        super(newType1, newType2, newType3);
        Four_wheel_drive = newType4;
    }
    public void setFour_wheel_drive(boolean newType){
        Four_wheel_drive = newType;
    }
    public boolean getFour_wheel_drive (){
        return Four_wheel_drive;
    }
    public String getDescription() {
        return ready;
    }
}
