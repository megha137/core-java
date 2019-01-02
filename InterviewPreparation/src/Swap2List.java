import java.util.ArrayList;
import java.util.List;
public class Swap2List {

	private static void Swapping(List l1,List l2)
	   {
		List<Integer> temp = new ArrayList<Integer>(l1);
		    l1.clear();
		    l1.addAll(l2);
		    l2.clear();
		    l2.addAll(temp);
		/*
		 * List temp=l1;
		 * l1=l2;
		 * l2=temp;
		 */
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> l1=new ArrayList();
   l1.add(1);
   l1.add(2);
   l1.add(3);
   l1.add(4);
   l1.add(5);
   System.out.println(l1);
   List<Integer> l2=new ArrayList();
   l2.add(11);
   l2.add(22);
   l2.add(33);
   System.out.println(l2);
 // Swap2List l=new Swap2List();
 Swapping(l1, l2);

  System.out.println("AFTER SWAPPING");
  System.out.println("LIST 1="+l1);
  System.out.println("LIST 2="+l2);
  
	}
}
