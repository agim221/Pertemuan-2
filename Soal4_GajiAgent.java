package test;
import java.util.Scanner;

/**<h1>Soal 4: Gaji Agent
 * Dalam sebuah agent penjualan. Agent akan menerima gaji pokok sebesar Rp.500.000,00 
 * perbulan. Agent akan menerima bonus penjualan sebesar 25% dari total penjualan item jika 
 * berhasil menjual minimal 40 item. Agent akan menerima bonus penjualan 35% dari total 
 * penjualan jika berhasil menjual diatas 80 item. Namun, Jika Agent menjual dibawah 15 item 
 * akan menerima denda pemotongan gajih pokok sebesar 15% dari total minus penjualan ke 15 
 * item. Selain itu agen hanya menerima bonus 10% setiap itemnya. Harga setiap item adalah Rp. 
 * 50.000,00
 * 
 * @author muhamad agim
 * @version 1.0
 * @since 28-01-2023
 */

public class Soal4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hargaItem = 50000;
		int gajiPokok = 500000;
		int totalItem = in.nextInt();
		int totalPenjualan;
		byte i;
		
		totalPenjualan = totalItem * hargaItem;
		if(totalItem > 80) gajiPokok += totalPenjualan * 0.35;
		else if(totalItem > 40) gajiPokok += totalPenjualan * 0.25;
		else if(totalItem < 15) gajiPokok -= (15 - totalItem) * 0.15 * hargaItem;
		for(i = 0; i < totalItem;i++) {
			if(!(totalItem < 15))	gajiPokok += 0.1 * hargaItem;
		}
		
		System.out.printf("%d", gajiPokok);
		

	}

}
