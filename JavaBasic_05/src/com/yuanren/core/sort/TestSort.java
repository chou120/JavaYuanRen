package com.yuanren.core.sort;

import java.util.Arrays;

public class TestSort {

    /**
     * 冒泡排序：0.如果遇到相等的值不进行交换，那这种排序方式是稳定的排序方式。
     * <p>
     * 1.原理：比较两个相邻的元素，将值大的元素交换到右边
     * <p>
     * 2.思路：依次比较相邻的两个数，将比较小的数放在前面，比较大的数放在后面。
     * <p>
     * 　　　  (1)第一次比较：首先比较第一和第二个数，将小数放在前面，将大数放在后面。
     * <p>
     * 　　　　(2)比较第2和第3个数，将小数 放在前面，大数放在后面。
     * <p>
     * 　　　　......
     * <p>
     * 　　　　(3)如此继续，直到比较到最后的两个数，将小数放在前面，大数放在后面，重复步骤，直至全部排序完成
     * <p>
     * <p>
     * 　　　　(4)在上面一趟比较完成后，最后一个数一定是数组中最大的一个数，所以在比较第二趟的时候，最后一个数是不参加比较的。
     * <p>
     * 　　　　(5)在第二趟比较完成后，倒数第二个数也一定是数组中倒数第二大数，所以在第三趟的比较中，最后两个数是不参与比较的。
     * <p>
     * 　　　　(6)依次类推，每一趟比较次数减少依次
     */


    public static void main(String[] args) {

      /*  int a = 9;
        int b = 10;
        int temp = a;
        a = b;
        b = temp;
        */

        int[] arr = {10, 1, 61, 89, 36,35,55,61,35,88,89,1};
        //课堂练习：去除上述数组中的重复数据，并且对去除之后的数组进行排序



        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }





      /*  for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {   (1)第一次比较：首先比较第一和第二个数，将小数放在前面，将大数放在后面。
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-3; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));*/






    }


}
