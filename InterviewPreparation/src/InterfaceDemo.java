import java.io.IOException;

class Class1
{
	int a=10;
	public void play() throws Exception
	{
		System.out.println("In CLass1");
	}
	public void display()
	{
		System.out.println("in desp");
		
	}
}
class Class2 extends Class1
{
	int a=20;
	public void play() throws  IOException
	{
		System.out.println("in Class2");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) throws Exception //throws Exception
	{
		// TODO Auto-generated method stub
    Class1 obj=new Class2();
    obj.play();//in class2
    System.out.println(obj.a);//10
	}

}
