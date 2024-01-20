package object;
import enums.Material;

public class Lantern extends Item {
    private boolean lights;

    public Lantern(int damage, Location location, Material material) {
        super(damage, location, material);
    }

    public boolean getLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }



    public void ON() {
        setLights(true);
    }


    public void OFF() {
        if (getLights()) {
            this.lights = false;
        }
        this.getOwner().holdObject(this);
        String text = String.format("Люис держит %s",
                this);
        System.out.println(text);
        this.setDamage(getDamage());
    }

    @Override
    public String toString() {
        return "фонарик";
    }
}
