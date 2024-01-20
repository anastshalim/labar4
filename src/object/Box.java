package object;

import enums.CharacteristicCream;
import enums.Material;
import exception.RemoveToEmptyLocation;

import java.util.ArrayList;
import java.util.Arrays;


public class Box extends Item {
    private boolean open;

    public Box(int damage, Location location, Material material) {
        super(damage, location, material);
    }

    public void fall() throws RemoveToEmptyLocation {
        if (this.location==null){
            try{
                throw new RemoveToEmptyLocation("пустая локация");
            }catch (RemoveToEmptyLocation e){
                System.out.println("Пустая ссылка на локацию");
            }
        }
        else{
            this.location.removeItem(this);
        }
        setDamage(0);

    }


    private class Cream{
        private ArrayList<CharacteristicCream> characteristics = new ArrayList<>();

        public void addCharacteristics(CharacteristicCream... characteristics) {
            this.characteristics.addAll(Arrays.asList(characteristics));
        }
        public void inbox(){
            this.addCharacteristics(CharacteristicCream.OILY, CharacteristicCream.YELLOWISH);
            if (isOpen()){
                this.addCharacteristics(CharacteristicCream.EASY, CharacteristicCream.SWAMPMUD);
            }
        }
        public void rubin(){
            this.setCharacteristics(getCharacteristics());
        }
        public ArrayList<CharacteristicCream> getCharacteristics() {
            return characteristics;
        }

        public void setCharacteristics(ArrayList<CharacteristicCream> characteristics) {
            this.characteristics = characteristics;
        }

    }
    public void setOpen(boolean open){
        this.open= open;
    }

    public boolean isOpen() {
        return open;
    }

    public void Open(){
        setOpen(true);
        Cream cream = new Cream();
        cream.inbox();
        cream.rubin();
    }
}
