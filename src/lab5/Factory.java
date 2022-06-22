package lab5;

import lab1.*;
import lab3.CountryOfOrigin;

public abstract class Factory {
    public Auto actionFactory(int Value){
        Auto auto = createAuto(Value);
        System.out.println(auto.getDescription());
        return auto;
    }

    abstract  Auto createAuto(int Value);

}
