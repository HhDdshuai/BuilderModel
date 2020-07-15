package v2;

/**
 *针对不同的需求，我们需要创建不同的建造者，来分别生产不同配置的产品
 *
 * 这仍不是建造者模式
 * 优点：
 * 1. 可以根据客户端的不同需求，使用不同的建造者生产产品
 *
 * 缺点：
 * 1. 我们发现多个建造者中的代码在重复！出现了重复代码
 * 2. 建造过程不稳定，如何在某个建造者创建产品的过程中，漏掉了某一步，编译器也不会提示。没有标准
 */
public class V2Test {
    public static void main(String[] args) {
        // 玩游戏
        AdvancedComputerBuilder advancedComputerBuilder = new AdvancedComputerBuilder();
        Computer computer = advancedComputerBuilder.build();
        System.out.println(computer);
        // 开发
        MiddleComputerBuilder middleComputerBuilder = new MiddleComputerBuilder();
        Computer computer2 = middleComputerBuilder.build();
        System.out.println(computer2);
        // 办公
        LowComputerBuilder lowComputerBuilder = new LowComputerBuilder();
        Computer computer3 = lowComputerBuilder.build();
        System.out.println(computer3);
    }
}
