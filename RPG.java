import java.util.Scanner;

import java.util.Random;

class RPG
{
	 Scanner sc = new Scanner(System.in);
	 Random rand = new Random();

	// Start Variables.
	String[] enemies = { "Demon", "Ghost", "Assassin", "Ninja", "Skeleton" };
	 int health = 100; // Player Health.
	 int numHealthPotions = 3; // Health Potions.
	 int heal = 30; // Heal Amount.
	 int enemiesDefeated = 0; // Enemies Defeated.
	 boolean revive = true; // Check if the Revive has been used up.
	 int enemyHealth;
	 String enemy;

	public void newEnemy() {
		System.out
				.println("-------------------------------------------------------------------------------------------");

		enemyHealth = (rand.nextInt(20)) + 40; // Enemy Health Randomized in the Range 40-60.
		enemy = enemies[rand.nextInt(enemies.length)]; // Random Enemy Selected.
		System.out.println("\t" + enemy + " has appeared!");
	}

	public void stats() {
		// Stats
		System.out.println("\tYour Heath: " + health);
		System.out.println("\t" + enemy + "'s Health: " + enemyHealth);
		System.out.println("\n\tWhat would you like to do?");
		System.out.println("\t1. Attack!");
		System.out.println("\t2. Heal!");
		System.out.println("\t3. Run!");
	}

	public void attackEnemy() {
		int enemyAttack = (rand.nextInt(10)) + 10; // Enemy Attack Randomized in the Range 10-20.
		int attack = (rand.nextInt(10)) + 20; // Player Attack Randomized in the Range 20-30.

		enemyHealth -= attack; // Player Attacks Enemy.

		System.out.println("\t> You dealt " + attack + " damage to " + enemy + ".");
		if (enemyHealth > 0) { // Enemy Hits only when it is Alive.
			health -= enemyAttack;
			System.out.println("\t> You receive " + enemyAttack + " damage from the " + enemy + ".\n");
		}
	}

	public void healPlayer() {
		if (numHealthPotions > 0) {
			health += heal; // Adds to Player Health.
			numHealthPotions--; // Uses one Heal Item.
			System.out.println("\t> You drink the Health Potion and Heal for " + heal + " HP!");
			System.out.println("\t> You now have " + health + " HP!");
			System.out.println("\t> You now have " + numHealthPotions + " Health Potions remaining!\n");
		} else {
			System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!\n");
			System.out.println(
					"\t-------------------------------------------------------------------------------------------");
		}
	}
	
	public void run()
	{
		GAME: while (true) // Game Running.
		{
			newEnemy();
			stats();
			ENEMY: while (enemyHealth > 0) {
				String input = sc.nextLine();
				if (input.equalsIgnoreCase("attack") || input.equalsIgnoreCase("1")) // ATTACK.
				{
					attackEnemy();
					if (health < 1) // When Partial Dead.
					{
						System.out.println("\t># Your ass has been whooped a lot, You Pass Out. #\n");
						break ENEMY;
					}
					if (enemyHealth > 1) // When Enemy Alive skips the "Enemy Defeated " Message.
					{
						stats();
						continue ENEMY;
					}
					break;
				} else if (input.equalsIgnoreCase("heal") || input.equalsIgnoreCase("2")) // HEAL.
				{
					healPlayer();
					stats();
					continue ENEMY;
				} else if (input.equalsIgnoreCase("run") || input.equalsIgnoreCase("3")) // RUN.
				{
					if (rand.nextInt(2) != 0) // 50% Chance to run.
					{
						System.out.println("\t# You have successfully run away! #");
						continue GAME; // Gives New Enemy.
					} else {
						System.out.println("\t# Too Slow! #");
						stats();
						continue ENEMY; // Fail to Run. Back to the Same Enemy.
					}
				} else // INVALID CHOICE.
				{
					System.out.println("Invalid choice!");
				}
			}
			if (health < 1)
				if (numHealthPotions == 0) // Cannot be Revived.
				{
					System.out.println("\nYou dead bich!");
					break GAME; // GAME OVER.
				} else // Checks if can be Revived.
				{
					if (revive == true) // Can be Revived.
                    {
                        System.out.println("As you have a spare health potion and you have not been revived previously,you can choose to be revived.");
                        System.out.println("Do you Wish to Continue?");
                        String input = sc.nextLine();
                        while(!input.equals("yes") && !input.equals("no"))
                        {
                        System.out.println("Wrong Choice!");
                        System.out.println("Type 'yes' for Revival and 'no' to DIE!");
                        input=sc.nextLine();
                        }
                        if (input.equalsIgnoreCase("yes")) // Choose to be Revived. 
                        {
                            System.out.println("Very Well. Good Luck");
                            health = 30;
                            numHealthPotions--;
                            revive = false;
                            continue GAME; // Gives New Enemy.
                        } 
                        else if(input.equalsIgnoreCase("no"))
                        {
                            System.out.println("You have used your chance to be revived. You ded bich");
                            break GAME; // Out of the Game.
                        }
                    }
				}
			// Enemy Defeated
			System.out.println(
					"-------------------------------------------------------------------------------------------");
			System.out.println(" # " + enemy + " was defeated! #");
			System.out.println(" # You have " + health + " HP left!\n");
			enemiesDefeated++;

			if (rand.nextInt(100) < 25) // Health Potion Drop Chance -25%
			{
				numHealthPotions++;
				System.out.println("The " + enemy + " dropped a Health Potion!");
				System.out.println("You now have " + numHealthPotions + " health Potion(s)!\n");
			}

			System.out.println(
					"-------------------------------------------------------------------------------------------");
			System.out.println("What would you like to do?");
			System.out.println("1. Continue Fighting!");
			System.out.println("2. Exit.\n");

			String input = sc.nextLine();

			while (!input.equals("1") && !input.equals("2")) {
				System.out.println("Invalid Input!");
				input = sc.nextLine();
			}
			if (input.equals("1")) {
				System.out.println("\t\t# Good Luck! #");
			} else if (input.equals("2")) {
				System.out.println("\t# Better Luck Next Time! #");
				break;
			}
		}
		System.out.println("\nYou Killed " + enemiesDefeated + " Enemies!");
		System.out.println("\t# GAME OVER #");
	}
}
