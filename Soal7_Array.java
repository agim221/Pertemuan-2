package test;
import java.util.*;


public class Soal7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//One Dimensional Arrays
		int i,j,k;
		
		 int[] fisrtArray = {2, 5, 3}; 
		 int[] secondArray = {9, 5, 3}; 
		 int[] thirdArray = {2, 4, 9}; 
		 int[] fourthArray = {10, 11, 12}; 
		 int[] fifthArray = {13, 14, 15}; 
		 int[] sixthArray = {16, 17, 18}; 
		 int[] seventhArray = {19, 20, 21}; 
		 int[] eighthArray = {22, 23, 24}; 
		 int[] ninthArray = {25, 26, 27}; 
		 //Two Dimensional Arrays
		 int[][] twoDimensionalArray1 = {fisrtArray, secondArray, 
		thirdArray}; 
		 int[][] twoDimensionalArray2 = {fourthArray, fifthArray, 
		sixthArray};
		 int[][] twoDimensionalArray3 = {seventhArray, eighthArray, 
		ninthArray};
		 //Three Dimensional Array
		 int[][][] threeDimensionalArray = {twoDimensionalArray1, 
		twoDimensionalArray2, twoDimensionalArray3};
		 
		 
		 //menampilkan array tiga dimensi
		 for(i = 0; i < 3;i++) {
			 System.out.printf("{ ");
			 for(j = 0; j < 3;j++) {
				 System.out.printf("{ ");
				 for(k = 0; k < 3;k++) {
					System.out.printf("%d ", threeDimensionalArray[i][j][k]); 
				 }
				 System.out.printf("} ");
			 }
			 System.out.printf("}\n");
		 }
	}

}
