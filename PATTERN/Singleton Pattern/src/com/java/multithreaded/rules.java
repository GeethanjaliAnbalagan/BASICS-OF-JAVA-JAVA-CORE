package com.java.multithreaded;
public class rules {
	public static void main(String[] args) {
		
		/*A obj = new A();
		int b = obj.a;
		System.out.println(b);
		A obj1 = new A();
		
		*/
		A obj = A.getInstance();
		A obj1 = A.getInstance();
		int b = obj.a;
		System.out.println(b);
		}}
class A
{
	private static A obj;
	int a = 10;
	//static A obj = new A();
	private A()
	{
		}
	public static A getInstance()
	{
		return obj;
	}}