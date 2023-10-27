package tipoftheday.tip5.domain;

public class Airplane implements Vehicle{
    private final String name;
    private final String color;

    private final int flaps;

    public Airplane(String name, String color, int flaps) {
        this.name = name;
        this.color = color;
        this.flaps = flaps;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getFlaps(){
        return flaps;
    }
}
