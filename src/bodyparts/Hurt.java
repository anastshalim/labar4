package bodyparts;

import character.Entity;

public class Hurt extends BodyPart {
    public Hurt(Entity owner) {
        super(owner);
    }

    public void pound(){
        getOwner().setHealth(100);
    }
}
