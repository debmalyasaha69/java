import java.util.*;
class calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n1=sc.nextInt();
        System.out.print("Enter the number: ");
        double n2=sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for remainder");
        System.out.println("Enter 6 to find the greater number");
        System.out.println("Enter 7 to find the smallest number");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        if(choice==1)
        System.out.println("The sum is: "+(n1+n2));
        else if(choice==2)
        System.out.println("The difference is: "+(n1-n2));
        else if(choice==3)
        System.out.println("The product is: "+(n1*n2));
        else if(choice==4)
        System.out.println("The quotient is: "+(n1/n2));
        else if(choice==5)
        System.out.println("The remainder is: "+(n1%n2));
        else if(choice==6)
        {
           if(n1>n2)
           System.out.println(n1+" is greater than "+n2);
           else
           System.out.println(n2+" is greater than "+n1);
        }
        else if(choice==7)
        {
            if(n1<n2)
            System.out.println(n1+" is smaller than "+n2);
            else 
            System.out.println(n2+" is smaller than "+n1);
        }
        else
        System.out.println("Invalid input");
    }
}