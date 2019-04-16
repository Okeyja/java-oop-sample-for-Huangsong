package clss.other;

import intf.Animal;

/**
 * 老虎
 * 这里的老虎还可以抽象出beast
 *
 * @author Okeyja
 * @version 2019/04/16 016 23:48
 */
public class Tiger implements Animal {
    @Override
    public void eat() {
        System.out.println("老虎抓野鹿吃");
    }

    @Override
    public void run() {
        System.out.println("老虎飞快地跑");
    }

    /**
     * 攻击人类是老虎的特性方法
     */
    public void attack() {
        System.out.println("危险！老虎攻击人类！");
    }
}
