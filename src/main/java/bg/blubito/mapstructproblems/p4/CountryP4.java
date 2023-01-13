package bg.blubito.mapstructproblems.p4;

public class CountryP4 {
    private String name;

    public CountryP4(String name) {
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
        return "CountryP4{" +
                "name='" + name + '\'' +
                '}';
    }
}
