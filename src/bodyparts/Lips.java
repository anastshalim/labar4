package bodyparts;

import character.Entity;

public class Lips extends BodyPart {

    public Lips(Entity owner) {
        super(owner);
    }

    @Override
    public void change() {
        getOwner().setHealth(100);
    }

    public void bite(){
        getOwner().setHealth(65);
    }
}
