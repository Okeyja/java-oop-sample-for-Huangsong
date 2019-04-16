# 写给小崧崧的Java面向对象教程(—v—)

Java OOP Sample v1.0 for Huangsong

这是写给 成都信息工程大学 2015级 计算机应用153 黄崧同学的OOP案例。

## 项目结构

> Main 入口类主函数
>
> intf.Animal 动物接口
>
> intf.EmotionalCompanion 情感伴侣接口
>
> abst.Pet 宠物抽象类
>
> clss.pet.Cat 猫咪类
>
> clss.pet.Dog 小狗类
>
> clss.other.Human 人类类
>
> clss.other.Tiger 老虎类

## 环境配置

1. 搭建 Java 1.6 以上的运行时环境

2. 随便进入一个目录，比如你的`F:\Java学习代码\`里面，在文件夹中`shift + 鼠标右键`，
打开`PowerShell命令行`或者`CMD命令行`，或者你以前如果装过`Git客户端`可以不用按住
`shift`打开`Git Bash Here`打开Git的命令行都可以。

3. 命令行`git clone git@github.com:Okeyja/java-oop-sample-for-Huangsong.git`，
这里将会将项目下载到`F:\Java学习代码\java-oop-sample-for-Huangsong`文件夹下。

4. 使用IntelliJ IDEA，如果弹出的是你之前已经打开的项目代码，可以点击菜单`File`>`Open`
打开这个项目。就是刚才的`F:\Java学习代码\java-oop-sample-for-Huangsong`文件夹。

## 教程场景布置

入口函数内包含了三个主要场景：

1. 用抽象表示具体
2. 强制类型转换
3. 实际依赖的场景：人类观察老虎、观察猫、收养猫、投喂猫的实际动作

## 面向对象常见问题

### 什么是接口/抽象类多态

这类场景的多态通常表现为**父类引用指向子类对象**
```java
Animal animal = new Cat();
Cat cat = (Cat) animal;
```
我在场景二里面为你设置了一个强制类型转换，你可以在里面看到父类表示子类对象过后，
子类对象实际的数据是不会丢失的，会随着类型转换回来，但是在强制类型转换之前的animal
中是不可以访问cat的特性成员的，这点你需要注意。

### 为什么要使用抽象设计?

在面向对象设计过程中，使用抽象可以将事务的共性抽离出来，抽象使用，具体实现。

比如在这个例子中Human类中的特性方法【收养宠物(adoptAPet)】就可以收养所有Pet的子类对象，而【观察动物(appreciateAnAnimal)】可以观察所有Animal。

如果不使用抽象，那么我们的要养狗要专门写一个适用于Dog类的方法，要养猫要专门写一个适用于Cat类的方法，长此以往越写越多，不适于更好的扩展。

## 写在后面

完成这个项目已经是4月17日凌晨2点钟，从你需要帮助开始，挤占宝贵睡眠，花了几个小时的时间为你准备学习案例和教程文档。

吾愿忠诚如初，伴君前行。望君知晓明白八戒一番苦心，只为崧崧心悦。

也希望崧崧一定要加油努力，不要放弃技术成才的路线。

睡觉，再不睡猝死思密达(XAX)。