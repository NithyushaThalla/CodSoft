import java.util.Scanner;
public class ATM
{
	double balance=0.00;
	Scanner sc=new Scanner(System.in);
	void checkBalance(){
		System.out.println("Your Total Balance:"+balance);
	}
	void withdraw(){
		System.out.println("Enter your amount to be withdrawed.");
		int amount=sc.nextInt();
		if (amount>0 && amount<balance)
		{
			balance-=amount;
			System.out.println("withdrawed:"+amount);
			System.out.println("Current Balnace: "+balance);
		}
		else if(balance==0){
			System.out.println("Insufficient Balance.");
		}
		else{
			System.out.println("Error!invalid amount.");
		}
	}
	void deposit(){
		System.out.println("Enter your amount to be deposited.");
		int amount=sc.nextInt();
		balance+=amount;
		if(amount>0){
		System.out.println("Deposited:"+amount);
		System.out.println("Current Balance:"+balance);
		}
		else{
			System.out.println("Error!Enter the positive amount");
		}
	}
	 
	public static void main(String[] args)
	{
		ATM atm=new ATM();
		int choice;
		System.out.println("Welcome to ATM!!.");
		do{
			System.out.println("Enter your choice:"+'\n'+"1.Check Balance"+'\n'+"2.Withdraw"+'\n'+"3.Deposit"+'\n'+"4.exit");
			choice=atm.sc.nextInt();
			switch(choice){
				case 1:
					atm.checkBalance();
					break;
				case 2:
					atm.withdraw();
					break;
				case 3:
					atm.deposit();
					break;
				case 4:
					System.out.println("Exiting.....");
					System.out.println("Thank you!!!");
					break;
				default:
					System.out.println("Invalid choice.please enter a valid choice.");
			}
			}while(choice!=4);
			atm.sc.close();
	}
}
	