package ATM;
import java.util.Scanner;
public class ATM_Management {
    public static void getMenu() {
    	System.out.println("1. Deposit Money");
    	System.out.println("2. Check Balance ");
    	System.out.println("3. Withdraw Money");
    	System.out.println("4. Exit");

	}  
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance =0;
       System.out.println("===ATM Menu===");
       boolean flag =true;
       while(flag) {
    	   getMenu();
    	   System.out.print("Enter the option :");
    	   int op=sc.nextInt();
    	   switch(op) {
    	   case 1 :System.out.print("Enter the  Amount to deposit :");
    	           double ad=sc.nextInt();
    	           balance=balance+ad;
    	           System.out.println(ad+" is deposited ");
    	           break;
    	   case 2:System.out.println("Your balance is :"+balance);
    	         break;
    	   case 3:System.out.print("Enter the amount to withdraw :");
    	          int withdraw=sc.nextInt();
    	          if(withdraw >balance)System.out.println("Insuffient Balance");
    	          else {
    	          balance=balance-withdraw;
    	          System.out.println("Balance :"+balance);
    	          }
    	          break;
    	   case 4:System.out.println("Thank you .....\n visit again.....");
    	   flag=false;
    	         break;
    	   default:System.out.println("invalid choice...");
    	   
    	   }
    	   
       }
       sc.close();
	}

}
