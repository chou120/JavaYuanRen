package com.yuanren.exception.test;

import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.util.Arrays;

public class MyArrayList implements MyList {

    private Object [] objects;
    private int   count=0; //用来统计数组的个数

    public MyArrayList() {
        this.objects = new Object[0];
    }

    @Override
    public Object set(int index, Object element) throws Exception {
        if(index<0 || index > count-1){
                 throw new Exception("input index notMismatchException");
        }
        Object  obj=objects[index];
        objects[index]=element;
        return obj;
    }

    @Override
    public Object get(int index) {
        if(index<0 || index > count-1){
            return  null;
        }
        return objects[index];
    }

    @Override
    public void clear() {
        this.objects=new Object[0];
        count=0;//如果清空  count为0

    }

    @Override
    public Object remove(int index) {

        if(index<0 || index > count-1){
             try {
                throw new Exception("输入数据不正确");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Object  obj=objects[index];  //要返回的 对象
        for (int i = index; i < count-1; i++) {
            Object  temp=objects[i];
            objects[i]=objects[i+1];
            objects[i+1]=temp;
        }
        this.objects = Arrays.copyOf(this.objects, objects.length - 1);
        count--;
        return obj;
    }

    @Override
    public boolean remove(Object o) {

        for (int i = 0; i < count; i++) {
            if(o.equals(objects[i])){
                Object remove = remove(i);
                if(remove!=null){
                    count--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {

        if(o==null){
            return false;
        }

        this.objects= Arrays.copyOf(this.objects, objects.length + 1);
        objects[objects.length-1]=o;
        count++;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public int size() {
        return count;
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "objects=" + Arrays.toString(objects) +
                ", count=" + count +
                '}';
    }
}

class TestList{
    public static void main(String[] args) {
        MyList  myList=new MyArrayList();
        myList.add("张三");
        myList.add("张三2");
        myList.add("张三5");
        myList.add("张三1");
        myList.add("张三8");

        /*Object remove = myList.remove(99);
        myList.clear();
        System.out.println(remove+"-----"+myList);
*/
/*

        int show = show(myList);
        System.out.println("a的值为:"+show);

*/


        int   a=12;
        try {
            myList.set(89,"zhangsan ");
            a=89;
            System.out.println(a);
        } catch (Exception e) {
            a=31;
            System.out.println("-----"+e.getMessage()+a);

        }finally {
            // 关闭资源: file      数据库   等
            a=512;
            System.out.println("final"+a);

        }








    }
    public static int  show(MyList myList){
        int   a=12;
        try {
            myList.set(89,"zhangsan ");
            a=89;
            return  a;
        } catch (Exception e) {
            a=31;
            System.out.println("-----"+e.getMessage());
            return   a;
        }finally {
            //  file      数据库   等
            a=512;
            System.out.println("final"+a);

        }

    }
}