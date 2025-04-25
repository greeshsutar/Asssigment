package Assigment;

import java.util.Scanner;

public class Passfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num;
			  Scanner reader = new Scanner(System.in);
			  System.out.println("Enter score: ");
			  num = reader.nextInt();
			  
			  if (num>=35) //passing critaria is above 35
			  {
			   System.out.println("Pass!");
			  }
			  else
			   System.out.println("Fail!");
		

	}

}
