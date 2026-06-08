package day3;

public class Inheritence {
	 int money=90000;        
	 String car="bmw";                
	 void drinking() 
	 {                
		 System.out.println("coffe");        
		 } 
	 } 
class  Inheritence2 extends Inheritence
{        
	String cycle="pink";                
	void read() 
	{                
		System.out.println("java");       
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritence i =new Inheritence();        
		 i.drinking();        
		 Inheritence2 i2 =new Inheritence2();        
		 System.out.println(i2.money);        
		 System.out.println(i2.car);        
		 i2.drinking();        
		 System.out.println(i2.cycle);        
		 i2.read(); 

	}

}
