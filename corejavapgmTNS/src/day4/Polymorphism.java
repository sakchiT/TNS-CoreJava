package day4;
//method overriding
class Payment
{                
	Payment()
	{                        
		
	}        
	void makepayment() 
	{                
		System.out.println("processing payment using method");        
		} 
	} 
//subclass 
class UPIPayment extends Payment
{        
	UPIPayment()
{
	
}
	//Contractor cant override                                       
	@Override        
	void makepayment() 
	{                
		System.out.println("payment using UPI");        
		}        
	} 
class CardPayment extends Payment
{        
	@Override        
	void makepayment() 
	{                
		System.out.println("payment using credit card");        
		}        
	} 
                                    
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UPIPayment u=new UPIPayment();
		 u.makepayment(); 
		 CardPayment v=new CardPayment();
		 v.makepayment();

	}

}
