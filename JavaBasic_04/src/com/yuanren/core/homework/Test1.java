package com.yuanren.core.homework;

public class Test1 {

    public static void main(String[] args) {
      /*  0
          12
          345
          6789*/
        int  count=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
