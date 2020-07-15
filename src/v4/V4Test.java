package v4;

/**
 *这就是建造者模式
 * 优点：
 *  1. 创建对象的过程是稳定不变的
 *  2. 创建对象的过程只写了一次，没有重复代码（指挥者完成）
 *  3. 当需要扩展指挥者的时候，不用修改之前的代码，符合开闭原则
 *
 *
 *  建造者模式与工厂模式的区别
 *  工厂模式只需要一个简单的new，new出产品即可。
 *  建造者更注重，在new出产品之后的，为产品赋值的过程！
 */
public class V4Test {
    public static void main(String[] args) {

        AdvancedComputerBuilder advancedComputerBuilder = new AdvancedComputerBuilder();
        MiddleComputerBuilder middleComputerBuilder = new MiddleComputerBuilder();
        LowComputerBuilder lowComputerBuilder = new LowComputerBuilder();
        Director director = new Director();

        // 玩游戏
        Computer computer = director.build(advancedComputerBuilder);
        System.out.println(computer);
        // 开发

        Computer computer2 = director.build(middleComputerBuilder);
        System.out.println(computer2);
        // 办公

        Computer computer3 = director.build(lowComputerBuilder);
        System.out.println(computer3);
    }
}
