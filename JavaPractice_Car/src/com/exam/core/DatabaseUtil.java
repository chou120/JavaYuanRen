package com.exam.core;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {

    private DatabaseUtil(){

    }
    private final static List<Teacher> teacherList=new ArrayList<>();
    private final static List<Student> studentList=new ArrayList<>();
    private final static List<Exam> ExamList=new ArrayList<>();


    static {
        /**
         * 初始化数据
         */
        for (int i = 0; i < 3; i++) {
            Gender gender = i%2==0 ? Gender.MALE : Gender.FEMALE;
            teacherList.add(new Teacher("张三"+i,gender,"12345678"+i,"12345"+i));
        }

        for (int i = 0; i < 3; i++) {
            Gender gender = i%2==0 ? Gender.MALE : Gender.FEMALE;
            studentList.add(new Student("小三"+i,"12345"+i,gender,"+86-1231419928"+i));
        }

        for (int i = 0; i < 15; i++) {
            ExamList.add(new Exam("spring"+(i+1)+"的版本有什么新特性","A.好看"+i,
                    "B.一般"+i,"C.丑"+i,"D.不忍直视"+i,"D",10));
        }
    }

    public static  List<Teacher> getTeacherList(){
        return  teacherList;
    }

    public static  List<Exam> getExamList(){
        return  ExamList;
    }
    public static  List<Student> getStudentList(){
        return  studentList;
    }


}
