import java.util.Scanner;

//public class Options {


    public class AnswerOptions{
        static String[] Answerlist = new String[5];
        static int lastAnswer = 0;
        static Scanner input = new Scanner(System.in);

       /* public static void Choose(){
            System.out.println("Choose a number");
            String newAnswer = input.nextLine();
            Answerlist[lastAnswer] = newAnswer;*/

            Boolean Answer = true;
        public static void ChooseAnswer(int Answer){
                Answer--;

                if(Answer < 1){
                    System.out.println("Sorry, your answer has to be 1-3");
                    System.out.println("Try again.");
                }else if(Answer == 1){
                    System.out.print("You are mint chocolate chip!");
                } else if(Answer == 2){
                    System.out.print("You are strawberry!");
                }else if(Answer == 3){
                    System.out.print("You are cookies and cream!");
                }else{
                    System.out.println("Note deleted.");
                }



        }






    }








}
