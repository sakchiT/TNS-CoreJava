package day2;

public class Encapsulation {
	 int serialnumber;// properties or data member        
	 String name; // Declaration         
	 int age;                
	 void show() {  // member function                 
		 System.out.println(serialnumber +" "+name+" "+age);        
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		               
		 Encapsulation e=new Encapsulation();               
		 e.serialnumber=9;                
		 e.name="Ramesh";                
		 e.age=56;                                
		 e.show();       
		 } 
	}
		 
