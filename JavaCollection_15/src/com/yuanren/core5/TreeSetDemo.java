package com.yuanren.core5;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {


    public static void main(String[] args) {

        /**
         *1、TreeSet集合中保存的数据都是有序的，这里的有序指的是对元素进行了排序；
         * 2、排序使用的是元素的自然顺序或者是创建集合对象时提供的Comparator排序；
         * TreeSet集合之所以可以在添加数据时自动排序，是因为底层使用的是二叉树保存数据的；
         * 二叉树是树形数据结构的一种特殊情况；
         */

    /*    TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5412);
        treeSet.add(8);
        treeSet.add(31);
        treeSet.add(14);
        treeSet.add(87);
        treeSet.add(9);

        System.out.println(treeSet);
*/
        //测试对象进行排序
        TreeSet<Student>   treeSet=new TreeSet<>(new MyComparator());
        treeSet.add(new Student("张三132",67.9));
        treeSet.add(new Student("张发2票",96.9));
        treeSet.add(new Student("依法",99.9));
        treeSet.add(new Student("哈哈",87.9));
        treeSet.add(new Student("马蓝21bdds瘦",77.9));

        System.out.println(treeSet);


    }
}
class  Student {


    private String   name;
    private Double   score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
/*
    @Override
    public int compareTo(Student o) {
        int  num=this.name.length()-o.getName().length();  //先比较名字长度是否一样

        int  num2 = num==0 ? (int)Math.ceil(this.score-o.getScore()) : num;

        return num2;
    }*/
}

class  MyComparator implements  Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        int  num=o1.getName().length()-o2.getName().length();  //先比较名字长度是否一样

        int  num2 = num==0 ? (int)Math.ceil(o1.getScore()-o2.getScore()) : num;

        return num2;
    }
}
