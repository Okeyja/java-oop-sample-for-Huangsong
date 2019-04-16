package clss.pet;

import abst.Pet;

/**
 * 小狗
 *
 * @author Okeyja
 * @version 2019/04/16 016 23:46
 */
public class Dog extends Pet {

    public Dog() {
        name = "小狗";
        food = "肉";
    }

    @Override
    public void eat() {
        System.out.println(name + "吃" + food);
    }

    @Override
    public void run() {
        System.out.println(name + "高兴地跑");
    }

    @Override
    public void disburse(String something) {
        food = something;
    }

    @Override
    public String gain() {
        return name + "吃了人给的" + food + "，然后向人摇尾巴。";
    }
}
