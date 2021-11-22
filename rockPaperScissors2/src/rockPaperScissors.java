import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args){
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        int score = 0;

        while (true){
            System.out.println("Do you want to play?");
            System.out.println("press [Y] for Yes or [N] for No");
            Scanner scanner1 = new Scanner(System.in);
            String choice = scanner1.next();
            if (choice.equals("N") || choice.equals("n")){
                System.out.println("Your total score is " + score);
                System.out.println("See You Again");
                break;
            }
            else if (choice.equals("Y") || choice.equals("y")){
                System.out.println("Rock Paper Scissors");
                System.out.println("[0] Rock\t[1] Paper\t[2] Scissors");
                Scanner scanner = new Scanner(System.in);
                int me = scanner.nextInt();
                if(me == 0){
                    System.out.println("You: Rock");
                }
                else if (me == 1){
                    System.out.println("You: Paper");
                }
                else if (me == 2){
                    System.out.println("You: Scissors");
                }
                else{

                    System.out.println("Doesn't exist. Do it again");
                }


                Random random = new Random();
                int opponent = random.nextInt(2);
                if (opponent == 0){
                    System.out.println("Opponent: Rock");
                }
                else if(opponent == 1){
                    System.out.println("Opponent: Paper");
                }
                else {
                    System.out.println("Opponent: Scissors");
                }


                if (opponent == me){
                    System.out.println("Result: draw");
                    score++;
                }
                else if (me == 0 && opponent == 1){
                    System.out.println("Result; You lost");
                    score--;
                }
                else if (me == 0 && opponent == 2){
                    System.out.println("Result: You Won");
                    score+=2;
                }
                else  if (me == 1 && opponent == 0){
                    System.out.println("Result: You won");
                    score+=2;
                }
                else if (me == 1 && opponent == 2){
                    System.out.println("Result: You lost");
                    score--;
                }
                else if (me == 2 && opponent == 0){
                    System.out.println("Result: You lost");
                    score--;
                }
                else if (me == 2 && opponent == 1){
                    System.out.println("Result: You won");
                    score+=2;
                }
                else{
                    System.out.println("Cheating");
                }
            }
        }
    }
}