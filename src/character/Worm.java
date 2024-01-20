package character;

import enums.WormCondition;
import object.Location;

import java.util.ArrayList;
import java.util.Arrays;

public class Worm extends Entity implements Getout {
    protected ArrayList<WormCondition> characteristics = new ArrayList<>();
    public Worm(int damage, Location location, String name, int age) {
        super(damage, location, name, age);
    }
    public void setCondition(WormCondition... characteristics) {
        this.characteristics.addAll(Arrays.asList(characteristics));
    }


    public void removeCondition() {
        for (WormCondition condition: characteristics) {
            this.characteristics.remove(condition);
        }
    }
    public void know(){
        removeCondition();
        setCondition(WormCondition.FAT);
    }

    @Override
    public void getout(Location location) {
        setLocation(location);
        location.removeEntity(this);
    }
}
