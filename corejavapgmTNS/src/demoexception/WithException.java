package demoexception;

public class WithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			        try {
			                System.out.println(7/0);
			        }
			        catch(ArrayIndexOutOfBoundsException n) {
			                System.out.println(n.getMessage());
			        }
			        finally {
			                System.out.println("am a king");
			        }
			}
			}

