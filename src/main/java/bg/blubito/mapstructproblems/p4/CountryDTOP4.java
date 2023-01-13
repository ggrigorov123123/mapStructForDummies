package bg.blubito.mapstructproblems.p4;

public class CountryDTOP4 {
    private String name;

    public CountryDTOP4(String name) {
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
        return "CountryDTOP4{" +
                "name='" + name + '\'' +
                '}';
    }
}
