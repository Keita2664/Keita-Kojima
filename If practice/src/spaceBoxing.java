import java.util.Scanner;

public class spaceBoxing {
    public static void main(String[] args){

        System.out.print("Please enter your current earth weight: ");
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        System.out.println("I have information for the following planets:");
        System.out.println("Which planet are you visiting? ");
        System.out.println("[1] Venus\t[2] Mars\t[3] Jupiter\n[4] Saturn\t[5] Uranus\t[6] Neptune");
        Scanner scanner1 = new Scanner(System.in);
        int choice = scanner.nextInt();


        double venus, mars, jupiter, saturn, uranus, neptune;
        venus = weight * 0.78;
        mars = weight * 0.39;
        jupiter = weight * 2.65;
        saturn = weight * 1.17;
        uranus = weight * 1.05;
        neptune = weight * 1.23;


        if (choice == 1){
            System.out.println("Your weight would be " + venus);
        }
        else if(choice == 2){
            System.out.println("Your Weight would be " + mars);
        }
        else if (choice == 3){
            System.out.println("Your weight would be " + jupiter);
        }
        else if (choice == 4){
            System.out.println("Your weight would be " + saturn);
        }
        else if (choice == 5){
            System.out.println("Your weight would be " + uranus);
        }
        else if(choice == 6){
            System.out.println("Your weight would be " + neptune);
        }
        else{
            System.out.println("That planet does not exist");
        }
    }
}
