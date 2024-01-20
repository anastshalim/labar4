package enums;

public enum BodyCondition {
    PLUCKED("ощипанные"),
    THICK("густые"),
    WHITE("бел"),
    CLEAN("чист"),
    WRINKLED("морщинистый"),
    PINK("розовые"),
    CURLY("кудрявые"),
    BLACKHAIRED("черноволосые"),
    PERMING("завивка"),
    GREENLY("зазеленевшие"),
    YELLOW("желтенькие");

    final String name;

    BodyCondition(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
