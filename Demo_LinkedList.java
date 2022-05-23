package collection;


	import java.util.LinkedList;
	import java.util.List;

	public class Demo_LinkedList {

		//LinkedList
		// - its works on index basis
		//- it allow duplicates and null values
		// - it preserve insertion order
		
		// there is no any default capacity
		// Underling data structure is Linear List
		// it is best choice for 00(add, delete,update in - between) operation
		
		public static void main(String[] args) {
			
			//List ll=new LinkedList();
			
			LinkedList  ll=new LinkedList();
			
			ll.add("ABC");
			ll.add(10);
			ll.add(null);
			ll.add('A');
			ll.add(10.23);
			ll.add(10);
			ll.add(null);
			
			System.out.println(ll.size());
			
			System.out.println(ll);
			
			ll.add(5, "Ramesh");
			
			for(int i=0;i<ll.size();i++) {
				System.out.println(ll.get(i));
			}
				
		}
	}

