import java.util.*;
class numberguess
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int min=1,max=100;
        int randomnumber=random.nextInt(max-min+1)+min;
        int attempts=0;
        boolean guessedcorrectly=false;
        System.out.println("Welcome to the number guessing game");
        System.out.println("I have selected a number between "+min+" and "+max);
        while(!guessedcorrectly)
        {
            System.out.println("Enter your guess: ");
            int guess=sc.nextInt();
            if(guess>max)
            {
                System.out.println("Error");
                break;
            }
            else
            {
            attempts++;
            if(guess<randomnumber)
            System.out.println("Low! try a higher number");
            else if(guess>randomnumber)
            System.out.println("High! try a lower number");
            else
            {
            guessedcorrectly=true;
            System.out.println("Congratulations! You won the game.");
            System.out.println("You guessed the number "+randomnumber+" in "+attempts+" attempts.");
            }
        }
        }
    }
}