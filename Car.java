// The Car class - a "blueprint" of how Car objects should be defined 


public class Car {
    // "Class Variables" - the attributes of all Car objects
    private String make; // The make of the car
    private String model; // The model of the car
    private String color; // The color of the car
    private int position; // The position of the car
    private int speed;

    // Constructor
    public Car(String make, String model, String color, int position, int speed) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.position = position;
        this.speed = speed;
    }

    // Getter and Setter Methods
    public String getMake() {
        return make;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }
    
    public int getPosition() {
        return position;
    }

    public void setPosition(int newPosition) {
        this.position = newPosition;
    }

    // Add getters and setters for speed
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    // Create a method to update the position after 1 second
    public void updatePosition() {
        this.position += this.speed;
    }

    public void displayDetails(){
        System.out.println("Car Details:");
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Position: "+position);
        System.out.println("Speed: "+speed);
    }
}