//----------->NUMBER GAME<-----------

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        int Max_Incorrect_Guess=5;
        int Incorrect_Guess=0;
        //Generating a Random number between 0 to 100
        Random rand=new Random();
        int n=rand.nextInt(101);
        Scanner  s=new Scanner(System.in);
        while (true) {
            //Asking user to enter guess number
            System.out.println("Enter Your Guess Number Between 0 to 100");
            int guess=s.nextInt();
            if(guess==n)
            {
                System.out.println("Correct Guess YOu Won :)\nThe Number Was--> "+n);
                break;
            }
            else if(guess < n)
            {
                System.out.println("Incorrect Guess \nToo Low Guess");
                Incorrect_Guess++;
                System.out.println("Guess Left-->"+(Max_Incorrect_Guess-Incorrect_Guess));
            }
            else 
            {
                System.out.println("Incorrect Guess \nToo High");
                Incorrect_Guess++;
                System.out.println("Guess Left-->"+(Max_Incorrect_Guess-Incorrect_Guess));
            }
            if(Max_Incorrect_Guess==Incorrect_Guess)
            {
                System.out.println("You Lost The Game :(\nThe Number Was-->"+n);
                break;
            }
        }
        s.close();
    }
}
