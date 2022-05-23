package collection;

	import java.util.ArrayList;
	import java.util.List;

	public class Demo_ArrayList {

		public static void main(String[] args) {

			
			//List
			
			//- List interface is child interface of collection interface 
			// - List works on index basics
			// - List can allow duplicate and null value insertion
			
			
			// - ArrayList
			//- works on index basics
			//- can allow duplicate and null value insertion
			// Underling data structure of AL is dynamic array
			// - default capacity of AL is 10 and incremental capacity is update by formula = currentCap*3/2+1
			
			// ArrayList is best choice for retrieval operation because
			// 1 - it works on index basics
			// 2 - it is implemented by RandomAccess interface
			
			
			//List  al=new ArrayList<>();
			
			ArrayList al=new ArrayList();
			
			al.add("ABC");
			al.add(10);
			al.add(null);
			al.add('A');
			al.add(10.23);
			al.add(10);
			al.add(null);
			
			System.out.println(al.size());
			
			System.out.println(al.get(0));
			al.add(5,102);
			System.out.println(al.get(4));
			
			System.out.println(al);
			
			System.out.println();
			for(int i=0;i<al.size();i++) {
				System.out.println(al.get(i));
			}
			
			
			//System.out.println(al.get(8));
		}

	}

