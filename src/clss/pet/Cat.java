package clss.pet;

import abst.Pet;

/**
 * 小猫
 *
 * @author Okeyja
 * @version 2019/04/16 016 23:43
 */
public class Cat extends Pet {

    public Cat() {
        name = "小猫";
        food = "老鼠";
    }

    @Override
    public void eat() {
        System.out.println(name + "吃" + food);
    }

    @Override
    public void run() {
        System.out.println(name + "懒洋洋地走");
    }

    @Override
    public void disburse(String something) {
        food = something;
    }

    @Override
    public String gain() {
        return name + "吃了人给的" + food + "，然后向人撒娇。";
    }
}
