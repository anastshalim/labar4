package object;

import character.Entity;
import enums.Material;

public abstract class Item{
    protected Location location;
    protected int damage;
    protected Entity owner;

    protected Material material;

    public Item(int damage, Location location, Material material) {
        this.damage = damage;
        this.setLocation(location);
        this.material = material;
    }


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        location.addItem(this);
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Entity getOwner() {
        return owner;
    }

    public void setOwner(Entity owner) {
        this.owner = owner;
    }

    public int getDamage() {
        return damage;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
