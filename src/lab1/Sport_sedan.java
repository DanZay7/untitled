package lab1;

import java.util.ArrayList;

public class Sport_sedan extends Sports{
    private final String ready = "Класс Sport_sedan";
    public Sport_sedan(ArrayList<String> newType1, float newType2, float newType3, boolean newType4) {
        super(newType1, newType2, newType3,newType4);
    }
    public String getDescription() {
        return ready;
    }
}
