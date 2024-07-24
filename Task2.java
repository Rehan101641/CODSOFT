//---------->STUDENT GRADE CALCULATOR<------------

import java.util.Scanner;
public class Task2 {
    private static String Grade="";
    private static int sum=0;
    private static float Average;

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter the number of subject");
        int n=sc.nextInt();
        int Mark[]=new int[n];
        System.out.println("Enter The MArks");
        for(int i=0;i<n;i++)
        {
            Mark[i]=sc.nextInt();
        }
        //Calculating  Total Marks
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Mark[i];
        }
        //Calculating Average Percent
        Average=sum/n;

        //Assigning Grade According To Percentage
        
        if(Average>=90 && Average<100)
        {
            Grade ="Grade A";
        }
        else if(Average>=80&&Average<90)
        {
             Grade ="Grade B";
        }
        else if(Average>=70&&Average<80)
        {
             Grade ="Grade C";
        }
        else if(Average>=60&&Average<70)
        {
             Grade ="Grade D";
        }
        else if(Average>=50&&Average<60)
        {
             Grade="Grade E";
        }
        else if(Average>=40&&Average<50)
        {
             Grade="Just Pass";
        }
        else{
             Grade="Fail";
        }
        
        //Display Result
        System.out.println("Total Marks-->"+sum);
        System.out.println("Aveage Percentage -->"+Average+"%");
        System.out.println("Grade Of the Student-->"+Grade);
    }
}
