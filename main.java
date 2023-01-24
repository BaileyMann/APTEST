import java.util.Scanner;

public class main {
    public static void main(String[]args) {


        System.out.println("Find out what ice cream you are");
        System.out.println("What is your favorite color?");
        String[] Arraylist = {"blue,", " green,", " red"};
        displayArray(Arraylist);
    }
    public static void displayArray(String array[]) {
        int index;
        for (index = 0; index < array.length; index++) ;
        System.out.println(", " + array[index]);
        //  int list[0] = "blue";
        //int color2 = "green";
        // int color3 = "red";
        //  if(colorlist.equals(int list[0]){
        //     System.out.print("");

        int a = 1;
        int b = 2;
        int c = 3;


        boolean boolean_yes = true;
        if (boolean_yes) {
            System.out.print("Pic a number 1, 2, 0r 3");
            if (a == 1) {
                System.out.print("You are most likely to be a dog lover");

            } else if (b == 2) {
                System.out.print("You are most likely to be a cat lover");


            } else if (c == 3) {
                System.out.print("You are most likely to be a reptile lover");


            }
        }
    }}










