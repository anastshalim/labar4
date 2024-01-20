package bodyparts;

import character.Entity;
import character.Worm;
import enums.Material;
import enums.WormCondition;
import object.Box;
import object.Location;

public class Fingers extends BodyPart {
    public Fingers(Entity owner) {
        super(owner);
    }

    @Override
    public void change() {
        getOwner().setHealth(100);
    }
    public void touchCream(){
        Location location=new Location("кончики пальцев");
        Box box = new Box(50, location, Material.PLASTIC);
        box.Open();
    }
    public void touchWorm(Worm worm){
        worm.setCondition(WormCondition.COlD, WormCondition.STICKY);
    }

}
