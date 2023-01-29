package test;
import java.util.*;

/**
 * <h1>Soal 6: Big Number</h1>
 * 
 * In this problem, you have to add and multiply huge numbers! These numbers are so big that 
 * you can't contain them in any ordinary data types like a long integer.
 * Use the power of Java's BigInteger class and solve this problem
 *
 * Input Format: a and b are non-negative integers and can hae maximum 200 digits
 * Ouput Format: Output two lines. The first line should contain a + b, and the second line should contain a x b
 * 
 * @author muhamad agim
 * @version 1.0
 * @since 28-01-2023
 * 
 */
import java.math.BigInteger;

public class Soal6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		BigInteger a, b;
		
		a = in.nextBigInteger();
		b = in.nextBigInteger();
		
		System.out.println(a.add(b));  //penggunaan operasi + dalam big in menggunakan method
		System.out.println(b.multiply(a)); // penggunaan operasi * dalam big in menggunakan method
	}

}
