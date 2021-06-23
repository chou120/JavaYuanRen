package com.exam.core;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Util {

    private static Scanner scanner = new Scanner(System.in);


    private Util() {

    }

    //增加一个此方法 用来显示老师的所有的功能
    public static void showAll_teacher() {


        while (true) {
            System.out.println("老师功能如下: 1.账户注册\n2.账户登录\n3.退出");
            System.out.println("请输入功能选项:");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    //注册  创建老师对象,并且往老师的集合中添加
                    Teacher teacher = new Teacher();
                    System.out.println("请输入名字:");
                    String  name=scanner.next();
                    System.out.println("请输入密码:");
                    String password=scanner.next();
                    System.out.println("请输入联系方式:");
                    String phone=scanner.next();

                    System.out.println("请选择性别: 1.男\n 0.女");
                    int sex = scanner.nextInt();
                    if(sex==1){
                        teacher.setSex(Gender.MALE);
                    }else{
                        teacher.setSex(Gender.FEMALE);
                    }
                    teacher.setIphone(phone);
                    teacher.setPassword(password);
                    teacher.setName(name);

                    addTeacher(teacher);

                    break;
                case 2:
                    //登录
                    System.out.println("请输入登录账户:");
                    String  tname=scanner.next();
                    System.out.println("请输入密码:");
                    String pass=scanner.next();
                    boolean flag= login_teacher(tname,pass);
                    if(flag){
                        //进行下一步操作
                        System.out.println("欢迎"+tname+"登录,请输入你想完成的操作:1.添加考试试题");
                        Exam exam = new Exam();
                        addExam(exam);
                    }
                    break;
                default:
                    //表示退出老师的功能
                    return;


            }
        }


    }

    /**
     * 添加试题
     * @param exam
     */
    private static void addExam(Exam exam) {
        DatabaseUtil.getExamList().add(exam);
    }

    private static void addTeacher(Teacher teacher) {
        //往集合中添加
        DatabaseUtil.getTeacherList().add(teacher);

    }

    private static boolean login_teacher(String name,String password){
        List<Teacher> teacherList = DatabaseUtil.getTeacherList();
        for (Teacher teacher : teacherList) {
            if(name.equals(teacher.getName())&& password.equals(teacher.getPassword())){
                return  true;
            }
        }
        return false;
    }

    public static void showAll_student() {
        System.out.println("1.注册\n2.登录\n3.退出");
        System.out.println("请输入要完成的功能");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                break;
            case 2:
                System.out.println("请输入学生登录姓名:");
                String name = scanner.next();
                System.out.println("请输入学生登录密码:");
                String pass = scanner.next();
                Student student=  login_student(name,pass);
                if(student!=null){
                       //如果登录成功  直接显示试题
                    //调用显示试题的方法
                     showExam(student);
                    System.out.println("考试完成之后 去显示学生成绩:");
                    System.out.println(student.toString());

                }
                break;
        }


    }
    //显示试题的方法
    private static void showExam(Student  student) {
        int  score=0;
        List<Exam> examList = DatabaseUtil.getExamList();
        //获取10个试题
        Collections.shuffle(examList);
        for (int i = 0; i < 10; i++) {
            System.out.println(examList.get(i));
            System.out.println("请输入试题答案:");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase(examList.get(i).getAnwser())){
                    //如果一抹一样就统计分数
                score+=examList.get(i).getScore();
            }
        }
        //考试完成之后把成绩塞给学生
        student.setScore(score);
        student.setDate(new Date());
    }

    private static Student login_student(String name,String password) {
        List<Student> studentList = DatabaseUtil.getStudentList();
        for (Student student : studentList) {
            if(student.getStuName().equals(name) &&
                student.getPassword().equals(password)){
                System.out.println(name+"登录成功");
                return student;
            }
        }
        return null;
    }
}
