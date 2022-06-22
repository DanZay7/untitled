package lab1;

import java.util.ArrayList;

public class Premium_compact extends Luxury{
    private final String ready = "Класс Off_road_vehicle";
    public Premium_compact(ArrayList<String> newType1, float newType2, float newType3, boolean newType4) {
        super(newType1, newType2, newType3,newType4);
    }
    public String getDescription() {
        return ready;
    }
}
