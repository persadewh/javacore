package com.ray.object;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author : ray
 * @date : 2017年4月21日
 */
public class ObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 日期处理类
		 * 
		 * UTC:1970年1月1日 00:00:00
		 * 
		 * 表示时间点的Date类
		 * 日历表示法的GregorianCalendar类,Calendar类
		 */
		GregorianCalendar now = new GregorianCalendar();
		System.out.println(now.getTime());
		Calendar	cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		//example
		GregorianCalendar deadline = new GregorianCalendar(2017, 11, 31, 1, 2, 3);//月份是从0开始，所以11代表12月
		System.out.println(deadline.getTime());
		
		System.out.println(cal.getTime().before(deadline.getTime()));
		
		
		
	}

}
