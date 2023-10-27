package tipoftheday.tip5.domain;
public class Car implements Vehicle{
    private final String name;
    private final String color;

    private final boolean isAutomatic;

    public Car(String name, String color, boolean isAutomatic) {
        this.name = name;
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getColor(){
        return color;
    }

    public boolean isAutomatic(){
        return isAutomatic;
    }

}
