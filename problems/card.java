package problems;

import java.util.Scanner;

public class card {
    public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        int n = arr.length;
        printLargestDivisible(n, arr);
        }
    public  static void printLargestDivisible(int n, int a[])
    {
        // Count of 0s and 5s
        int i, c0 = 0, c5 = 0;
        for (i = 0; i < n; i++) {
            if (a[i] == 0)
                c0++;
            else
                c5++;
        }
        c5 = (int)Math.floor(c5 / 9) * 9;
        if (c0 == 0) // The number can't be
            System.out.print(-1); // made multiple of 10
        else if (c5 == 0) // The only multiple of 90
            System.out.println(0); // that can be made is 0
        else {
            for (i = 0; i < c5; i++)
                System.out.print(5);
            for (i = 0; i < c0; i++)
                System.out.print(0);
        }
    }
    }

