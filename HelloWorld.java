import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        Scanner inputWatch = new Scanner(System.in);
        // input user's name
        System.out.print("Enter your name: ");
        String name  = inputWatch.nextLine();
        System.out.print("How many times do you want to print your name: ");
        int count = inputWatch.nextInt();
        while(count > 0) {
            System.out.println(name);
            count -= 1; // count = count - 1
        }
        inputWatch.close();
    }
}

