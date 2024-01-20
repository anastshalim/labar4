package object;

import enums.Material;

public class Padlock extends Item {
    private boolean open;
    private boolean broke;

    public Padlock(int damage, Location location, Material material) {
        super(damage, location, material);
    }
    public void check() {
        if (isOpen()) {
            setDamage(100);
            System.out.println("Замок открыт");
            setOpen(true);
        } else if (isBrocked()){
            this.broked();
            setBroke(true);
            if (this.getMaterial().getEndurance()>100){
                this.getMaterial().setEndurance(50);
            }
        }


        }

    public boolean getBroke() {
        return broke;
    }

    public void broked() {
        if (getBroke()) {
            this.setDamage(0);
            System.out.println("Замок сломан");
        }
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    public boolean isBrocked() {
        return broke;
    }

    public void setBroke(boolean broke) {
        this.broke = broke;
    }
}

