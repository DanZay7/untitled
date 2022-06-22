package lab3;
import lab1.*;
import java.util.ArrayList;
public class Broken extends Decorator{
    AutoInterface auto;

    public Broken(AutoInterface auto){
        this.auto = auto;
    }

    @Override
    public String getDescription() {
        return  auto.getDescription() + " Битая машина";
    }
}
