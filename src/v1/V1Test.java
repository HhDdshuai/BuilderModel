package v1;

/**
 * 目前这种写法还不是建造者模式，目前的优点:
 * 1. 客户端程序员需要一个产品时，直接向建造者要即可，建造者封装了电脑建造的复杂过程
 *
 * 目前缺点：
 * 1. 封装的太过了，无论客户是什么需求，都是采用最高的配置
 * 这相当于你去买电脑，不管你是买来干嘛的，商家都会给你配置最贵的电脑！
 *
 */
public class V1Test {
    public static void main(String[] args) {
        // 创建一个建造者
        ComputerBuilder computerBuilder = new ComputerBuilder();
        // 玩游戏
        Computer computer = computerBuilder.build();
        System.out.println(computer);
        // 开发
        Computer computer2 = computerBuilder.build();
        System.out.println(computer2);
        // 办公
        Computer computer3 = computerBuilder.build();
        System.out.println(computer3);
    }
}
