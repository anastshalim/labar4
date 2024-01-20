package bodyparts;

import character.Entity;
import enums.BodyCondition;

import java.util.ArrayList;
import java.util.Arrays;

abstract public class BodyPart {
    private final Entity owner;
    protected  ArrayList<BodyCondition> characteristics = new ArrayList<>();

    public BodyPart(Entity owner) {
        this.owner = owner;
    }
    public void addCharacteristics(BodyCondition... characteristics) {
        this.characteristics.addAll(Arrays.asList(characteristics));
    }


    public void removeCharacteristics(BodyCondition... characteristics) {
        for (BodyCondition bodyCondition: characteristics) {
            this.characteristics.remove(bodyCondition);
        }
    }



    public Entity getOwner() {
        return owner;
    }
    public abstract void change();
}
