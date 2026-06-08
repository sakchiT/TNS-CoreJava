package day2;

public class Encapsulation2 {
	// properties        
	private int id;        
	private String name;                
	//getter and setter method                
	public int getId() 
	{                
		return id;        
	}        
	public void setId(int id) 
	{                
		this.id = id;       
		}                
	public String getName() 
	{                
		return name;        
	}        
	public void setName(String name) 
	{                
		this.name = name;        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Encapsulation2  e2=new Encapsulation2();                                
		 //setting the value using setters                
		 e2.setId(103);                
		 e2.setName("hamsa");                                
		 //getting the values using getters                
		 System.out.println(e2.getId());               
		 System.out.println(e2.getName());        
		 }              

}
