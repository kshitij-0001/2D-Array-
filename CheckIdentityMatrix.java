package Array2D;
import java.util.Arrays;
import java.util.Scanner;

/* Check Identity Matrix
 
 Check whether a given square matrix is an Identity Matrix.*/

public class CheckIdentityMatrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of row: ");
		int row=sc.nextInt();
		System.out.println("Enter the length of row: ");
		int column=sc.nextInt();
		
		int arr[][]=new int [row][column];
		boolean flag=true;
		
		if(row!=column) {
			System.out.println("This Is Not Identity Matrix");
		}
		else {
			System.out.println("Enter the element of Matrix: ");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(i==j&&arr[i][j]!=1) {
						flag=false;
						break;
					}
					if(i!=j&&arr[i][j]!=0) {
						flag=false;
					}
				}
			}
			
			if(flag) {
				System.out.println("Matrix is Identity Matrix!");
			}
			else {
				System.out.println("It Is Not Identity Matrix!");
			}
		}
	}

}
