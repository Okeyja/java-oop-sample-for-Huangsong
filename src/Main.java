import clss.other.Human;
import clss.other.Tiger;
import clss.pet.Cat;
import clss.pet.Dog;
import intf.Animal;
import intf.EmotionalCompanion;

public class Main {

    public static void main(String[] args) {
        // 场景1：所有对象视为 动物
        scene1();
        // 场景2：将情感伴侣强制转型为 具体对象
        scene2();
        // 场景3：加入一个特殊的动物 - 人，完成人养宠物和观察动物奔跑的特性动作
        // 场景3是比较实用的开发场景，涉及到依赖反转注入的动作。
        scene3();
    }

    private static void scene1() {
        System.out.println("====== 场景1 ======");
        Animal catAnimal = new Cat();
        catAnimal.eat();
        catAnimal.run();
        Animal dogAnimal = new Dog();
        dogAnimal.eat();
        dogAnimal.run();
        Animal tigerAnimal = new Tiger();
        tigerAnimal.eat();
        tigerAnimal.run();
    }

    private static void scene2() {
        System.out.println("====== 场景2 ======");
        EmotionalCompanion catCompanion = new Cat();
        Cat cat = (Cat) catCompanion; // 强制转型是一个不安全的操作，具体开发过程中建议不要如此操作
        cat.eat(); // 投喂之前吃老鼠

        catCompanion.disburse("猫粮");
        String gain = catCompanion.gain(); // 投喂后向人示好，返回到字符串
        System.out.println(gain); // 打印出我们获得的示好动作

        cat.eat(); // 投喂之后吃猫粮
    }

    private static void scene3() {
        System.out.println("====== 场景3 ======");
        Human human = new Human(); // 这里有一个人
        Cat cat = new Cat();       // 这里有一只猫
        Tiger tiger = new Tiger(); // 这里有一只老虎

        human.appreciateAnAnimal(tiger); // 观察老虎
        human.appreciateAnAnimal(cat);   // 观察猫
        human.adoptAPet(cat);            // 收养猫
        cat.eat();  // 爱心投喂之前猫吃老鼠，很可怜啊(T^T)~！
        human.feedACompanion(cat, "猫饼干");  // 投喂猫饼干
        cat.eat();  // 爱心投喂过后猫吃猫饼干了(OvO)~！
    }
}
