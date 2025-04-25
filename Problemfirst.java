package Assigment;

import java.util.Scanner;

public class Problemfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method 
 Scanner input = new Scanner(System.in);
 System.out.println("enter the first number:");
 int num1 = input.nextInt();
 System.out.println("enter the second number:");
 int num2 = input.nextInt();
 System.out.println("enter the operator:");
 char operator = input.next().charAt(0);
 switch(operator) {
  case '+':
int a   = num1+num2;
System.out.println("addiction:"+a);
	  break;
  case '-':
	  int b   = num1-num2;
	  System.out.println("subtraction:"+b);
	  break;
  case '*':
	  int c   = num1*num2;
	  System.out.println("multiplication:"+c);
	  break;
  case '/':
	  int d  = num1/num2;
	  System.out.println("division:"+d);
	  break;
  case '%':
	  int e = num1%num2 ;
	  System.out.println("Modulus:"+e);
	  break;
  default:
	  System.out.println("false");
	  	  
 
 }
 

	}

}
