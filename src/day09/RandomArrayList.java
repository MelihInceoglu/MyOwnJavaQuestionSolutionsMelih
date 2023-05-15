package day09;

import java.util.*;

public class RandomArrayList {


    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */

    public static void main(String[] args) {

        List<String>isimler=new ArrayList<>();

        isimler.add("ali");
        isimler.add("can");
        isimler.add("veli");
        isimler.add("zeynep");
        isimler.add("su");

        Scanner scanner=new Scanner(System.in);

        boolean kayit=false;

        Random random=new Random();

        int rastgelesayi= random.nextInt(100);

        do{
            System.out.println("Lutfen issim giriniz");
            String isim= scanner.nextLine();
            isim=isim.toLowerCase().replace(" ","");

        if (isim.length()>=2){
            if (isimler.contains(isim)){
                System.out.println("Bu isim mevcut\nLütfen "+ isim+rastgelesayi+" şeklinde kaydetmeyi deneyiniz");
            }else {
                isimler.add(isim);
                kayit=true;
            }
        }

        }while(!kayit);
        System.out.println("isim kaydedilmiştir");
        System.out.println("isimler = " + isimler);

    }

}
