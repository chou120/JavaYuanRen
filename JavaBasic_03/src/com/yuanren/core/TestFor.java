package com.yuanren.core;

public class TestFor {
    public static void main(String[] args) {
       /* for (初始化; 判断条件 ;  步长) {    //1234   234  234  234
                1      2        4
                        3 代码;
        }*/

        for (int i = 0; i < 5; i++) {
            System.out.println("这是我第"+(i+1)+"循环");
        }
        // System.out.println(i); 为什么这个 i 报错

        int j = 0;  //1
        for (; j < 8; ) {
            System.out.println("这是我第"+(j+1)+"循环");//3  j=7
            j++; //4    j=8
        }

        int  number=j+19;
        System.out.println(number);


        /**
         *  for  一般在明确循环次数的时候
         *  while 一般是不明确次数的时候
         *  while(true){
         *
         *  }
         */

         /* int   num=1;

          while(true){
              System.out.println("num="+num);
              if(num>10){
                  break; //跳出循环
              }
              num++;
          }

          boolean   flag=true;
          while(flag){
              System.out.println("num="+num);
              if(num>20){
                  flag=false; //跳出循环
              }
              num++;
          }
*/

        //continue 跳出本次循环 继续下次循环
        for (int i = 0; i < 20; i++) {
            if(i%5==0){
                continue;
                //break;
            }
            System.out.print(i+"\t");
        }

    }
}
