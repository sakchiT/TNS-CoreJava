package day6;
interface SmartDevice
{ 
	void TurnOn(); 
	void TurnOff(); 
	void Getstatus(); 
	} 
// class implementing the interface
class Smartlight implements SmartDevice
{ 
	@Override 
	public void TurnOn() 
	{ 
		System.out.println("smart light is on"); 
	} 
	@Override 
	public void TurnOff() 
	{ System.out.println("smart light is off"); 
	} 
	@Override
	public void Getstatus() 
	{ 
		System.out.println("smart light is standly mode"); 
	} 
	} 
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartlight s=new Smartlight();
		s.TurnOff();
		s.TurnOn();
		s.Getstatus();
	}

}
