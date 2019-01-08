package com.serializabledemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemoMain implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		SerializableDemo sd=new SerializableDemo(101,"Megha");
		//sd.name="ss";
		//sd.rno=11;
		//String file="abc.txt";
		FileOutputStream fos=new FileOutputStream("C:m.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(sd);
		System.out.println("run succes");
		System.out.println(System.getProperty("user.dir"));
		//sd.rno=200;
		System.out.println(sd.rno);
		System.out.println(sd.name);
		//sd=null;
		
		FileInputStream f1 = new FileInputStream("C:m.txt"); 
        ObjectInputStream in = new ObjectInputStream(f1);
        sd = (SerializableDemo)in.readObject(); 
        System.out.println(sd.rno);
	}

}
