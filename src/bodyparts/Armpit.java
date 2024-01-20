package bodyparts;

import character.Entity;
import object.Item;

public class Armpit extends BodyPart implements Hold {

    public Armpit(Entity owner) {
        super(owner);
    }

    @Override
    public void change() {
        getOwner().setHealth(60);
    }

    @Override
    public void holdObject(Item item) {
        item.setOwner(getOwner());
    }
}
