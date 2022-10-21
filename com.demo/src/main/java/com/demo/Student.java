package com.demo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "Student")
@Table(name = "STUDENT")
public class Student {

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "native")
//	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "ID")
	private Long studentId;

	@Column(name = "FNAMEE", nullable = false)
	private String firstName;

	@Column(name = "LNAME", unique = true, length = 25)
	private String lastName;

	@Column(name = "CONTACT_NO", length = 15)
	private String contactNo;
	

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNo=" + contactNo + "]";
	}
	
}