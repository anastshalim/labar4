package character;

import object.Location;

public class Gadge extends Entity {
    private boolean life = true;

    public Gadge(int health, Location location, String name, int age) {
        super(health, location, name, age);
    }

    public void die() {
        if (isLife()) {
            setLife(false);
            setHealth(0);
            setAge(getAge());
            setName("мертвец");
        }
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

}
