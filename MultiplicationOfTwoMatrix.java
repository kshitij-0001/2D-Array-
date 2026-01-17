 package Array2D;
import java.util.Scanner;
import java.util.Arrays;

/*Matrix Multiplication
 
 Multiply two matrices if possible and print the resulting matrix.*/

public class MultiplicationOfTwoMatrix {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		//taking input from user for First array row and column length
		System.out.println("Enter The Length Of Row & Column for Array1: ");
		int lenRow=sc.nextInt();
		int lenColumn=sc.nextInt();
		
		//taking input from user for Second array row and column length
		System.out.println("Enter The Length Of Row & Column for Array2: ");
		int lenRow2=sc.nextInt();
		int lenColumn2=sc.nextInt();
		
		//initilization value of both the Arrays
		int arr[][]=new int [lenRow][lenColumn];
		int arr2[][]=new int [lenRow2][lenColumn2];
		
		//check Condition for No.(row) of first Array ==  No.(Column) of Second Array
		if(lenRow!=lenColumn2) {
			System.out.println("Invalid Matrix!");
			
			//otherwise print Arrays
		}
		else {
			//Fetching Array element from user input
			System.out.println("Enter Element for Matrix 1: ");
			for(int i=0;i<lenRow;i++) {
				for(int j=0;j<lenColumn;j++) {
					 arr[i][j]=sc.nextInt();
				}
			}
			//print Array one
			System.out.println("the Mtrix you Entred is : ");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(" "+arr[i][j]+" ");
				}
				System.out.println("");
			
		}
			//Fetching Array element from user input
			System.out.println("Enter Element for Matrix 2:");
			for(int i=0;i<lenRow2;i++) {
				for(int j=0;j<lenColumn2;j++) {
					 arr2[i][j]=sc.nextInt();
				}
			}
			//print Array Two
			System.out.println("The Mtrix you Entred is ");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					System.out.print(" "+arr2[i][j]+" ");
				}
				System.out.println("");	
		}
			//create another Array for Storing values of both the Arrays multiplication
			int outputMatrix[][]=new int [lenRow][lenColumn2];
			
			//find the product
			for(int i=0;i<lenRow;i++) {
				for(int j=0; j<lenColumn2;j++) {
					
					//values store in outputMatrix [][]
					int x=0;
					for(int k=0;k<lenRow2;k++) {
						x+=arr[i][k]*arr2[k][j];
					}
					outputMatrix[i][j]=x;
				}
			}
			
			//this for printing final output (values of multiplication of both matrix)
			System.out.println("");
			System.out.println("The Multiplication of both Matrix");
			
			for(int i=0;i<outputMatrix.length;i++) {
				for(int j=0;j<outputMatrix.length;j++) {
					System.out.print(" "+outputMatrix[i][j]+" ");
				}
				System.out.println("");
			
		}
		}
		
    }
}
