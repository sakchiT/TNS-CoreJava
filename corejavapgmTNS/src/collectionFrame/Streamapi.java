package collectionFrame;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		



// demo for without stream api

        // original list of numbers
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        // list to hold the result
        
        List<Integer> result=new ArrayList<>();
        
        //iterare over each number in original list
        
        for(Integer number:numbers) {
                //check if the number is even
                if(number%2==0) {
                        int doubled =number*2;
                                        result.add(doubled);
                        }
        }
        System.out.println("doubled even number :"+result);
        
}
}

