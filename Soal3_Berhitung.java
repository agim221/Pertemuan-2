package test;
import java.util.*;

/**
 * <h1>Soal 3 : Berhitung</h1>
 * Terdapat 5 buah operator matematika yang direpresentasikan oleh char '+', '-', '*', '/', '%'
 * gunakan operator tersebut untuk dapat digunakan sesuai fungsinya
 * 
 * Input format: meng-input string yang berisi A, operator, dan B, masing-masing dipisahkan sebuah spasi
 * contoh "A operator B"
 * 
 * @author muhamad agim
 * @version 1.0
 * @since 28-01-2023
 *
 */

public class Soal3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String operasi;
		String[] number = new String[3];
		int i = 0;
		
		operasi = in.nextLine();
		Scanner op = new Scanner(operasi);
		
		while(op.hasNextLine()) {
			number[i++] = op.next();// mengubah string menjadi string array dan spasi menjadi pemisah index 
		}
		
		switch(number[1]) {
		case "+": System.out.printf("%d",Integer.parseInt(number[0]) + Integer.parseInt(number[2]));
		break;
		case "-": System.out.printf("%d",Integer.parseInt(number[0]) - Integer.parseInt(number[2]));
		break;
		case "*": System.out.printf("%d",Integer.parseInt(number[0]) * Integer.parseInt(number[2]));
		break;
		case "/": System.out.printf("%d",Integer.parseInt(number[0]) / Integer.parseInt(number[2]));
		break;
		case "%": System.out.printf("%d", Integer.parseInt(number[0]) % Integer.parseInt(number[2]));
		break;
		}
		
	}
}
