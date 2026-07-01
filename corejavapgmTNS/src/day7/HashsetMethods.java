package day7;

import java.util.HashSet;

//doesnt accept duplicate value
public class HashsetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s = new HashSet<>();
//		add
		s.add(1);
		s.add(9);
//		s.add(11.9); doesnt accept decimal value as integer is accepted
		s.add(199);
		System.out.println(s);
		System.out.println(s.contains(1));
		s.remove(9);
		System.out.println(s.size());
		System.out.println(s);
		
//		addAll()
		HashSet<Integer> s1 = new HashSet<>();
		s1.add(70);
		s1.add(45);
		s1.add(46);
//		s1.add(null); Hashset accept null value
		s1.addAll(s);
		
		System.out.print(s1);
		
		
		

	}

}
