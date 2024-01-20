package character;

import enums.CoffinCondition;
import enums.Emotion;
import object.Coffin;
import object.Item;
import object.Location;
import object.Shovel;
import bodyparts.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Luis extends Entity implements Hold {
    private Location location;
    private String name;
    private final ArrayList<Emotion> emotion = new ArrayList<>();
    private final Fingers fingers = new Fingers(this);
    private final Armpit armpit = new Armpit(this);

    private final Lips lips = new Lips(this);

    private Item thought;
    private Item object;

    public Luis(int health, Location location, String name, int age) {
        super(health, location, name, age);
    }

    public void setTypes(Emotion... emotion) {
        this.emotion.addAll(Arrays.asList(emotion));
    }

    public boolean hasType(Emotion emotion) {
        return this.emotion.contains(emotion);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void remember(Item item) {
        setThought(item);
        Item thought1 = getThought();
        if (item instanceof Coffin) {
            Coffin clone;
            clone = (Coffin) item;
            clone.addCondition(CoffinCondition.CLEAN, CoffinCondition.WHITE, CoffinCondition.WHITE);
            setThought(clone);
            thought1.setOwner(this);
        }
    }

    public void feelPain() {
        lips.bite();
        this.setTypes(Emotion.FEROCIOUS);

    }

    public void see(Coffin coffin) {
        if (!coffin.getStove().getRaise()) {
            coffin.getStove().openCoffin();
        }

    }

    public void dig(Shovel shovel) {
        armpit.holdObject(shovel);
        if (this.hasType(Emotion.FEROCIOUS)) {
            shovel.setDamage(50);
            this.setHealth(50);
            this.setTypes(Emotion.LONELY, Emotion.ALIEN);
        } else {
            shovel.setDamage(50);
            this.setHealth(20);

        }

    }

    public void feel(Worm worm) {
        this.setHealth(10);
        this.setTypes(Emotion.DISGUST);
        worm.getout(this.getLocation());
        fingers.touchWorm(worm);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.hashCode() != object.hashCode()) return false;
        Entity person = (Entity) obj;
        return person.getName().equals(this.name) && person.getHealth() == this.getHealth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getHealth(), getLocation());
    }

    @Override
    public void holdObject(Item object) {
        this.object = object;
        this.object.setOwner(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        this.location = location;
    }

    public Item getThought() {
        return thought;
    }

    public void setThought(Item thought) {
        this.thought = thought;
    }
}




