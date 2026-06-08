package day5;
//demo for static variable


class Employee
{        
	int eid;        
	String name;        
	static String companyname="TNS";                
	// constructor               
	Employee(int e,String n)
	{                
		eid=e;                
		name=n;                
		}        
	void display() 
	{                
		System.out.println(eid+" "+name+" "+companyname);                                                                                          
}

public class Static {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"ruth");
		Employee e2=new Employee(2,"rohith");
		e1.display(); 
		e2.display(); 

	}

}
}
