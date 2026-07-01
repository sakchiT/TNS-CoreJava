package demoexception;

public class DemoThrowkeyword {
		// demo for throw keyword (ATM)
	public class ExceptionExample {

	    // A method that checks age before allowing access
	    public static void checkAge(int age) {
	        if (age < 18) {
	            // "throw" is used to manually trigger the exception
	            throw new IllegalArgumentException("Access denied - You must be at least 18 years old.");
	        } else {
	            System.out.println("Access granted!");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            // This will trigger the exception because 15 is less than 18
	            checkAge(15); 
	        } catch (IllegalArgumentException e) {
	            // Catching and handling the thrown exception
	            System.out.println("Caught an exception: " + e.getMessage());
	        }
	    }
	}
}
