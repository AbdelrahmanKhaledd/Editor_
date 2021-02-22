package textgen;

import java.util.List;

public class main {
	public static void  main(String []args )
	{
		MyLinkedList<Integer>l = new MyLinkedList<Integer>();
		l.add(3);
		l.add(5);
		l.add(8);
		for(int i =0 ;i<3 ;i++)
			System.out.println(l.get(i));
		l.add(1,3);
		l.add(0,99);
		
		for(int i =0 ;i<l.size ;i++)
			System.out.println(l.get(i));
	
		l.remove(3);
		for(int i =0 ;i<l.size ;i++)
			System.out.print(l.get(i)+" ");
	
	}

}
