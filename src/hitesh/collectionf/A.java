package hitesh.collectionf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);//Insertion order is maintained
		al.add(20);//Duplicate is Allowed
		al.add(30);//null value is allowed
		al.add(40);//internal ds is growable array
		al.add(50);//default sizee is 10
		al.add(60);//it is not syncronized
		al.add(70);//both Homogeneous & hetrogeneous allowed
		al.add(80);
		al.add(90);
		al.add(100);
		al.add(10);
	    al.add(250);
		al.add(200);
		al.add(11111111);
		System.out.println(al.get9(6));
		Hitesh Kumar Nayak
		
		System.out.println(al);
		System.out.println(al.indexOf(10));
		System.out.println(al.lastIndexOf(10));
		System.out.println(al.get(4));
		al.add(1, 110);
		System.out.println(al);
		al.set(0, 120);
		System.out.println(al);
		al.add(0, 150);
		
		
		System.out.println("=====For loop");
		for(int i =0;i<al.size();i++) {
			}
		System.out.println(al);
		
		System.out.println("=====for Each===== ");
		for(Integer i :al) {
			System.out.println(i);
		}
		
		System.out.println("====Using Iterator====");
		
		Iterator<Integer> iterator = al.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				
				System.out.println("====Using ListIterator=====");
				
				ListIterator<Integer> listIterator = al.listIterator();
				while(listIterator.hasNext()){
					System.out.println(listIterator.next());
					
				}
				
				
	}

}
