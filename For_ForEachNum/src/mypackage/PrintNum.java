package mypackage;

import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAJP to read 5 numbers from user and print the umber using for loop,foreach loop
		
		int[] data =new int[5];
		Scanner obj = new Scanner(System.in);
		//read number from user
		//in array int i  should start with 0 index
		for(int i=0;i<data.length;i++) {
			System.out.println("Enter "+ i + " Number");
			data[i] = obj.nextInt();
		}
		
		//Print number by using for loop
		System.out.println("Using For Loop");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		//Print number by using foreach loop
		System.out.println("Using ForEach Loop");
		for(int d:data) {
			System.out.println(d);
		}

	}

}
