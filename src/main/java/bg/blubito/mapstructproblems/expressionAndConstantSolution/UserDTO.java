package bg.blubito.mapstructproblems.expressionAndConstantSolution;

public class UserDTO {
    private String name;
    private Boolean active = true;

    public UserDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}

