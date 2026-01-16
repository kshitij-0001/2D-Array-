package Array2D;
import java.util.Arrays;

public class CountEvenOddNumber {
public static void main(String []args) {
	int matrix[][]= {{2,3,5,4,6},{5,6,2,8,4},};
	int evenNumber=0;
	int oddNumber=0;
	
	for(int i=0;i<matrix.length;i++) {
		for( int j=0;j<matrix.length;j++) {
			int number=matrix[i][j];
			
			if(number%2==0) {
				 evenNumber++;
			}
			else {
				 oddNumber++;
			}
		}
	}
	System.out.println("Total even Number is: "+evenNumber);
	System.out.println("Total odd Number is: "+oddNumber);
	}
	
}
