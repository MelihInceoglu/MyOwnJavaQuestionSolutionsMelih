package day06;

public class Menu {

    // create 2D array of food:
    // print all the foods sorted
        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */

    public static void main(String[] args) {

        String [][] food = {{"steak", "hot dog", "cheeseburger"},{"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};


        for (String [] each : food) {
            for (String yemek : each) {
                System.out.println(yemek);
            }

            System.out.println("-----------------------------");
        }


        System.out.println("******************************* Fori Cozum**********************************");


        System.out.println("");

        String [] ulkeler={"American","Italian","Korean","Turkish","Afkan","indian"};


        for (int i = 0; i <food.length ; i++) {


            System.out.println("-----------------------"+ulkeler[i]+"------------------");

            for (int j = 0; j <food[i].length ; j++) {


                System.out.println(food[i][j]);
            }

            System.out.println("--------------------");
            
        }






    }

}
