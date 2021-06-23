```properties
                    完成学生在线考试系统
 程序启动进入主界面,功能如下
    1.请选择是登录人身份
    2.退出
    
    选择1：
        1.老师
        2.学生
        3.退出（返回上一层）   
 需求分析:
        1.老师的功能    账户注册,信息修改,个人账户注销,查看个人信息,删除学生信息,查看学生信息
                      添加试题,修改试题,删除试题,查看单个试题,查看所有满足某种条件的试题
        2.学生的功能
                      账户注册,个人信息修改,进行考试，查看考试分数
                      进入考试之后默认显示10题(可以是在控制台上每显示一题做一题，然后就继续下一题的显示)
        
 有如下类
        Teacher.java
            name  sex  iphone   id(编号)                    
        Student.java
            name  sex  iphone  score  id(编号)    date(上一次考试的时间)    
        Exam.java
            id(试题编号默认自加),title,AnwserA, AnwserB,AnwserC,AnwserD,Anwser,score(每题分数)
        Util.java
            功能方法都在Util类里面实现
        
        DatabaseUtil.java
             老师的集合
             学生的集合
             试题的集合         
    
  大致功能如上,可自行添加功能,也可自行在已经提供的类里面添加额外的属性或者方法
    
    
```

