import java.util.Random;
import java.util.Scanner;

public class AsciiChars {

	public static void printNumbers() {
		// Write code to print 0-9
		for (char i = '0'; i <= '9'; ++i) {
			System.out.println(i);
		}
	}

	public static void printLowerCase() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCase() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {

		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String someString = scanner.next();
		System.out.print("Do you wish to continue to the interactive portion?\nType Y or N.");
		String choice = scanner.next();


		if (choice.equalsIgnoreCase("Y")) {
			while(choice.equalsIgnoreCase("Y")) {
				System.out.println("Great let's continue!");
				System.out.println("Do you have a red car? Y or N.");
				String car = scanner.next();
				System.out.print("What is the name of your favorite pet?");
				String pet = scanner.next();
				System.out.print("What is the age of your favorite pet?");
				int age = Integer.parseInt(scanner.next());
				System.out.print("What is your lucky number?");
				int luckynum = Integer.parseInt(scanner.next());
				System.out.println("Do you have a favorite quarterback? (yes / no)");
				String favQB = scanner.next();
				if (favQB.equalsIgnoreCase("yes")) {
					System.out.println("What is their jersey number?");
				}
				Integer jerseyNum = Integer.parseInt(scanner.next());
				System.out.println("What is the two-digit model year of your car?");
				Integer model = Integer.parseInt(scanner.next());
				System.out.println("What is the first name of your favorite actor/actress?");
				String actor = scanner.next();
				int randomNum = 0;
					while(1 > randomNum || randomNum > 50) {
						System.out.println("Enter a random number between 1 and 50:");
						randomNum = Integer.parseInt(scanner.next()); 
					}
				Random randomGenerator = new Random();
				int magic = 0;
				for (int i=0; i<3; i++) {
					magic = randomGenerator.nextInt(145) +1;
					System.out.println(magic);
				}
				magic *= luckynum;
				magic = clampNumber(magic, 1, 75);
				Lottery(model,luckynum, age, jerseyNum, randomNum, magic);
				System.out.print("Do you want to play again for new numbers?\nType Y or N.");
				choice = scanner.next();
			}
			return;
		} else {
			System.out.println("Please return later to complete the survey.");
		}
		
	}

	public static int clampNumber(int value, int start, int end) {
		int range = end - start + 1;
		while (value > end) {
			value -= range;
		}
		while (value < start) {
			value += range;
		}
		return value;
	}
	public static void Lottery(int model, int luckynum, int age, int jerseyNum, int randomNum, int magic) {
		int number1 = model + luckynum;
		int number2 = 42;
		int number3 = age + jerseyNum + luckynum; 
		int number4 = age + model; 
		int number5 = randomNum;
		System.out.println("Lottery numbers: " + number1 + " "+ number2 + " "+ number3 + " "+ number4 + " "+ number5 + " Magic Ball: " + magic);
		return;
	}  
		
}		
