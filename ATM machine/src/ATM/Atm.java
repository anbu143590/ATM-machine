package ATM;
import java.util.*;
public class Atm {
	private float balance;
	private int pin= 2004;
	Scanner scanner = new Scanner(System.in);
	Atm(float b)
	{
		balance=b;
		firststep();
	}
	
	void firststep()
	{
		System.out.println("WELCOME TO HDFC ATM");
		System.out.println("PLEASE INSERT YOUR ATM CARD AND THEN PRESS 1:");
		int press= scanner.nextInt();
		if(press==1)
		{
			pinverification();
		}
		else
		{ 
			System.out.println("INVALID ACTION");
			firststep();
		}
		
	}
	 
	
      void pinverification()
      {
    		System.out.println("ENTER YOUR 4 DIGIT PIN:");
    		int userpin = scanner.nextInt();
    		if(userpin==pin)
    		{
    			menu();
    		}
    		else
    		{
    	      for(int i=1;i<=4;i++)
    		    {
    	    	  System.out.println("INVALID PIN");
    	    	  need();
    	    	  
    		    }
    	      System.out.println("ATM IS LOCKED NOW , DUE TO YOUR UNAUTHORIZED ACTION/ATTEMPTS");
    	    }
      }
      void need()
	  {
		  int userpin = scanner.nextInt();
  		if(userpin==pin)
  		{
  			menu();
  		}
	  }
      void menu()
      {
    	  System.out.println("ENTER YOUR CHOICE GIVEN BELOW");
    	  System.out.println("1. CHECK A/C BALANCE");
    	  System.out.println("2. WITHDRAWAL OF AMOUNT");
    	  System.out.println("3. DEPOSITE YOUR AMOUNT");
    	  System.out.println("4. EXIT");	
    	  int choice = scanner.nextInt();
    	  
    	  switch(choice)
    	  {
    	  case 1:
    		  checkbalance();
    		  break;
    	  
    	  case 2:
    	      withdrawal();
    	      break;
    	  case 3:
    		  deposite();
    		  break;
    	  case 4:  
    		  Exit();
    		  break;
    	  default:
    		  System.out.println("ENTER THE VALID CHOICE");
    		  break;
          }
      
     }
     
    void checkbalance()
    {
    	System.out.println("YOUR BALANCE IS" +" " + balance );
    	
    	formain();
    }
     
    void formain()
    {   System.out.println("ENTER 1 - MAIN MENU");
    	int value = scanner.nextInt();
    	if(value==1)
    	{
    		menu();
    	}
    	else
    	{
    		System.out.println("WRONG INPUT");
    		formain();
    	}
    }
    
    void withdrawal()
    {
    	System.out.println("ENTER THE WITHDRAWAL AMOUNT");
    	float withdrawalAmount = scanner.nextFloat();
    	if(withdrawalAmount > balance)
    	{
    		System.out.println("OOPS! SORRY, INSUFFCIENT A/C BALANCE");
    		System.out.println("PRESS 1 FOR MAIN MENU OR PRESS 2 FOR TRY AGAIN WITHDRAWAL");
    		int m = scanner.nextInt();
    		if(m==1)
    		{
    			menu();
    		}
    		else
    		{
    			withdrawal();
    		}
    		
    	}
    	else
    	{
    		balance=balance-withdrawalAmount;
    		System.out.println("SUCCESSFULLY WITHDRAWAL");
    		formain();
    	}
    }
    
    void deposite()
    {
    	System.out.println("ENTER THE DEPOSITE AMOUNT:");
    	float depositeAmount = scanner.nextFloat();
    	balance=balance+depositeAmount;
    	System.out.println("MONEY DEPOSITED SUCCESSFULLY");
    	formain();
    	
    }
    
    void Exit()
    {
    	System.out.println("THANKS FOR VISITING HDFC ATM, PLEASE REMOVE YOUR ATM CARD NOW.......");	
    }
    
}
