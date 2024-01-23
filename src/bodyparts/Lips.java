package bodyparts;

import character.Entity;

public class Lips extends BodyPart {

    public Lips(Entity owner) {
        super(owner);
    }


    public void bite(){
        getOwner().setHealth(65);
    }
}
