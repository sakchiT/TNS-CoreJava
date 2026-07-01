package day8;

interface Drawable{
	public void draw();  //abstract method
}

class Test implements Drawable{
	int width=10;
	public void draw() {
		System.out.println("drawing "+width);
	}
}

public class WithoutLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Test();
		d.draw();

	}
}
