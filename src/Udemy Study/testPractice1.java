import java.util.Random;
import java.util.Scanner;

public class testPractice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 0;
        int max = 100;
        Random r = new Random();
        int secret = r.nextInt(max-min) + min;
        System.out.println("The secret number is:" +secret);

        while (true){
            System.out.print("Make a guess(between " + min + " and " + max + "): ");
            int guess = s.nextInt();

            if(guess < min || guess >max){
                System.out.println("Please make a valid guess.");
                continue;
            }

            if(guess == secret){
                System.out.print("You Win! The secret is " + secret);
                break;
            } else if (guess < secret) {
                min = guess;
            } else {
                max = guess;
            }
        }
    }
}
