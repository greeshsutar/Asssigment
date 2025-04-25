 package Assigment;
 import java.util.Scanner;

public class Matrixmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a=new int[10][10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
			{
				System.out.println(a[i][j]);
			}
		int [][] b=new int[10][10];
		Scanner sc1=new Scanner(System.in);
		for(int x=0;x<2;x++)
			for(int y=0;y<2;y++)
			{
				b[x][y]=sc.nextInt();
			}
		for(int x=0;x<2;x++)
			for(int y=0;y<2;y++)
			{
				System.out.println(b[x][y]);
			}
		System.out.println();
		
		int c=(a[0][0]*b[0][0]);
		System.out.println(c);
	    int d=(a[0][1]*b[0][1]);
		System.out.println(d);
		int e=(a[1][0]*b[1][0]);
		System.out.println(e);
		int f=(a[1][1]*b[1][1]);
		System.out.println(f);
				

	}

}
