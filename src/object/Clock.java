package object;

import enums.Material;

public class Clock {
    private int minutes;
    private int hours;

    public Clock(int minutes, int hours) {
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }


    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    private class Arrow {
        public void show() {
            setHours(10);
            setMinutes(20);
            String text = String.format("Длинная стрелка показывала %d часов, короткая стрелка показывала %d минут",
                    hours, minutes);
            System.out.println(text);
            hours += getHours();
            minutes += getMinutes();
            String text1 = String.format("Длинная стрелка показывала %d часов, короткая стрелка показывала %d минут",
                    getHours(), getMinutes());
            System.out.println(text1);

        }


    }

    public static class ClockFace extends Item {
        public ClockFace(int damage, Location location, Material material) {
            super(damage, location, material);
        }

        public void crashed(Box box) {
            box.fall();
            setDamage(0);
            this.material.setEndurance(0);
            this.setDamage(0);
        }
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void time() {
        Arrow arrow = new Arrow();
        arrow.show();
    }
}