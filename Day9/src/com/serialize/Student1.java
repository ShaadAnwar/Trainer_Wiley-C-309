package com.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public class Student1 implements Serializable {
	String name;
	Double gpa;
	transient Date dt;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	public Date getDt() {
		return dt;
	}
	public void setDt(Date dt) {
		this.dt = dt;
	}
	

	Student1(String name, Double gpa, Date dt) {
		this.name = name;
		this.gpa = gpa;
		this.dt = dt;
		System.out.println(dt.dd);
	}
	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("GPA: " + this.gpa);
		System.out.println("Date: " + this.dt);
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();// For default serialization of Student class
		// Adding current year to the registration number

		// serialization of regNo
		oos.writeInt(this.getDt().getDd());
		oos.writeInt(this.getDt().getMm());
		oos.writeInt(this.getDt().getYy());
		//oos.writeObject("");
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
	{
		ois.defaultReadObject();////For default deserialization of Student class
		
		this.dt=new Date(ois.readInt(),ois.readInt(),ois.readInt());
		
//		
	}

	
}