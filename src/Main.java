import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter the # for the first secret: ");
        int one = keys.nextInt();
        System.out.println("Enter the # for the second secret: ");
        int two = keys.nextInt();
        System.out.println("Enter the # for the third secret: ");
        int three = keys.nextInt();
        ComboLock a=  new ComboLock(one,two,three);
        System.out.println("Enter the # of ticks to turn Right: ");
        int t1=keys.nextInt();
        System.out.println("Enter the # of ticks to turn Left: ");
        int t2=keys.nextInt();
        System.out.println("Enter the # of ticks to turn Right: ");
        int t3=keys.nextInt();
        if(a.open(t1,t2,t3))
            System.out.println("Unlocked!");
        else
            System.out.println("Wrong! Try again");

    }
}
