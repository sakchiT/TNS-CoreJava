package strings;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="sushma";
        String s2="SUSHMA";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        
        
             //demo for == operator
/**
             String s1="kusuma";
             String s2="kusuma";
             String s3=new String("kusuma");
             String s4="Kishor";
             System.out.println(s1==s2);
             System.out.println(s1==s3);
             
             **/
        
     // demo for CompareTo method
     /**
                String s1="rohan";
                String s2="rohan";
                String s3="sushma";
                
                System.out.println(s1.compareTo(s2));
                System.out.println(s1.compareTo(s3));
                System.out.println(s3.compareTo(s1));
        **/
	}

	}
	   