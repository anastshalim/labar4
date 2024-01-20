package object;

import character.Luis;
import enums.Material;


public class Shovel  extends Item {

    public Shovel(int damage, Location location, Material material) {
        super(damage, location, material);
    }
    public void hit(Luis luis){
        this.setDamage(35);
        luis.dig(this);
    }
}
