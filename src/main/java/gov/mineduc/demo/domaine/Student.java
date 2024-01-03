package gov.mineduc.demo.domaine;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private String sid;
	private String fname;
	private String lname;
	private String age;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Student(String sid, String fname, String lname, String age) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public Student() {
		super();
	}



}
