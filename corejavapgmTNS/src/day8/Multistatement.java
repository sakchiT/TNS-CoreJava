package day8;
//parameter

interface Parameter{
	String say(String message); //abstract method
}

public class Multistatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parameter p=(message)->{
			String str1="i would like to say, ";
			String str2=str1+message;
			return str2;
		};
		System.out.println(p.say("time is precious"));
	}

}
