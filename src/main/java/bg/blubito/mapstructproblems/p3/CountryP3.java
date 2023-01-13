package bg.blubito.mapstructproblems.p3;

public class CountryP3 {
    private String name;

    public CountryP3(String name) {
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
        return "CountryP3{" +
                "name='" + name + '\'' +
                '}';
    }
}
