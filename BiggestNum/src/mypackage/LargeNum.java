package mypackage;

import java.util.Scanner;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[5];
		Scanner obj =new Scanner(System.in);
		
		//read value from user
		for(int i=0;i<data.length;i++) {
			System.out.println("Enter number");
			data[i] = obj.nextInt();
			
		}
		int temp=data[0];
		for(int d:data) {
			if(d>temp) {
				temp=d;
			}
		}
		System.out.println("biggest value "+ temp);

	}

}
