public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int dial=0;

    public ComboLock(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }

    public void reset() {
        dial=0;
    }
    public void turnLeft(int ticks) { //#+++
        dial = dial+ticks;
        while(dial>39){
            dial-=40;
        }
        System.out.println("Dial is now " + dial);
    }
    public void turnRight(int ticks) {//#---
        dial=dial-ticks;
        while (dial<0){
            dial+=40;
        }
        System.out.println("Dial is now " + dial);
    }
    public boolean open(int ticks1, int ticks2, int ticks3) {
        turnRight(ticks1);
        if (dial != secret1)
            return false;
        turnLeft(ticks2);
        if (dial != secret2)
            return false;
        turnRight(ticks3);
        if (dial != secret3)
            return false;
        return true;
    }

}
