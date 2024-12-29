import java.util.Scanner;

public class heyy {

    public static void main(String[] args){
        System.out.println("heyy");
        
        // Loop to print numbers from 0 to 8
        for (int i = 0; i < 9; i++) {
            System.out.println(i);
        }
        
        // Initialize Scanner object correctly
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); // This reads an integer input from the user
        System.out.println("You entered: " + num);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
