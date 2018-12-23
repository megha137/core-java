import java.util.Scanner;

public class Swap2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter Two NUmber");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Befor Swapping:\nA="+a+"\nB="+b );
      //Without using third variable
      a=a+b;
      b=a-b;
      a=a-b;
      //using third variable
      int temp=a;
      a=b;
      b=temp;
      System.out.println("After Swapping:\nA="+a+"\nB="+b);
	}

}
