package bodyparts;

import character.Entity;

public class Hurt extends BodyPart {
    public Hurt(Entity owner) {
        super(owner);
    }

    @Override
    public void change() {
        getOwner().setHealth(80);
    }

    public void pound(){
        getOwner().setHealth(100);
    }
}
