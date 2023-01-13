package bg.blubito.mapstructproblems.p4;

public class PersonP4 {
    private String name;
    private CountryP4 country;

    public PersonP4(String name, CountryP4 country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryP4 getCountry() {
        return country;
    }

    public void setCountry(CountryP4 country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PersonP4{" +
                "name='" + name + '\'' +
                ", countryP4=" + country +
                '}';
    }
}
