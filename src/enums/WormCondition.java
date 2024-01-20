package enums;

public enum WormCondition {
    STICKY("липкий"),
    COlD("холодный"),
    FAT("жирный");

    final String name;

    WormCondition(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
