import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Random rdm=new Random();
    int s=rdm.nextInt(100);
    for(int i=1;i<=3;i++){
      System.out.println("Round "+i+"!!!");
      System.out.print("you: ");
      int n=sc.nextInt();
      {
        if(s==n)
        {
          System.out.println("your guess is correct.yahoo!!!");
          }
          else if(s<n)
          {
            System.out.println("Too high");
          }
          else if(s>n)
          {
            System.out.println("Too low");
          }
      }
    }
    System.out.println("your chances are completed");
    System.out.println("Sorry!Better luck next time!!!");
    System.out.println("System's choice: "+s);
  }
}