import java.util.Scanner;

public class LetsPlay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("WELCOME!\nWhich Game do you Wish to Play?!\n1.Akinator\n2.RPG Game\n3.Hangman");
			int input = sc.nextInt();
			System.out.println();
			switch (input)
			{
			case 1:
			{
				Akinator aki = new Akinator();
				aki.test();
				break;
			}
			case 2:
			{
				RPG rpg = new RPG();
				rpg.run();
				break;
			}
			case 3:
			{
				HangMan hang=new HangMan();
				hang.run();
				break;
			}
			default:
			{
				System.out.println("Wrong Choice!");
			}
			}
		System.out.println("Would you Like to Play Another Game?");
		String input1=sc.next();
		while (!input1.equals("yes") && !input1.equals("no"))
		{
			System.out.println("Invalid Input!");
			input1 = sc.nextLine();
		}
		if (input1.equals("yes")) 
			continue;
		else if (input1.equals("no"))
			break;
		}
		System.out.println("Thank you for playing");
	}
}

