package enums;

public enum CharacteristicCream {
    OILY("жирный"),
    YELLOWISH("желтоватый"),
    EASY("лёгкий"),
    SWAMPMUD("запах болотной тины");

    final String name;

    CharacteristicCream(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
