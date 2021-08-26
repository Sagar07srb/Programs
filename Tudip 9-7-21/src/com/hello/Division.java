package com.hello;
import java.util.*;
final class Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%3==0)
			System.out.println("hello");
		
		if(n%5==0)
			System.out.println("world");
		
		if(n%3==0 && n%5==0)
			System.out.println("helloworld");
	}

}
