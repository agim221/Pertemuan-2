package test;
import java.util.*;

/**
 * <h1>Soal 2 : Input & Output(2)</h1>
 * Input & Output (2) program implements an applicaton to print output with a format
 *
 * Input format	: Input a String followed by an integer
 * Output format: The first column contains the String and is left justified using exactly 15 characters.
 * 				  The second column contains the integer, expressed in exactly 3 digits.
 * 
 * @author Muhamad Agim
 * @version 1.0
 * @since 28-01-2023
 */

public class Soal2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String[] teks = new String[3];
		int[] angka = new int[3];
		byte i;
		
		for(i = 0; i < 3;i++) {
			teks[i] = sc.nextLine();	//Input string
			angka[i] = sc.nextInt();	//input String
			sc.nextLine();
		}
		
		System.out.print("====================\n");
		for(i = 0; i < 3;i++) {
	
			String str = String.format("%-15s", teks[i]); //menambahkan spasi sampai 15 karakter
			String num = String.format("%03d", angka[i]); //menambahkan 0 sampai 3 angka 
			System.out.printf("%s", str);
			System.out.printf("%s\n", num);
		}
		
		System.out.print("====================");
		
	}

}
