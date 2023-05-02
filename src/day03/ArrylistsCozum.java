package day03;

public class ArrylistsCozum {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);

        System.out.println(sb1);

        sb1.deleteCharAt(3);

        System.out.println(sb1);

        sb1.reverse( );

        System.out.println(sb1);

    }
}

