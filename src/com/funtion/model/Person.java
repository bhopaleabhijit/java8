package com.funtion.model;

public class Person {
private int id;
private String name;
private int age;
private String department;
private int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person(int id, String name, int age, String department, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.department = department;
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
			+ "]";
}

}
