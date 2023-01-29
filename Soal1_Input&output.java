
package test;
import java.util.Scanner;
import java.util.*;

/**
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into 
 * tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print 
 * the number of tokens, followed by each token on a new line.
 * s is composed of any of the following: English alphabetic letters, blank spaces, 
 * exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), 
 * apostrophes ('), and at symbols (@).
 * 
 * input format: A single string s
 * output format: On the first line, print an integer, n, denoting the number of tokens in string s (they do not 
 * need to be unique). Next, print each of the n tokens on a new line in the same order as they 
 * appear in input string s.
 * 
 * @author muhamad agim
 * @version 1.0
 * @since 28-01-2023
 *
 */

public class Soal1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String teks;
        String s;
        char c;
        int spasi = 1;
        byte i;
        
        teks = keyboard.nextLine(); //input string
        
        
        for(i = 0; i < teks.length(); i++) {
            c = teks.charAt(i);
            if(c == ' ' || c == '!' || c == ',' || c == '?' || c == '.' || c == '_' || c == '@' || c == '\''){
                spasi++;
            }
        }
        
        System.out.printf("%d\n", spasi);
        
        for(i = 0; i < teks.length();i++) {
        	c = teks.charAt(i);
            if(c == ' ' || c == '!' || c == ',' || c == '?' || c == '.' || c == '_' || c == '@' || c == '\''){
                System.out.println();
            } else {
            	System.out.printf("%c", c);
            }
        }
    }
}