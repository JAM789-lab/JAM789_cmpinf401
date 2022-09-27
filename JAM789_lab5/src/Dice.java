import java.util.Random;
import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		String input;
		
		do {
			System.out.print("Enter the amount of times you want to roll the dice: ");
			input = scan.nextLine();
			count = Integer.parseInt(input);
			
			rollDice(count, rand);
			
			System.out.print("Would you like to roll the dice again(y/n)?: ");
			input = scan.nextLine();
		}while(!(input.equalsIgnoreCase("n")));
		scan.close();
	}
	
	public static void rollDice(int count, Random rand) {
		int roll, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, c11 = 0, c12 = 0;
		for(int i = 0; i < count; i++) {
			roll = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
			
			switch (roll){
				case 2:
					c2++;
					break;
				case 3:
					c3++;
					break;
				case 4:
					c4++;
					break;
				case 5:
					c5++;
					break;
				case 6:
					c6++;
					break;
				case 7:
					c7++;
					break;
				case 8:
					c8++;
					break;
				case 9:
					c9++;
					break;
				case 10:
					c10++;
					break;
				case 11:
					c11++;
					break;
				case 12:
					c12++;
					break;
			}
			
		}
		System.out.println("There are " + c2 + " 2's out of " + count + " total rolls.");
		System.out.println("There are " + c3 + " 3's out of " + count + " total rolls.");
		System.out.println("There are " + c4 + " 4's out of " + count + " total rolls.");
		System.out.println("There are " + c5 + " 5's out of " + count + " total rolls.");
		System.out.println("There are " + c6 + " 6's out of " + count + " total rolls.");
		System.out.println("There are " + c7 + " 7's out of " + count + " total rolls.");
		System.out.println("There are " + c8 + " 8's out of " + count + " total rolls.");
		System.out.println("There are " + c9 + " 9's out of " + count + " total rolls.");
		System.out.println("There are " + c10 + " 10's out of " + count + " total rolls.");
		System.out.println("There are " + c11 + " 11's out of " + count + " total rolls.");
		System.out.println("There are " + c12 + " 12's out of " + count + " total rolls.");
		
	}

}
