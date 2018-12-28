import java.util.ArrayList;
import java.util.List;

//Generics is used to store the specific type of data or object
public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Before Generics
    List mylist=new ArrayList();
    mylist.add(1);
    mylist.add("Megha");
    Integer a=(Integer) mylist.get(0);//Typecasting
    System.out.println(a);//1
    
    
    //After Generics
    List<String> mylist1=new ArrayList();
    mylist1.add("megha");
    mylist1.add("Shelar");
    String s= mylist1.get(1);//Type casting not required
    System.out.println(s);//Shelar
	}

}
