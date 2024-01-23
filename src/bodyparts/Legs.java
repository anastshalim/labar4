package bodyparts;
import character.Entity;
import exception.WrongWeightException;

public class Legs extends BodyPart {
    private int weight;
    public Legs(Entity owner) {
        super(owner);
    }


    public void weightlessness() throws WrongWeightException{
        if (getWeight() < 0){
            throw new WrongWeightException("Вес меньше 0");
        }
        else{
            setWeight(10);
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
