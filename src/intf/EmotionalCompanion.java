package intf;

/**
 * 情感伴侣 - 接口
 * 与情感伴侣交流，通常需要一定的代价来换取一定的回应。
 *
 * @author Okeyja
 * @version 2019/04/16 016 23:49
 */
public interface EmotionalCompanion {
    /**
     * 付出
     *
     * @param something 付出东西
     */
    void disburse(String something);

    /**
     * 获得
     */
    String gain();
}
