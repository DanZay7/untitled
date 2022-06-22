package lab3;

public class CountryOfOrigin extends Decorator {
    private AutoInterface auto;
    public CountryOfOrigin(AutoInterface auto){
        this.auto = auto;
    }

    @Override
    public String getDescription() {
        return  auto.getDescription() + "Страна произвела автомобиля";
    }
}

