package usageclasses;

/**
 * Created by MEHMET on 24.7.2017.
 */
public class City {
    private String name;

    public City() {
    }


    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
