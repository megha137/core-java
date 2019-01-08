/*Wrapper class convert primitive data type into object and object into primitive
 * Autoboxing
 * Unboxing
 * 8 types of wrapper classes..Integer,Boolean,Character,Byte,Float,Double,Short,Long
 * 
 * */
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=2;
     Integer i=a;//Autoboxing..primitive to object
     System.out.println(i);
     Integer b=new Integer(10);
     int j=b;//Unboxing ..object to primitive
     System.out.println(j);
	}

}
