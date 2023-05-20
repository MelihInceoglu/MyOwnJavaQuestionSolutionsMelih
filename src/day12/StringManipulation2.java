package day12;

import java.util.Scanner;

public class StringManipulation2 {

    /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen e-mail adresinizi giriniz");

        String email= scanner.nextLine();

        if (email.contains("hotmail")){
            email= email.replace("hotmail","gmail");
            System.out.println(email)
            ;

        }else if (email.contains("gmail")){
            System.out.println(email)
            ;

        }else {
            System.out.println("Hatali giris yaptiniz");
        }


    }
}
