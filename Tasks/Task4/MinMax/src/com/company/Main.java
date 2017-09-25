

public class Main {

    public static void main(String[] args) {
    int array[]={1, 2, 3, 4 ,5, 6, 7};


        int min = array[0];

        int kmin, kmax;
        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                kmin=i;
            }

            int max = array[0];

            for ( i = 1; i < array.length; i++) {

                if (array[i] > max) {
                    max = array[i];
                    kmax=i;
                    int a[kmax]=min;
                }
        }






            }
    }
}

