package mypackage;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAJAP to read 5 number from user and find sum and avg?
		
		int[] data =  new int[5];
		Scanner obj = new Scanner(System.in);
		int sum=0, avg;
		//Read the input from User
		for(int i=0;i<data.length;i++) {
			System.out.println("Enter Number");
			data[i] = obj.nextInt();
		}
		for(int d: data) 
			sum +=  d;
		
		avg = sum/data.length;
		
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + avg);

	}

}
