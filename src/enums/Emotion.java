package enums;

public enum Emotion {
    FEROCIOUS("свирепый"),
    DISGUST("отвращение"),
    LONELY("одинокий"),
    ALIEN("чужой");

    final String name;
    Emotion(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }


}
