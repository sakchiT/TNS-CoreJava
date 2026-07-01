package day8;
//demo for parameter

//functional interface

interface Cube{
	int calculate(int a); 
}

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		synatx of lambda expression
		Cube c=(a)->{return (a*a*a);};//it is int so return
		System.out.println("cube of a number :"+c.calculate(3));

	}

}
