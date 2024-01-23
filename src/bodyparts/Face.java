package bodyparts;

import character.Entity;
import enums.BodyCondition;

public class Face extends BodyPart {
    public Face(Entity owner) {
        super(owner);
    }

    public class Eyebrows extends BodyPart {

        public Eyebrows(Entity owner) {
            super(owner);
        }

        public void eyebrowsChange() {
            Face.this.removeCharacteristics(BodyCondition.PLUCKED);
            Face.this.addCharacteristics(BodyCondition.THICK);
        }
    }

    public class Forehead extends BodyPart {

        public Forehead(Entity owner) {
            super(owner);
        }


        public void foreheadChange() {
            Face.this.removeCharacteristics(BodyCondition.WRINKLED);
            Face.this.addCharacteristics(BodyCondition.WHITE, BodyCondition.CLEAN);
        }
    }

    public class Cheeks extends BodyPart {

        public Cheeks(Entity owner) {
            super(owner);
        }


        public void cheeksChange() {
            Face.this.addCharacteristics(BodyCondition.PINK);
        }
    }
    public class Eyelids extends BodyPart {

        public Eyelids(Entity owner) {
            super(owner);
        }


        public void eyelidsChange() {
            Face.this.removeCharacteristics(BodyCondition.GREENLY);
            Face.this.addCharacteristics(BodyCondition.YELLOW);
        }
    }


    public void faceChange() {
        Eyebrows eyebrows = new Eyebrows(this.getOwner());
        Forehead forehead = new Forehead(this.getOwner());
        Cheeks cheeks = new Cheeks(this.getOwner());
        Eyelids eyelids = new Eyelids(this.getOwner());
        eyebrows.eyebrowsChange();
        forehead.foreheadChange();
        cheeks.cheeksChange();
        eyelids.eyelidsChange();
    }
}
