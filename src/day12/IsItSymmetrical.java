package day12;

public class IsItSymmetrical {

    /* TASK :
		ayna check sorusu:

		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };

		 output : verilen array simetriktir
		 */
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};

        simetrikMi(arr);
    }

    public static void simetrikMi(int[] arr) {
        boolean simetrikMi = false;
        int sayac = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                sayac++;
            }
        }
        if (sayac >= arr.length / 2) {
            simetrikMi = true;
        }
        if (simetrikMi) {
            System.out.println("Verilen Array simetriktir.");
        } else {
            System.out.println("Verilen Array simetrik degildir.");
        }
    }
}
