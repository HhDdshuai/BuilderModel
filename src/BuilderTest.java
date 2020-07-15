/**
 * 需求： 定义一个电脑类，并且实例化电脑类的对象，以及给该对象赋值
 * 我们先不用建造者模式，看看会有什么问题？？
 * 1. 客户端程序，在实例化好产品之后，必须为该对象的每一个属性赋值，这样对客户端程序员来说，太复杂了，需要了解compter类的细节
 * 2. 违反了迪米特原则（最少知道原则）
 * 3. 客户端程序new出来computer对象不能立刻使用，需要设置很多属性
 *
 * 相当于你去买电脑，商家不是把电脑成品直接给你，而是给你一堆零件，让你自己组装
 *
 * 建造者模式与工厂模式的区别：
 * 工厂模式，都是直接实例化出一个类的对象即可。
 * 建造者模式，是在实例化出类的对象之后，还要给该对象每一个属性赋值！
 */

public class BuilderTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu("i5 9300H");
        computer.setGpu("gtx1650");
        computer.setMemery("16G");
        computer.setHd("256ssd + 1T机械");

        System.out.println(computer);
    }
}
