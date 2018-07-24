package Uri;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        int arr[] = new int[10];

        int i, j;
        int k;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }


        int size = 5;
        System.out.println(size);
        for (i = 0; i < size; i++) {

            for (j = i + 1; j < size; ) {
                if (arr[i] == arr[j]) {
                    for (k = j; k < size;k++ ) {

                        arr[k] = arr[k + 1];
                    }
                   size= size-1;

                }
                j++;


            }

        }

        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }
    }
}
