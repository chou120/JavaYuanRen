package com.yuanren.core.array;

public class ArrayTest2 {


    public static void main(String[] args) {

        //数据类型 [] 数组名={};
        char [] ch={'1',98,'j','男'};

        String[] str={"张三丰","1","张大炮","张益达","张三丰","1","张大炮","张益达","张三丰","1","张大炮","张益达","张三丰","1","张大炮","张益达","张三丰","1","张大炮","张益达","张三丰","1","张大炮","张益达","张三丰","1","张大炮","张益达","张三丰","1","张大炮","张益达"};

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }


      /*  int [] in={};
        in[0]=12;
        in[1]=13;*/

        //int[] in=new int[]{};

        //求数组的偶数和
        int  [] array={12,341,2412,51,211,5125,123,2,8};

     /*   int  sum=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                sum=sum+array[i];
            }
        }
        System.out.println(sum);*/
        int result=   sum(array);  //调用 sum 方法


    }
    //思考:方法的返回值的数据类型只有基本数据类型吗？？  可不可是引用数据类型  ？   数组   接口   其他的类  等等

    //求偶数和
    public static  int   sum(int [] array){
        int  sumTotal=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                sumTotal=sumTotal+array[i];
            }
        }
        return  sumTotal;
    }

















}
