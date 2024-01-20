import bodyparts.Hold;
import character.*;
import enums.Material;
import exception.RemoveToEmptyLocation;
import object.*;

import java.lang.invoke.WrongMethodTypeException;

public class Main {
    public static void main(String[] args) throws RemoveToEmptyLocation, WrongMethodTypeException {
        Location cemetery = new Location("кладбище");
        Location funeral = new Location("похороны");
        Location planet = new Location("другая планета");
        Location room = new Location("комната Маргариты");
        Location dressingTable = new Location("трюмо");
        Clock clock = new Clock(20, 0);
        Luis luis = new Luis(100, cemetery, "Люис", 48);
        Luis bill = new Luis(100, funeral, "Билл Батэрмен", 48);
        Entity astronaut = new Entity(100, planet, "Астронавт", 48);
        Gadge gadge = new Gadge(100, funeral, "Гэдж", 15);
        Worm worm = new Worm(100, cemetery, "Червь", 1);
        Margarita margarita = new Margarita(80, room, "Маргарита Николаевна", 30);
        Rope rope = new Rope(20, cemetery, Material.FABRIC);
        Coffin coffin = new Coffin(50, cemetery, Material.SILVERY);
        Padlock padlock = new Padlock(200, cemetery, Material.IRON);
        Lantern lantern = new Lantern(0, cemetery, Material.IRON);
        Shovel shovel = new Shovel(10, cemetery, Material.IRON);
        Box box = new Box(100, dressingTable, Material.PLASTIC);
        Clock.ClockFace clockFace = new Clock.ClockFace(10, room, Material.GLASS);
        funeral.setEntity(gadge);
        cemetery.setEntity(luis);
        dressingTable.setItems(box);
        clockFace.crashed(box);
        if (gadge.getLocation().equals(funeral) || gadge.getLocation().equals(cemetery)) {
            gadge.die();
        }
        worm.know();
        clock.time();
        coffin.getStove().setMaterial(Material.CONCRETE);
        coffin.getStove().openCoffin();
        luis.see(coffin);
        padlock.check();
        rope.isTied();
        rope.holdObject(coffin);
        lantern.setOwner(luis);
        lantern.ON();
        dressingTable.getItem();
        luis.feel(worm);
        luis.feelPain();
        shovel.hit(luis);
        bill.feelPain();
        if (luis.equals(astronaut)) {
            luis.remember(coffin);
        }
        lantern.OFF();
        margarita.transform();
        margarita.undressed();
        Hold holdbox = new Hold() {
            private boolean a;

            public boolean isA() {
                return a;
            }

            public void setA(boolean a) {
                this.a = a;
            }

            @Override
            public void holdObject(Item item) {
                if (box.isOpen()) {
                    box.setOwner(margarita);
                    setA(true);
                }
                if (!isA()){
                    box.setOpen(true);
                }
            }
        };
        holdbox.holdObject(box);
    }
}