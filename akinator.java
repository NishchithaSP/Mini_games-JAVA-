import java.util.Scanner;

public class Akinator {
	
	static int ch;
	static Scanner sc=new Scanner(System.in);
	
	void test()
	{
		
		System.out.println("\nThink of any faculty...\n");
		System.out.println("Is the faculty male?");
		System.out.println("1:Yes  2:No");
		ch=sc.nextInt();
		
		switch(ch)
		{
				case 1:male(); 
						break;
				case 2:female();
						break;
				default:System.out.println("Invalid choice"); playAgain();
		}
	}
	
	static void male()
	{
		System.out.println("Did your teacher think of a class outing around Christmas?");
		System.out.println("1:Yes  2:No");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1: System.out.println("Does he teach 'Data Structure' subject?"); 
					System.out.println("1:Yes  2:No");
					ch=sc.nextInt();
					
					switch(ch)
					{
						case 1: System.out.println("You were thinking about Dr.Mohemmed Tajuddin \n"); 
								playAgain();
								break;
						case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
								playAgain();
								break;
						default:System.out.println("Invalid choice"); playAgain();
					}
					break;
			case 2:System.out.println("Does he teach about Constitution of India?" );
					System.out.println("1:Yes  2:No");
					ch=sc.nextInt();
					
					switch(ch)
					{
						case 1: System.out.println("You were thinking about Sugurappa Marinal sir \n"); 
								playAgain();
								break;
						case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
								playAgain();
								break;
						default:System.out.println("Invalid choice"); playAgain();
					}
					break;
			default:System.out.println("Invalid choice"); playAgain();
		}
		
	}

	static void female()
	{
		System.out.println("Does your teacher wear spectacles?");
		System.out.println("1:Yes  2:No");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:System.out.println("Did she recently conduct student seminar on 'Emerging Technologies'?");
				System.out.println("1:Yes  2:No");
				ch=sc.nextInt();
				
				switch(ch)
				{
					case 1: System.out.println("You were thinking about Dr.Vindhya M \n"); 
							playAgain();
							break;
					case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
							playAgain();
							break;
					default:System.out.println("Invalid choice"); playAgain();
				}
				break;
		case 2:System.out.println("Did your teacher insist you to get your laptops to the class inorder to practice the subject?");
				System.out.println("1:Yes  2:No");
				ch=sc.nextInt();
									
				switch(ch)
				{
					case 1:System.out.println("Does she take 'Object Oriented Programing in Java' subject?");
						System.out.println("1:Yes  2:No");
						ch=sc.nextInt();
						
						switch(ch)
						{
							case 1: System.out.println("You were thinking about Prof.Asnika S\n"); 
									playAgain();
									break;
							case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
									playAgain();
									break;
							default:System.out.println("Invalid choice"); playAgain();
						}
						break;
					case 2:System.out.println("Does your teacher say that she would throw the phone out if she finds anyone using it?");
							System.out.println("1:Yes  2:No");
							ch=sc.nextInt();
												
							switch(ch)
							{
								case 1:System.out.println("Does she take 'Discrete Mathematics' subject?");
										System.out.println("1:Yes  2:No");
										ch=sc.nextInt();
															
										switch(ch)
										{
											case 1: System.out.println("You were thinking about Prof.Savitri\n"); 
													playAgain();
													break;
											case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
													playAgain();
													break;
											default:System.out.println("Invalid choice"); playAgain();
										}
										break;
								case 2:System.out.println("Did your teacher take the orientation for your class on the first day of the 2nd year?");
										System.out.println("1:Yes  2:No");
										ch=sc.nextInt();
										
										switch(ch)
										{
											case 1:System.out.println("Is this teacher your class teacher?");
													System.out.println("1:Yes  2:No");
													ch=sc.nextInt();
															
													switch(ch)
													{
														case 1:System.out.println("Does she take 'Computer Organization' subject?");
																System.out.println("1:Yes  2:No");
																ch=sc.nextInt();
																
																switch(ch)
																{
																	case 1: System.out.println("You were thinking about Prof.Annaporna B.R\n"); 
																			playAgain();
																			break;
																	case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
																			playAgain();
																			break;
																	default:System.out.println("Invalid choice"); playAgain();
																}
																break;
														case 2:System.out.println("Does your teacher take a subject that deals with grammar and machine language?");
																System.out.println("1:Yes  2:No");
																ch=sc.nextInt();
																		
																switch(ch)
																{
																	case 1:System.out.println("Does she take 'Automata Theory and Formal Languages' subject?");
																			System.out.println("1:Yes  2:No");
																			ch=sc.nextInt();
																			
																			switch(ch)
																			{
																				case 1: System.out.println("You were thinking about Prof.Prameeta Pai\n"); 
																						playAgain();
																						break;
																				case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
																						playAgain();
																						break;
																				default:System.out.println("Invalid choice"); playAgain();
																			}break;
																	case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");
																			playAgain();
																			break;
																	default:System.out.println("Invalid choice"); playAgain();
																}break;
														default:System.out.println("Invalid choice"); playAgain();
													}break;
											case 2:System.out.println("Oops...Maybe such faculty doesn't exist\n");playAgain();
													break;
											default:System.out.println("Invalid choice"); playAgain();
										}break;
								default:System.out.println("Invalid choice"); playAgain();
							}break;
					default:System.out.println("Invalid choice"); playAgain();
				}break;
			default:System.out.println("Invalid choice"); playAgain();
		}
	}


	public static void playAgain() 
	{
		System.out.println("Do you want to play again?");
		System.out.println("1:Yes  2:No");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1: Akinator t=new Akinator();
				t.test();
				break;
		case 2:System.out.println("Thank you!!");
				break;
		default:System.out.println("Invalid choice"); playAgain();		
		}
	}
}

