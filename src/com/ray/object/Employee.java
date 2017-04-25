package com.ray.object;

import java.util.Date;

/**
 * @author : ray
 * @date : 2017年4月25日
 * 
 * @since	version 1.0
 * @version	1.0
 * @deprecated 不再使用
 * @see
 */
public class Employee {

	//instance fields
	private String name;
	private double salary;
	private Date hireday;
	
	//constructor
	public Employee(String name,double salary,Date hireday)
	{
		this.name = name;
		this.salary = salary;
		this.hireday = hireday;
	}

	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHireday() {
		/*
		 *类似这种情况，返回的是对象类型，但不应该在其他地方进行修改的可变域成员，应该使用clone，防止在其他地方被修改 
		 */
		//return hireday;
		return (Date) hireday.clone();//此处返回的是副本
	}

	public void setHireday(Date hireday) {
		this.hireday = hireday;
	}
	
	/**
	 * 
	 * @param byPercent
	 * @return void
	 * @throws null
	 */
	public void raiseSalary(double byPercent)
	{
		double raise = this.salary * byPercent / 100;
		this.salary = this.salary  + raise;
	}
}
