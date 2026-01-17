package Array2D;
import java.util.Scanner;
import java.util.Arrays;

/*Largest Element in Each Row
 
 Find the largest element from each row of a matrix.*/


public class LargestElementInTheRow {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter row length:");
		int row=sc.nextInt();
		
		System.out.println("Enter column length:");
		int column=sc.nextInt();
		
		int arr[][]=new int [row][column];
		
		System.out.println("Enter the Array Element:");
		
		int largest=arr[0][0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				 arr[i][j]=sc.nextInt();
				 if(arr[i][j]>=largest) {
					 largest=arr[i][j];
				 }
			}
			System.out.println("largest value is"+largest);
		}
	}
}
