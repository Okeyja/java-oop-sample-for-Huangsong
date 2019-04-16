package clss.other;

import intf.Animal;
import abst.Pet;
import intf.EmotionalCompanion;

/**
 * 人类
 *
 * @author Okeyja
 * @version 2019/04/17 017 00:36
 */
public class Human implements Animal {

    @Override
    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public void run() {
        System.out.println("人慢跑运动");
    }

    /**
     * 抽象设计方案：
     * 人类只能收养宠物，不能收养野生动物。
     *
     * @param pet 宠物
     */
    public void adoptAPet(Pet pet) {
        System.out.println("人类收养了一个：" + pet.name);
    }

    /**
     * 抽象设计方案：
     * 照看精神伴侣
     *
     * @param companion 伴侣
     * @param something 付出物品
     */
    public void feedACompanion(EmotionalCompanion companion, String something) {
        System.out.println("投喂伴侣动物，付出：" + something);
        companion.disburse(something);
        companion.gain();
    }

    /**
     * 抽象设计方案：
     * 人类观赏动物的奔跑，这里包括所有动物。
     *
     * @param animal 动物
     */
    public void appreciateAnAnimal(Animal animal) {
        System.out.print("人类观赏动物的奔跑：");
        animal.run();
    }
}
