package day6;
//demo for nested interface 
   /**                                                                      
public class Myinterface {
	void calculateArea() ;
	//nested interface
	 interface MyInnerInterface{ 
		 int id=45;
		 void print();        
		  }
	 }

	**/

/**
public class Nestedinterface implements Myinterface.MyInnerInterface
{ 
	@Override
	public void print()
	{ 
		System.out.println("welcome to java"); 
	} 
	public static void main(String[] args) 
	{ 
		Nestedinterface n=new Nestedinterface(); 
		n.print();
		 System.out.println(n.id); 
		System.out.println(Nestedinterface.id); 
		} 
	}
**/