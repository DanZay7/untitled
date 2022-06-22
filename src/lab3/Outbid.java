package lab3;


public class Outbid extends Decorator{

    AutoInterface auto;

    public Outbid(AutoInterface auto){
        this.auto = auto;
    }

    @Override
    public String getDescription(){
        return auto.getDescription() + " Перекуп";
    }
}
