package day3;

public class Constructor2 {
	 String name;        
	 int age;                
	 //Default const        
	 Constructor2(){                
		 name="Guest";                
		 age=5;                
		 System.out.println("Guest profile created");        
		 }        
	 //parameter const                
	 Constructor2(String name,int age){                
		 this.name=name;                
		 this.age=age;               
		 System.out.println("User creaed :"+"name "+ name +" "+ "Age :"+age);       
		 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 u=new Constructor2();        
		Constructor2 c2=new Constructor2("alice",25);        

	}

}
