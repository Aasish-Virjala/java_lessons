import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Car teslaCar = new Car("Tesla", "Model 3", "Red", 0, 6);
        // Car hondaCar = new Car("Honda", "Accord", "Blue", 10, 4);
        // Scanner timeScan = new Scanner(System.in);
        // System.out.print("Enter the length of time: ");
        // int timeLength = timeScan.nextInt();
        // timeScan.close();
        // simRace(timeLength, teslaCar, hondaCar);
        // Simulate Race

        // 3 types of loops

        // for, while, do-while

        // For loop
            // initialization of a "iteration" variable -- what determines what happens before and after a loop, and when to run it
            // condition to stay in the loop -- a statement that either evaluates to True or False, and determines whether we stay in the loop (True = stay, False = break)
            // iteration statement -- what should we do to the iteration variable after each run of the loop
        // for(int i = 0; i <= 8; i+=2) {
        //     System.out.println("Count: "+i);
        // }
        // System.out.println("Done with loop");

        // While loop

        // One input
            // condition statement -- if the condition statement is True, it will run, otherwise break
        
        // String name = "";
        // System.out.print("What is your name: ");
        // Scanner nameScanner = new Scanner(System.in);
        // name = nameScanner.nextLine();
        // // Fetch the name from the user using a Scanner with nextLine()
        // // set the name variable to that input
        // while(name.length() < 10) {
        //     System.out.println("Invalid Name, please try again!");
        //     // Fetch a new name from the user and put it in the name variable
        //     System.out.print("What is your name: ");
        //     name = nameScanner.nextLine();
        // }
        // nameScanner.close();
        // System.out.println("That is a valid name!");

        // do-while

        // String name = "";
        // Scanner nameScanner = new Scanner(System.in);
        // do {
        //     System.out.println("What is your name: ");
        //     name = nameScanner.nextLine();
        // } while(name.length() < 10);
        // nameScanner.close();
        // System.out.println("That is a valid name");


        // int while_loop_variable = 10;
        // do {
        //     System.out.println("Count: "+while_loop_variable++);
        // } while(while_loop_variable < 10);

        // int while_loop_variable = 10;
        // while(while_loop_variable < 10) {
        //     System.out.println("Count: "+while_loop_variable++);
        // }

        // Switch statements
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Enter a day as follows");
        System.out.println("0: Sunday");
        System.out.println("1: Monday");
        System.out.println("2: Tuesday");
        System.out.println("3: Wednesday");
        System.out.println("4: Thursday");
        System.out.println("5: Friday");
        System.out.println("6: Saturday");
        int switch_var = numberScanner.nextInt();
        numberScanner.close();
        switch (switch_var) {
            case 1:
                System.out.println("Happy Monday. Good luck at work");
                break;
            case 2:
                System.out.println("Happy Tuesday");
                break;
            case 3:
                System.out.println("Happy Hump Day! Just 2 more until you're done!");
                break;
            case 4:
                System.out.println("Happy Thursday! Just 1 more day!");
                break;
            case 5:
                System.out.println("Happy Friday!");
                break;
            case 0:
            case 6:
                System.out.println("Happy Weekend! Time to relax...");
                break;
            default:
                System.out.println("You entered an invalid day!");
            
        }
    }

    public static void simRace(int time, Car firstCar, Car secondCar) {
        // Print starting positions
        // "Car MAKE MODEL is at position: POSITION"
        System.out.println("Car "+firstCar.getMake()+" "+firstCar.getModel()+" is at position: "+ firstCar.getPosition());
        System.out.println("Car "+secondCar.getMake()+" "+secondCar.getModel()+" is at position: "+ secondCar.getPosition());
        System.out.println();

        for(int i = 0; i<time; i++) {
            firstCar.updatePosition();
            secondCar.updatePosition();
            System.out.println("At time: "+ (i+1));
            System.out.println("Car "+firstCar.getMake()+" "+firstCar.getModel()+" is at position: "+ firstCar.getPosition());
            System.out.println("Car "+secondCar.getMake()+" "+secondCar.getModel()+" is at position: "+ secondCar.getPosition());
            System.out.println();
        }
        if(firstCar.getPosition() > secondCar.getPosition()) {
            System.out.println(firstCar.getMake()+" "+firstCar.getModel() +"is the winner");
        } else {
            if(firstCar.getPosition() == secondCar.getPosition()) {
                System.out.println("It's Tied!");
            } else {
                System.out.println(secondCar.getMake()+" "+secondCar.getModel() +"is the winner");
            }
        }
    }
}
