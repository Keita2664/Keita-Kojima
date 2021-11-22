import java.sql.SQLOutput;
import java.util.Scanner;

public class MC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready for a quiz?");
        System.out.println("press 1 for Yes or press 2 for No");
        int respond = scanner.nextInt();
        String quiz1 = "Which is the second highest mountain in the world?";
        String quiz2 = "How many Continents do we have in the map?";
        String quiz3 = "Do you recognize hot dogs as vegetable?";

        int score = 0;
        int Yes = 1;
        int No = 2;
        if (respond == Yes){
            System.out.println("Let's start the quiz!");
        }
        else if(respond == No){
            System.out.println("You have no choice other than start the quiz right now!!!");
        }
        else{
            System.out.println("You fail.");
        }

        System.out.println(quiz1);
        System.out.println("1) Everest\n2) Nanga Parbat\n3) K2");
        Scanner scanner1 = new Scanner(System.in);
        int answer1 = scanner1.nextInt();

        if (answer1 == 3){
            System.out.println("That's right!");
            score++;
        }
        else{
            System.out.println("No. K2 has the height of 8,611m and is the second highest mountain");
        }

        System.out.println(quiz2);
        System.out.println("1) 7 continents\n2) 8 continents\n3) 6 continents");

        Scanner scanner2 = new Scanner(System.in);
        int answer2 = scanner2.nextInt();

        if(answer2 == 3){
            System.out.println("That's right!");
            score++;
        }
        else{
            System.out.println("No. Atlantis is no longer existing");
        }

        System.out.println(quiz3);
        System.out.println("1) Yes\n2) No");
        Scanner scanner3 = new Scanner(System.in);
        int answer3 = scanner3.nextInt();

        if (answer3 == 2){
            System.out.println("That's right");
            score++;
        }
        else {
            System.out.println("Good For YOU!!!");
        }
        System.out.println("You got" + " " + score + " " + "out of 3!");
    }
}
