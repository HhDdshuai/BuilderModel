package v3;

/**
 *创建一个建造者的抽象接口，把制作产品的具体步骤稳定下来。
 * 我们让建造者类，去实现建造者接口，接口中的方法步骤，类必须都要实现，少一个则会报错
 *
 * 优点：
 * 建造者类中的建造过程是稳定的。不会漏掉某一步！！这样客户端想扩展建造者时，也不会漏掉某一步
 *
 * 缺点:
 * 1. 代码依然重复
 * 2. 现在又变成了客户端自己配电脑，又违反了迪米特法则。
 * （相当于你去买电脑，虽然不用你亲自组装电脑，但是必须“指挥”那个装机的人，该装。。该装什么。。）
 */
public class V3Test {
    public static void main(String[] args) {
        // 玩游戏
        AdvancedComputerBuilder advancedComputerBuilder = new AdvancedComputerBuilder();
        advancedComputerBuilder.setCpu();
        advancedComputerBuilder.setGpu();
        advancedComputerBuilder.setMemery();
        advancedComputerBuilder.setHd();
        Computer computer = advancedComputerBuilder.build();
        System.out.println(computer);
        // 开发
        MiddleComputerBuilder middleComputerBuilder = new MiddleComputerBuilder();
        middleComputerBuilder.setCpu();
        middleComputerBuilder.setGpu();
        middleComputerBuilder.setMemery();
        middleComputerBuilder.setHd();
        Computer computer2 = middleComputerBuilder.build();
        System.out.println(computer2);
        // 办公
        LowComputerBuilder lowComputerBuilder = new LowComputerBuilder();
        lowComputerBuilder.setCpu();
        lowComputerBuilder.setGpu();
        lowComputerBuilder.setMemery();
        lowComputerBuilder.setHd();
        Computer computer3 = lowComputerBuilder.build();
        System.out.println(computer3);
    }
}
