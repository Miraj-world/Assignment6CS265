import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        boolean answeredCorrectly = false;
        int prevAnswer = -1; // Initialize prevAnswer to an invalid value

        while (!answeredCorrectly) {
            System.out.print("What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

            if (number1 + number2 == answer) {
                System.out.println("You got it!");
                answeredCorrectly = true;
            } else {
                if (answer == prevAnswer) {
                    System.out.println("You already entered this answer. Try again.");
                } else {
                    System.out.println("Wrong answer. Try again.");
                }
                prevAnswer = answer;
            }
        }
    }
}
