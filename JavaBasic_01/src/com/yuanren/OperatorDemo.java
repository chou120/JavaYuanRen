package com.yuanren;

public class OperatorDemo {
    /*
        +    -     *    /   %
        加  减    乘   除  余
    * */

    public static void main(String[] args) {

        //算术运算符
        int number1 = 12;
        int number2 = -5;
        System.out.println(number1/number2);
        System.out.println(number1%number2);

        /**
         * 1）++或者--在变量的右侧，举例：i++，j--；  先运算再自加
         * 2）++或者--在变量的左侧，举例：++i，--j；  先自加再运算
         */


        /*int number3=3;
        ++number3;
        System.out.println("-------------"+number3);

        */

        int  num=1;
      //  int  x=num++ +2;
       // int  x=++num +2;
       // System.out.println("x="+x+",num="+num);

      // num= num++ + ++num+1 + ++num + num--;
        //    1         3+1      4      4
        System.out.println("num="+num);


        //比较运算符
        int a = 3;
        int b = 5;

        System.out.println(a > b);  //比较a和b空间中值的大小   true  false
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a != b);
        System.out.println(a>=b);
        System.out.println(a<=b);   //3<=5;

        //逻辑运算符
        /**
         * Java中的逻辑运算符：要求两侧的运算类型必须是boolean类型。逻辑运算符就是把多个boolean类型的值连接在一起。
         * 或 ||
         * true || true=true
         * true || false=true
         * false|| true=true
         * false || false=false;
         * | 非短路或 整个表达式运算到底
         * ||短路或 只要遇到真，就不在运算
         * 只要有一个为真结果就为真，或者说只有两个都为假的时候才为假
         * 与 &&
         *
         * true && true=true
         * true  && false=false
         * false && true=false
         * false  && false=false;
         * 只要有一个为假就为假，两个都为真才为真
         *
         * 非 ! ：
         * !true = false
         * !false=true
         * 双与（短路与）&&  单与  &
         * 双或（短路或）||    单或 |
         * 异或 ^   非 !
         *
         * && 和&有什么区别？
         * 不管是&&或者是&都表示的是做与的逻辑运算
         * &&短路与 ,只要遇到false就不继续做运算
         * &：非短路与，运算执行到底
         */

        int  ax=12;
        int  by=15;
     /*   System.out.println(ax > by | ax-by<ax);
        System.out.println(ax > by || ax-by<ax);
        System.out.println(ax < by | ax-by>ax);
        System.out.println(ax < by || ax-by>ax);
        System.out.println("----------------------");
        System.out.println(ax < by | ++ax-by<ax);
        System.out.println("-=====-"+ax);*/
        /*System.out.println(ax < by || ++ax-by<ax);
        System.out.println("-=====-"+ax);*/

        //
      /*  * && 和&有什么区别？
         * 不管是&&或者是&都表示的是做与的逻辑运算
                * &&短路与 ,只要遇到false就不继续做运算
                * &：非短路与，运算执行到底*/



        /*System.out.println(ax < by & ++ax-by>ax);//表示  只有两个成立 才成立

        System.out.println(ax);
*/
        System.out.println(ax > by && ++ax-by>ax);   //表示  只有两个成立 才成立
        System.out.println(ax);


        System.out.println(true || false);  //true

        System.out.println(true && false ); //false


        System.out.println(!(true||false)); //false

        System.out.println(!true||false);  //false

        System.out.println(!true && false); //false

        System.out.println(!(true && false)); //true

        System.out.println(~2);   //负数是以补码的方式存在内存中   正数的源码反码补码一样     0000 0010  0000 0010   0000 0010
        //对一个数的补码进行去反   最高位变      0000  0010   --->  1 1111 1101(补码=反码+1)  反码 1 1111 1100      ----》（源码） 1 0000 0011

        // -5    1  0000  0101
        //       1  1111  1010
        //       1  1111  1011  补码

        //       0  0000  0100  补码
        //       0  0000  0100
        //       0  0000  0100

        System.out.println(~-5);

        //  2    8   10  16
        /*25/8=3  ...1
          3/8 =0  ...3      */

        System.out.println(031);//  0+正数  表示八进制数   ---> 默认转换成十进制
        System.out.println(0x12); //

    }
}
