package day8;
//demo for lambda expression

interface Drawable{
	public void draw();
}


public class WithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width =10;
//		/with lambda
		
		Drawable d =()->{System.out.println("Drawing "+width);};
//		           argumenttoken arrow     implementation
		d.draw();

	}

}
