import java.util.Scanner;

public class howOldAreYou {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry I keep forgetting.)");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("OK," + name + ", " + "how old are you?");
        System.out.print("Age: ");
        int age = scanner.nextInt();

        if(age < 16){
            System.out.println("You can't drive. " + name);
        }
        else if(age >= 16 && age <= 17){
            System.out.println("You can drive but not vote. " + name);
        }
        else if(age >= 18 && age <= 24){
            System.out.println("You can vote but not rent a car. " + name);
        }
        else{
            System.out.println("You can do pretty much anything. " + name);
        }
    }
}
