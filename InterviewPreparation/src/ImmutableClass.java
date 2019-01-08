/*Immutable means once the object is created ,we can't change its content
All the wrapper classes and String class is Immutable
1.Class must be final
2.All data members of the class must be declared as final
3.No setter method 
4.getter methods for all the data members
5.Parameterized constructor
Immutable object are automatically thred safe*/

public final class ImmutableClass {
  
	final String name;
	final int no;
	
	ImmutableClass(String name, int no) {
	   this.name = name;
		this.no = no;
	}
	
public String getName() {
		return name;
	}
public int getNo() {
		return no;
	}

}
