package day3;
import java.util.Scanner;

public class Taxincome {
	 private String name;        
	 private int income;        
	 private int tax;                
	 // getter and setter               
	 public String getName() 
	 {                
		 return name;        
	 }        
	 public void setName(String name) 
	 {                
		 this.name = name;        
	}        
	 public int getIncome() 
	 {                
		 return income;        
	}        
	 public void setIncome(int income) 
	 {                
		 this.income = income;        
	}        
	 public int getTax() 
	 {                
		 return tax;        
	}        
	 public void setTax(int tax) 
	 {                
		 this.tax = tax;        
	}                
	 //to string         
	 @Override        
	 public String toString() 
	 {                return "Person [name=" + name + ", income=" + income + ", tax=" + tax + "]";        
	 }   
	 public class Taxcalculation {        
		 public void calculatetax(Taxincome t) 
		 {                                
			 if(t.getIncome()<=2000) 
			 {                        
				 t.setTax(0);                
			}                
			 else if(t.getIncome()>=2000 && t.getIncome()<=50000) 
			 {                        
				 t.setTax(5);                
			}                
			 else 
			 {                        
				 t.setTax(10);                
				 }       
			 } 
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the person name"); 
		String name=sc.nextLine(); 
		System.out.println("enter the income"); 
		int income=sc.nextInt(); 
		Taxincome ti = new Taxincome(); //object 
		
		ti.setName(name); 
		ti.setIncome(income); 
		Taxcalculation tc = new Taxcalculation(); // object 
		tc.calculatetax(ti); 
		System.out.println("after tax calculation "); 
		System.out.println(ti); 
		} 
}

