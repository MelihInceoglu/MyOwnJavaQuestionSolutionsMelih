package day11;

import java.util.Scanner;

public class Dowhile4 {

    /* WhileLoop,DoWhile
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("İsim giriniz ");
        String kelime= scanner.next();

        boolean bl=true;

        while(bl){
            if ((kelime.length())%2!=0){
                System.out.println(kelime.substring(kelime.length() / 2,kelime.length() / 2+1));
                bl=false;

            }else{
                System.out.println("You entered wrong word.");
                break;
            }

        }

    }

}
