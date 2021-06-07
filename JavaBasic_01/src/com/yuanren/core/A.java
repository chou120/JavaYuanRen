package com.yuanren.core;

/**
 *  文档注释
 * @author  sanye
 * @since   1.0
 * @deprecated  描述
 *
 */
public class A {

    /**
     * @deprecated
     * @param args   参数
     */

    public static void main(String[] args) {
       // System.out.println("哈哈哈 你好啊");  单行注释

        /*  多行注释
            System.out.println("哈哈哈 你好啊");
            System.out.println("哈哈哈 你好啊");
            System.out.println("哈哈哈 你好啊");
            System.out.println("哈哈哈 你好啊");
            System.out.println("哈哈哈 你好啊");
            System.out.println("哈哈哈 你好啊");
        */

        //数字常量     字符常量     字符串（常量）  布尔常量     ""

        System.out.println(1231);
        System.out.println(10.2);
        System.out.println(-563);
        System.out.println('1');
        System.out.println(">>>>>>>>>>>>>>>>"+'韩');
        System.out.println(true);
        System.out.println(""); //null



         /*
         基本数据类型:
             byte   1字节
            short  2
            int    4
            long   8
            float  4  单精度
            double 8  双精度
            char   2   0~65535   gbk  2字节
            boolean   1

            byte 开辟的空间 占内存 1个字节。 范围 -128~127
            short 开辟的空间 占内存 2个字节。范围-32768~32767
            int  开辟的空间 占内存 4个字节。范围-2147483648~2147483647
            long 开辟的空间 占内存 8个字节。long l=12345678903L;


         引用数据类型:   类   接口   数组  枚举

*/
        //          int Int=12;   不建议
       /* boolean   flag=true;
        flag=false;

        System.out.println(flag);*/

        //byte by=12312;   所赋的值不能超过取值范围
        char  ch='韩';

        float  fl=123.12312F;   // float > int    程序默认的数字是int  整形  不是 byte  不是short
        System.out.println(fl);

        double   dou=fl;

        long   lo=2147483648L;

        int   num=(int)123.93;   //   目标类型  变量名=（目标类型）要转换的数据

        System.out.println(num);


        char  cha='0';  //   ASCII    a=97      A=65      '0'=48
        int  number1=cha;
        System.out.println("cha="+cha+",number1="+number1);

        number1=97;
        cha=(char)number1;
        System.out.println("----------"+(char)number1);

        System.out.println("-----"+(char)('1'+'0')); //



    }
}
