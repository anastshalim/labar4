package enums;

public enum CoffinCondition {
    WHITE("белый"),
    CLEAN("чистый"),
    DURABLE("прочный");

    final String name;

    CoffinCondition(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
