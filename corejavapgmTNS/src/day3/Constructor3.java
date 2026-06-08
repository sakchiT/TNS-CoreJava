package day3;

public class Constructor3 {
	 int id; 
	 String name; 
	 Constructor3(int id,String name )
	 {        this.id=id;        
	 this.name=name; 
	 } 
	 void display() 
	 {        
		 System.out.println("ID :"+id);        
		 System.out.println("Name :"+name); 
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor3 s=new Constructor3(101,"surya");        
		Constructor3 c1=new Constructor3(103,"yurya");        
		 //boolean output=s1.(instanceof)Student();        
		 s.display();        
		 c1.display(); 
	}

}
