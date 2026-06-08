package day4;
class Calculator
{ 
	int add(int a,int b) 
	{                
		return a+b;                        
	}        
	double add(double c,double d) 
	{                
		return c+d;                        
	}        
	int add(int a,int b,int h) 
	{                
		return a+b+h;                        
	}
} 
                                

public class Methodoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		System.out.println(c.add(3.2, 4.5));
		System.out.println(c.add(1, 4));
		 System.out.println(c.add(1, 2, 3));
	}
}
