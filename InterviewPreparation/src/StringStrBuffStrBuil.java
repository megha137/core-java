
public class StringStrBuffStrBuil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*String is immutable means once string object is created 
		its data or state can’t be changed but a new string object is created.*/  
     String str="Megha";
     String str1="Shelar";
     str1=str1+str;//When we concatenate two string objects then it will create a new object in memory
      //str=str+"shelar";
      System.out.println(str1);
      
      /*StringBuffer is mutable 
      StringBuffer is synchronized 
      StringBuffer is thread-safe*/
      StringBuffer bf=new StringBuffer("Megha");
      bf.append("Shelar");
      System.out.println(bf);
      
      /*StringBuilder is mutable
      StringBuilder is not synchronized
      StringBUlider is not thread safe
      StringBUilder is faster than stringbuffer*/
      StringBuilder sb=new StringBuilder("Megha ");
      sb.append("Shivaji Shelar");
      System.out.println(sb);
	}

}
