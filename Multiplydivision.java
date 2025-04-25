package Assigment;
import java.util.Scanner;

public class Multiplydivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number:"); 
		int a = input.nextInt();
		System.out.println("enter the second number:");
		int b= input.nextInt();
		int mul =0;
		System.out.println("multiplication of two number without operator:");
		for (int i =0; i<b; i++) 
		mul = mul +a;
		System.out.println(mul);
		
		// division
		int c=0;
		int d=0;
		System.out.println("enter the first number for division:");
		int x = input.nextInt();
		System.out.println("enter the second number:");
		int y = input.nextInt();
		while(x>=y) {
			c=x-y;
			d++;
			x=c;
		}
		System.out.println(d);
		
			
	}
		

}

 
