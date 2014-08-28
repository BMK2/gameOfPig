import java.util.Scanner;


public class gameOfPig {

	public static void main(String[] args) {
		String playerOne = getUserInput("Player one, please enter your name: ");
		String playerTwo = getUserInput("Player two, please enter your name: ");
		System.out.println("Welcome " + playerOne + " and " + playerTwo);
		

	}
	public static String getUserInput(String userInputRequest) {
		System.out.print(userInputRequest);
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.next().toString();
		keyboard.close();
		return userInput;
	}

}
