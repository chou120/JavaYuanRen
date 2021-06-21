package com.yuanren.intefaceDemo.pra;

public interface ControlData {

        /**
         * 接口里面的变量是常量  接口名.常量名
         *
         *
         */
        public   static  final   int  NUMBER=12;

        void  change();     //不作要求  在se阶段使用接口编程

        default   void   login(String name){
                System.out.println("接口中的默认方法...");
        }


}
