package day01;

public class ArrayPrintsTheLongandShortestWords {
    public static void main(String[] args) {

        // verilen string bir array'de
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        // given string is in an array
        // create a method that prints the longest and shortest words

       String [] arr={"AyseNur","Fatma","Hayriye","MelihProjectOwner"};

        enuzunEnkisa(arr);

            }
            public static void enuzunEnkisa(String []arr){

        String enKisa=arr[0];
        String enUzun=arr[0];


                for (int i = 0; i < arr.length ; i++) {

                    if (arr[i].length() > enUzun.length()){ //arr[i lenthi en uzundan büyükse en uzun = arr[i] olur]

                        enUzun = arr[i];

                    }

                if (arr[i].length()<enKisa.length()){



                            enKisa=arr[i];

                        }

                    }
                    System.out.println(enUzun);
                    System.out.println(enKisa);

                }


            }























