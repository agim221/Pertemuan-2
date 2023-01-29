package test;
import java.util.*;

/**
 * <h1>Soal 5: Buka Tutup Jalan</h1>
 * Buka tutup jalan merupakan hal yang lumrah ada di pengaturan jalan khususnya di Indonesia. 
 * Buka tutup jalan kali ini memiliki aturan yang disempurnakan. Setiap empat mobil yang lewat 
 * digabung setiap angkanya. Jika (gabungan angka tersebut dikurangi 999999) hasilnya dibagi 5 
 * sisa bagi hasilnya 0 maka 4 mobil tersebut harus berhenti, dan memperbolehkan mobil lainnya 
 * dari arah bersebrangan untuk jalan. Begitu terus sebaliknya.
 * 
 * Input Format: satu baris berupa plat number untuk 4 mobil
 * Output Format: Berupa tulisan "jalan" atau "Berhenti"
 * 
 * @author muhamad agim
 * @version 1.0
 * @since 28-01-2023
 *
 */

public class Soal5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String teksNum;
		int number;
		
		char[] lastNum = new char[2];
		
		teksNum = in.nextLine();	//scan teks
		teksNum.getChars(17, 19, lastNum, 0);	//mengambil char di index 17 sampai 18
		String twoNum = String.join("", String.valueOf(lastNum[0]), String.valueOf(lastNum[1])); //menggabungkannya menjadi string
		number = (Integer.parseInt(twoNum) - 9)%5; //mengubahnya menjadi integer lalu di hitung
		
		if(!(number == 0)) System.out.println("berhenti");
		else System.out.println("jalan");
		
		
	}

}
