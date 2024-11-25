import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car teslaCar = new Car("Tesla", "Model 3", "Red", 0, 6);
        Car hondaCar = new Car("Honda", "Accord", "Blue", 10, 4);
        Scanner timeScan = new Scanner(System.in);
        System.out.print("Enter the length of time: ");
        int timeLength = timeScan.nextInt();
        timeScan.close();
        simRace(timeLength, teslaCar, hondaCar);
        // Simulate Race
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
