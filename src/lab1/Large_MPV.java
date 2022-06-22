package lab1;

import java.util.ArrayList;

public class Large_MPV extends Minivans{
    private final String ready = "Класс Large_MPV";
    public Large_MPV(ArrayList<String> newType1, float newType2, float newType3, float newType4, boolean newType5) {
        super(newType1, newType2, newType3,newType4,newType5);
    }
    public String getDescription() {
        return ready;
    }
}
