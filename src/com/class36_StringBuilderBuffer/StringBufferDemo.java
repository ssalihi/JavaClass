package com.class36_StringBuilderBuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer sb=new StringBuffer("Hello");
		//sb.deleteCharAt(3);
		//System.out.println(sb);// the l will be deleted and result will be Helo
		
		String str="Good Morning";
		str.concat(" John");// new String ("Good Morning");
		
		System.out.println(str);// it should be Good morning, because we dont assign. String is immutable so we cannot bring any changes
		System.out.println("--------------------------------------------------------------------------------");
		StringBuffer sb=new StringBuffer("Good Morning");
		sb.append(" John");
		System.out.println(sb);
	}

}
