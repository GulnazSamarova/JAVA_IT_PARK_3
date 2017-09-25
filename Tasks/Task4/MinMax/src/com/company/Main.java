

public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        // считываю размер массива
        int arraySize = scanner.nextInt();
        int array[] = new int[arraySize];

        // array[0] = scanner.nextInt()
        // array[1] = scanner.nextInt()
        // int x = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);

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

               a[kmin]=max;




            }
    }
}

