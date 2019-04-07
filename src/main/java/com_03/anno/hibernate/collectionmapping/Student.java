package com_03.anno.hibernate.collectionmapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.CollectionType;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;





@Entity
@Proxy(lazy=false)
@Table(name="student")
@Inheritance(strategy=InheritanceType.JOINED)
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name="Sid")
	private int sid;
	
	@Column(name="Fname")
	private String fname;
	
	@Column(name="Lname")
	private String lname;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Status")
	private String status;
	
	
	@CollectionOfElements
	@JoinTable(name="Emails",joinColumns=@JoinColumn(name="Sid"))
	@IndexColumn(name="idx")
	@Column(name="EmailId")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection(targetClass=String.class)
	private List <String> emails;
	
	
	@CollectionOfElements
	@JoinTable(name="Marks",joinColumns=@JoinColumn(name="Sid"))
	@IndexColumn(name="idx")
	@Column(name="Marks")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection(targetClass=Integer.class)
	private List <Integer> marks;
	
	@CollectionOfElements
	@JoinTable(name="Courses",joinColumns=@JoinColumn(name="Sid"))
	@IndexColumn(name="idx")
	@Column(name="Courses")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	private String[] courses;
	
	@CollectionOfElements
	@JoinTable(name="Phone",joinColumns=@JoinColumn(name="Sid"))
	@IndexColumn(name="idx")
	@Column(name="Phones")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection(targetClass=Long.class)
	private Set <Long> phones;
	
	

	@CollectionOfElements
	@JoinTable(name="Refs",joinColumns=@JoinColumn(name="Sid"))
	@IndexColumn(name="idx")
	@Column(name="Refs")
	@LazyCollection(LazyCollectionOption.FALSE)
	@ElementCollection
	private Map <String,Long> refs;


	public Student(){}
	public Student(String fname, String lname, String city,
			String status, List<String> emails, List<Integer> marks,
			String[] courses, Set<Long> phones, Map<String, Long> refs) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.status = status;
		this.emails = emails;
		this.marks = marks;
		this.courses = courses;
		this.phones = phones;
		this.refs = refs;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public Map<String,Long> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	
	
	
}
