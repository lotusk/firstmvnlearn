package com.lotus.java;

import java.util.HashMap;
import java.util.Map;

import com.lotus.scala.ScaRational;

public class MyTest {
	private String a="hello";
	public void say(){
		System.out.println(a);
	}
	public void test(MyTest b){
		System.out.println(b.a);
	}
	
	public void $say(){
		//真的可以啊
	}
	
	public static void main(String[] args) {
		 ScaRational a=new ScaRational(3);
		 System.out.println("a "+a );
		( new MyTest()).test(new MyTest());

        //test.
		//ScaRational.a()
		Map<String, ? extends Number> map = new HashMap<String, Integer>();
	//	map.put("1",new Float());
	}
}