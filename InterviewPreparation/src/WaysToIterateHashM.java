import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WaysToIterateHashM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Map<Integer,String> map=new HashMap<>();
   map.put(1, "One");
   map.put(2, "Two");
   map.put(3, "Three");
   map.put(4, "Four");
   System.out.println(map);
   //method 1
   for (Integer key : map.keySet()) {
	    System.out.println("Key = " + key);
	}
    for (String value : map.values()) {
	    System.out.println("Value = " + value);
	}
	//method 2 Using Iterator 
	Set set=map.entrySet();  
    Iterator itr=set.iterator();
    while(itr.hasNext()){
    	  Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }
    //method 3
    for (Integer key : map.keySet()) {
        String value = map.get(key);
        System.out.println("Key = " + key + ", Value = " + value);
    }
    //method 4
    for (Map.Entry entry : map.entrySet()) {
        System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
      }
    //method 5
    map.forEach((abc,xyz)->System.out.println("Item : " + abc + " Count : " + xyz));
}
}
