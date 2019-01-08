package com.serializabledemo;

import java.io.Serializable;

public class SerializableDemo implements Serializable{
     int rno;
     String name;
	public SerializableDemo(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
     
}
