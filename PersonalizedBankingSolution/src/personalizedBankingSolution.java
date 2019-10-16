import java.util.Scanner;

public class personalizedBankingSolution {
int accountnumber;
String name;
int depositamt;
private int a;

public void insert(int ac, String n, int d) {
	accountnumber = ac;
	name=n;
	depositamt=d;
	}

public void displayinfo() {
	System.out.println("Account Number ->"+accountnumber+" "+" | Name of the Account Holder ->"+name+" "+" | Total Deposit Amount ->"+depositamt);
	}

public void withdraw() {
	System.out.println("Enter the amount to be withdrawn");
	Scanner in = new Scanner(System.in);
a=in.nextInt();
	if(a<=depositamt) {
		System.out.println(a+" Amount has been Withdrawn available balance is "+(depositamt-a));
		}
	else 
	{
		System.out.println("Insufficient balance!");
	}
}

public void deposit() {
	int d;
	System.out.println("Enter the amount to be deposited");
	Scanner in1 = new Scanner(System.in);
	d=in1.nextInt();
int depamt = d+depositamt;
System.out.println("Net Available Balance -> "+depamt);
}


public static void main (String args[]) {
	
	personalizedBankingSolution bd = new personalizedBankingSolution();	
	bd.insert(294845,"John",124000);
	System.out.println("Please enter the number against the service you wish to obtain Enter \n 1 -> To display info Enter \n 2 -> Withdraw Enter \n 3 -> Deposit money"); 
	Scanner in2 = new Scanner(System.in);
int y = in2.nextInt();
switch(y) {
case 1:bd.displayinfo();
break;
case 2: bd.withdraw();
break;
case 3: bd.deposit();
break;
}
}
}
