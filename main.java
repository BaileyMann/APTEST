import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Find Out What Ice Cream You Are");
        System.out.println("You are going to choose your favorite number");
        System.out.println("The number will correlate to what ice cream you are!");




    boolean run = true;
    do {
        System.out.println("What is your favorite number from 1 to 10?");
        int number = input.nextInt();
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default: System.out.print("The value inputted is not in range. Try another number");
        }


    } while (run) ;
    }
}



