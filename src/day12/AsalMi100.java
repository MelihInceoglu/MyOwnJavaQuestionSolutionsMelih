package day12;

public class AsalMi100 {

    /* TASK :
   100 den kucuk asal sayilari yazdiran bir code create ediniz.
    */
    public static void main(String[] args) {

        int sayilimit=100;

        for (int sayi= 2; sayi <=sayilimit ; sayi++) {
            if (asalMi(sayi)){
                System.out.print(sayi + " ");
            }
        }
    }

    public static boolean asalMi(int sayi) {
        if (sayi<2 ){
            return false;
        }

        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                return false;
            }
        }
        return true;

    }

}



