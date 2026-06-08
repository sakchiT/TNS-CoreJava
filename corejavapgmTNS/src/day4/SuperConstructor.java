package day4;
//demo for super constructor 
class User1{        
	User1()
	{               
		System.out.println("user account created..");        
		} 
	} 
class AdminUser extends User1
{        
	AdminUser()
	{                
		super(); // calls user constructor                 
		System.out.println("admin granted ");        
	}
}
public class SuperConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AdminUser a=new AdminUser(); 

	}

}
