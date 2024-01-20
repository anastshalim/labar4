package object;

import bodyparts.Hold;
import enums.Material;

public class Rope extends Item implements Hold {
    private boolean tie;

    public Rope(int damage, Location location, Material material) {
        super(damage, location, material);
    }


    public boolean getTie() {
        return tie;
    }

    public void setTie(boolean tie) {
        this.tie = tie;
    }

    public void isTied() {
        setTie(true);
    }

    @Override
    public void holdObject(Item item) {
        if (getTie()) {
            isTied();
        }
    }

}

