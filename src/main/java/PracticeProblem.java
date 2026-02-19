import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char letter = 'a';
        System.out.println(letter);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input a word: ");
        String word = scanner.nextLine();

        char thirdLetter = word.charAt(2); 
        System.out.println(thirdLetter);
    
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
        
        System.out.print("Input a word: ");
        String word = input.nextLine();
        
        System.out.println("The second character user entered was: " + word.charAt(1));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = input.nextInt();

        System.out.println("Your number plus 1 is: " + (number + 1));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);

        System.out.print("Input a letter: ");
        String firstString = input.nextLine();
        char firstChar = firstString.charAt(0);

        System.out.print("Input another letter: ");
        String secondString = input.nextLine();
        char secondChar = secondString.charAt(0);

        int result = firstChar + secondChar;
		System.out.println(result);
	}

}
