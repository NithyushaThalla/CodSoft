import java.util.*;
class StudentGrade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total_marks=0;
        double average_percentage=0;
        char Grade;
        System.out.println("Enter number of subjects.");
        int n=sc.nextInt();//number of subjects
        int[] marks=new int[n];
        System.out.println("Enter your marks.");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();//entering the marks as an array
        }
        for(int i:marks){
            total_marks+=i;
        }
        average_percentage=total_marks/n;
        System.out.println("Total marks: "+total_marks+" ("+"out of "+n*100+")");
        System.out.println("Average Percentage: "+average_percentage+" %");
        if(average_percentage>=90){
            Grade='A';
        }
        else if(average_percentage<90  && average_percentage>=75){
            Grade='B';
        }
        else if(average_percentage<75 && average_percentage>=50){
            Grade='C';
        }
        else if(average_percentage<50 && average_percentage>=40){
            Grade='D';
        }
        else{
            Grade='F';
        }
        System.out.print("Grade: "+Grade);
    }
}