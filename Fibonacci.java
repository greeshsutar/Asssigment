package Assigment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int firstNum = 0;
		int secondNum = 1;
		System.out.println("Fibonacci series "+n+ " term");
	 for (int i =1; i<=n; i++){
		 // next number computation
		 System.out.println(firstNum +" ");
		int nextNum = firstNum +secondNum;
		 firstNum =secondNum;
		 secondNum = nextNum;
		
	 }

	}

}
