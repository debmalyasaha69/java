import java.util.*;
class studentgradecalculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the number of students: ");
        int studentsnum=sc.nextInt();
        sc.nextLine();
        String studentname[]=new String[studentsnum];
        double grades[]=new double[studentsnum];
        for(i=0;i<studentsnum;i++)
        {
          System.out.println("Enter student name "+(i+1)+" : ");
          studentname[i]=sc.next();
        
          System.out.println("Enter grade for "+studentname[i]+" : ");
          grades[i]=sc.nextDouble();
          sc.nextLine();
        }
        for(i=0;i<studentsnum;i++)
        {
            if(grades[i]>=100){
            System.out.println("error");
            break;
        }
            else
            {
        
        
        double totalgrade=0;
        for(double grade:grades)
        {
            totalgrade+=grade;
        }
        double avggrade=totalgrade/studentsnum;
        System.out.println("Students information and grade: ");
        for(i=0;i<studentsnum;i++)
        {
            System.out.println(studentname[i]+" : "+grades[i]);
        }
        System.out.println("Average grade: "+avggrade);
        }
        }
    }
}