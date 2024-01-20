package character;

import exception.WrongWeightException;
import object.Item;
import object.Location;
import bodyparts.*;

import java.util.Objects;

public class Margarita extends character.Entity {
    private Location location;
    private String name;
    private int age;
    private int weight=70;
    private final Fingers fingers = new Fingers(this);
    private final Hurt hurt= new Hurt(this);
    private final Lips lips = new Lips(this);
    private final Hair hair = new Hair(this);
    private final Face face = new Face(this);
    private final Legs legs = new Legs(this);

    private Item object;

    public Margarita(int health, Location location, String name, int age) {
        super(health, location, name, age);
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public void transform() {
        fingers.touchCream();
        hurt.pound();
        setAge(20);
        hair.change();
        face.change();
        this.setWeight(getWeight()-20);
        lips.bite();
        try {
            this.jump();
        } catch (WrongWeightException e) {
            System.out.println("нельзя использовать некорректный вес");
        }

    }

    public void jump() throws WrongWeightException{
        try {
            legs.weightlessness();
        }catch (WrongWeightException e){
            System.out.println(" ");
        }
    }
    public void undressed(){
        class bathrobe{
            public void condition(){
                if (Margarita.this.getWeight()< 70){
                    Margarita.this.transform();
                }
            }

        }
        new bathrobe().condition();
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (this.hashCode() != object.hashCode()) return false;
        character.Entity person = (Entity) obj;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

