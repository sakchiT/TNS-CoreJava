package demoexception;

public class DemoMutipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// multiple catch block
		
		        int number[]=new int[4];// 4 elements 0-3
		        try {
		                number[9]=50/0;
		        }
		        catch(ArithmeticException t) {
		                System.out.println("good evening"+t.getMessage());
		        }
		        catch(ArrayIndexOutOfBoundsException h) {
		                System.out.println("goodmorning"+h.getMessage());
		        }
		        catch(Exception j) {
		                System.out.println("hello world"+ j.getMessage());
		        }
		}
		}


