package collectionFrame;
import java.util.ArrayList;
import java.util.List;

public class Demolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        List<String> f=new ArrayList<String>();
		        f.add("Apple");
		        f.add("Mango");
		        f.add("Orange");
		        
		        f.add("orange");
		        f.add("Mango");
//		        f.add(9);
		        
		        System.out.println(f);
		        //get
		        System.out.println(f.get(0));
		        System.out.println(f);
		        
		        //modify element
		        f.set(1, "Dragan");
		        System.out.println(f);
		        
		        for(String h:f) {
		                System.out.println(h);
		        }
		        
		        
		        f.remove(0);
		        System.out.println(f);
		        
		        f.clear();
		        System.out.println(f);
		}

	}


