package enums;

public enum Material {
    IRON("железное", 250),
    CONCRETE("бетонная", 100),
    SILVERY("серебристая", 200 ),
    FABRIC("тканевая", 30),
    PLASTIC("пластиковая", 50),
    GLASS("стеклянный", 5);


    final String name;
    int endurance;
    Material(String name, int endurance) {
        this.name= name;
        this.endurance = endurance;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return name;
    }
}

