package abst;

import intf.Animal;
import intf.EmotionalCompanion;

/**
 * 宠物 - 抽象类
 * 宠物是动物，也是情感伴侣
 *
 * @author Okeyja
 * @version 2019/04/16 016 23:51
 */
public abstract class Pet implements Animal, EmotionalCompanion {
    public String name = "宠物";
    public String food = "宠粮";
}
