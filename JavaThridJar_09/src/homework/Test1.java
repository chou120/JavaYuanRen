package homework;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

    /**
     * 1.定义String getStr(char[] chs)静态方法，方法内要求：从chs中随机获取4个元素，再和1个0-9之间（包含0和9）的整数组成一个五个字符的字	符串。
     * 定义main方法，方法内完成：
     * （1）定义长度为26，元素值为26个大写英文字母的数组chs
     * （2）传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值
     * <p>
     * <p>
     * 2. (1)有一个数字字符串"25 11 -6 20 102 9",数字之间用空格间隔
     * (2)利用冒泡排序对这串数字按照从小到大排序，生成一个数值有序的字符串"-6 9 11 20 25 102"
     * <p>
     * <p>
     * <p>
     * 3.String str = "svd9876fsb543fdg210";将字符串中所有偶数转为int[] 数组，再对数组冒泡排序，最后使用Arrays输出数组。
     */
    public static void main(String[] args) {

        String  str="ASBJABDFEJKNBDZHOGHSD";
        String str1 = getStr(str.toCharArray());
        System.out.println(">>>>"+str1);


        String  st="25 11 -6 20 102 9";
        String[] s = st.split(" ");

        int[] ints = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            Integer integer = Integer.valueOf(s[i]);
            ints[i]=integer;
        }

        Arrays.sort(ints);



        String str2 = "svd9876fsb543fdg210";
        char[] chars = str2.toCharArray();
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i]) && chars[i] % 2==0){
                    count++;
            }
        }
        int[] ints1 = new int[count];
        int  key=0;

        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i]) && chars[i] % 2==0){
                ints1[key++]=chars[i];
            }
        }
        Arrays.sort(ints1);





       /* 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
        例如键盘录入：ABCDEabcd123456!@#$%^
                输出：ABCDEabcd123456!@#$%^中大写字母有:5个,小写字母有:4个,数字字符:6个,其他字符:6个


        */

        String  str3="ABCDEabcd123456!@#$%^";
        int  big=0;
        int  small=0;
        int  numberChar=0;
        int  other=0;
        char[] chars1 = str3.toCharArray();
        for (char c : chars1) {
            if(c>=65 && c<=90){
                big++;
            } else  if(c>=97 &&c<=122){
                small++;
            } else  if(Character.isDigit(c)){
                numberChar++;
            }else{
                other++;
            }
        }
    }


    public static String getStr(char[] chs) {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(chs.length);
            stringBuffer.append(chs[index]);
        }
        int i = random.nextInt(10);
        stringBuffer.append(i);

        return  stringBuffer.toString();

    }









}
