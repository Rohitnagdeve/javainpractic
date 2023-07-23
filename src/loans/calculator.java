package loans;

public class calculator {
	
	byte by =127;
	short sh =32767;
	int i=2147483647;
	long lo=922337203685477580l;
	
	
	double db=7890.90;
	float fl=5766.98f;
	
	char ch= 'A';
	char ch1='a';
	char ch2='1';
	
	
	boolean boo1=true;
	boolean boo2=false;
	
	string str= "joe biden is arriving in austria tomorrow for NATO summit"
			
	
	
	
public static void main(String[] args) {
		
		
		new calculator();
		
		//non primative data type
		//refrance variable
		calculator calci = new calculator ();
		calculator calci1 = new calculator ();
		calculator calci2 = new calculator ();
		
		
		//calci.addition();
		
		System.out.println("the address of variable is"+calci);
	}
	
	
	public void doaddition ()  { 
		 System.out.println("addition");
		 
		 
		 
	 }
	 public void domultiply ()  {
		 
	 }	
	 public void dosubtract()	 {
		 
	 }
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
