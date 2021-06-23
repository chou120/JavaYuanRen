package com.exam.core;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("欢迎进入xxx考试系统");
        Scanner  scanner=new Scanner(System.in);

       System.out.println("请选择功能:\n 1.请选择登录的身份: \n 2.退出");
        int  number=scanner.nextInt();
        switch (number){
            case 1:
               while(true){
                   System.out.println(" 1.老师\n 2.学生\n 3.退出（返回上一层）");
                   number=scanner.nextInt();
                   switch (number){
                       case 1:
                           //teacher
                           Util.showAll_teacher();
                           break;
                       case 2:
                           //student
                           Util.showAll_student();

                           break;
                       case 3:
                           //返回上一层

                           break;
                   }
               }

            case 2:
                System.exit(0);
                break;

        }




    }

}
