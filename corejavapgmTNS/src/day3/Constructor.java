package day3;

public class Constructor {
	Constructor(){                
		  System.out.println("welcome to java");                
		  System.out.println("default");        
		  }        
	Constructor(int a,int b)
	  {                
	   System.out.println("2 parameter ");        
	  }        
	Constructor(String s)
	  {               
		System.out.println("one parameter");        
	  }       
	Constructor(int a,String f)
	  {               
		System.out.println("mixed parameter");                        
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c =new Constructor ();                
		Constructor c1=new Constructor (2,"roshan");                
		Constructor c2=new Constructor (2,5);                
		Constructor c3=new Constructor("raghu");                        

	}

}
