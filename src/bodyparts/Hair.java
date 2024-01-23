package bodyparts;

import character.Entity;
import enums.BodyCondition;

public class Hair extends BodyPart {
    public Hair(Entity owner) {
        super(owner);
    }

    public void hairChange() {
        removeCharacteristics(BodyCondition.PERMING);
        addCharacteristics(BodyCondition.CURLY);
        addCharacteristics(BodyCondition.BLACKHAIRED);
    }
}
