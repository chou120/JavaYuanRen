package com.yuanren.core.homework;

public class Test5 {

    public static void main(String[] args) {
        int [] arr={13,26,-3,4,54,26,37,18,69,-10};

        System.out.println(print(arr));

    }

    public static String print(int[] arr) {
        String str="[";
        String str2="]";
        String in="";
        //[0]=13 [1]=26 [2]=-1 [3]=4 [4]=54
        for (int i = 0; i < arr.length; i++) {
             in=in+str+i+str2+"="+arr[i]+"\t";
             if((i+1)%5==0){
                in=in+"\n";
             }
        }
        return in;
    }
}
