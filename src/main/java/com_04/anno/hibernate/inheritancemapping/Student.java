package com_04.anno.hibernate.inheritancemapping;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@Table(name="Students")
@Inheritance(strategy=InheritanceType.JOINED)
public class Student {
	
@Id
@GeneratedValue
@Column(name="Sid")
private int sid;

@Column(name="sname")
private String sname;

@Column(name="city")
private String city;

@Column(name="status")
private String status;

@Column(name="totalfee")
private double totalfee;

@CollectionOfElements
@JoinTable(name="Emails",joinColumns=@JoinColumn(name="Sid"))
@IndexColumn(name="idx")
@Column(name="EmailId")
@LazyCollection(LazyCollectionOption.FALSE)
@ElementCollection(targetClass=String.class)
private List<String> emails;


@CollectionOfElements
@JoinTable(name="Phone",joinColumns=@JoinColumn(name="Sid"))
@IndexColumn(name="idx")
@Column(name="Phones")
@LazyCollection(LazyCollectionOption.FALSE)
@ElementCollection(targetClass=Long.class)
private Set<Long> phones;


public Student(){}


public Student( String sname, String city, String status,
		double totalfee, List<String> emails, Set<Long> phones) {
	super();
	this.sname = sname;
	this.city = city;
	this.status = status;
	this.totalfee = totalfee;
	this.emails = emails;
	this.phones = phones;
}


public int getSid() {
	return sid;
}


public void setSid(int sid) {
	this.sid = sid;
}


public String getSname() {
	return sname;
}


public void setSname(String sname) {
	this.sname = sname;
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


public double getTotalfee() {
	return totalfee;
}


public void setTotalfee(double totalfee) {
	this.totalfee = totalfee;
}


public List<String> getEmails() {
	return emails;
}


public void setEmails(List<String> emails) {
	this.emails = emails;
}


public Set<Long> getPhones() {
	return phones;
}


public void setPhones(Set<Long> phones) {
	this.phones = phones;
}

}
