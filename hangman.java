import java.util.Random;
import java.util.Scanner;

public class HangMan
{
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int g =0 ;
        String Dic[] = {"car","apple","orange","laptop","instagram","snapchat","traffic","metro","moon","chocolate","food"
                            ,"sneakers","perfume","water","cloud","house","skyscrapers","commonsense","comb","smile"
                        ,"mirror"};
        String Dic1[] = {"_ _ _","_ _ _ _ _","_ _ _ _ _ _","_ _ _ _ _ _","_ _ _ _ _ _ _ _ _","_ _ _ _ _ _ _ _","_ _ _ _ _ _ _"
                           , "_ _ _ _ _","_ _ _ _","_ _ _ _ _ _ _ _ _","_ _ _ _","_ _ _ _ _ _ _ _","_ _ _ _ _ _ _","_ _ _ _ _"
                        ,"_ _ _ _ _","_ _ _ _ _","_ _ _ _ _ _ _ _ _ _ _","_ _ _ _ _ _ _ _ _ _ _","_ _ _ _","_ _ _ _ _"
                            ,"_ _ _ _ _ _"};
        System.out.println("Welcome to Hangman!!\nlets test your vocabulary Shall we??!!\n");
        for(int i =0 ;i<5;i++) //For 5 Words
        {
            if(i==1)
            {
                System.out.println("Lets Try Another Word!");
            }
            if(i==2)
            {
                System.out.println("Lets Try Another Word!");
            }if(i==3)
            {
                System.out.println("Lets Try Another Word!");
            }
            if(i==4)
            {
                System.out.println("How About this 1?");
            }
            if(i>4)
            {
                System.out.println("Last Word!");
            }
            int wg=0;//counts the number of wrong  guesses
            int cc=0;//counts the number of letters entered are correct
            int a = r.nextInt(Dic.length);
            String word = Dic1[a];
            String wordCheck = Dic[a];
            char word2[] = word.toCharArray();
            System.out.println(word);
            while(wg<=4)
            {
                int rg=0;
                System.out.println("Enter a letter\n\tNumber of Guesses Left : "+ (5-wg));
                char c = sc.next().charAt(0);
                for(int j = 0; j<wordCheck.length();j++)// Checking Entered Character Present or Not
                {
                    if(c==wordCheck.charAt(j))
                    {
                        word2[2*j] = c;
                        rg++;
                        cc++;
                        g++;
                    }
                }
                System.out.println(word2);
                if(cc==wordCheck.length())
                {
                    System.out.println("GG");
                    break;
                }
                if(rg==0)
                {

                    System.out.println("Wrong Guess");
                    wg++;
                }
            }
            if(wg==5)
            {
                System.out.println("OH NOOOO!!!\n You have lost this round better luck Next time!!");
                break;
            }
        }
                // displaying the score of the player
        int B = g*50;
                System.out.println("Well that was a good Game. \nYour Score is: "+ B);
        int HighScore = 500;
                if (B>=500)
                {
                    HighScore =B;
                    System.out.println("Congratulations You have set a new Highscore "+B);
                }
                else {
                    System.out.println("The HighScore is " + HighScore);
                }
        System.out.println("\t\t\tThanks For playing See You Again!");
    }
}


