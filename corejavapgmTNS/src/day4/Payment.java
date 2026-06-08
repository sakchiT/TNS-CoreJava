package day4;

class Payment1{        
	void process() 
	{                
		System.out.println("processing payment using standard gateway..");        
		} 
	} 
class Gpay extends Payment1
{       
	void process() 
{                
	System.out.println("processing payment using standard gpay..");        
	}               
	void completetransation() 
	{                
		super.process();//parent class                
		process();// child class        
}
}

public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Gpay g=new Gpay();        
		 g.completetransation(); 
	}

}
