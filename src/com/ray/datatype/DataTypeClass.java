package com.ray.datatype;
/**
 * @author : ray
 * @date : 2017-04-21
 */
public class DataTypeClass {

	/*
	 * 类常量
	 */
	public static final String HELLO = "Hello World";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 基本数据类型：
		 * 4种整型
		 * 2种浮点类型
		 * 1种字符类型char
		 * 1种真值类型boolean
		 * 
		 * 十六进制加前缀0x
		 * 八进制加前缀0
		 * 
		 * 从JDK7开始
		 * 二进制可以加前缀0b
		 * 数字可以用下划线分割，如:1_000_000
		 * 
		 * BigDecimal
		 */
		
		int 		int_a = 0;//4字节
		short		short_a = 0 ;//2字节
		long		long_a	= 0L;//8字节
		byte		byte_a = 0;//1字节
		
		float		float_a = 0.0f;//4字节
		double		double_a = 0.0d;//8字节	双精度
		
		char		char_a = '我';//2字节
		
		boolean		boolean_a = false;
		
		System.out.println(Character.isJavaIdentifierStart('#'));
		System.out.println(Character.isJavaIdentifierPart('#'));
		
		
		/*
		 * int i;
		 * System.out.println(i);//ERROR
		 */
		
		
		/*
		 * 常量
		 * final
		 * const是java的保留字
		 */
		final double PI = 3.14d;
		
		
	}

}
