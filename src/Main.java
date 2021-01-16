import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        String question = "What is the capital of New York?";
        String choiceOne = "new york city";
        String choiceTwo = "albany";
        String choiceThree = "buffalo";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne + ", " + choiceTwo + ", or " + choiceThree);
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.next().toLowerCase();
        if (userChoice.equals(correctAnswer)) {
            System.out.println("That is correct! Congratulations!");
        } else {
            System.out.println("Sorry, that is incorrect. The capital of New York is " + correctAnswer);
        }
    }

}
