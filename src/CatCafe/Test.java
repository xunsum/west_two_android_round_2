package CatCafe;
import CatCafe.myCafe.CatCafe;
import CatCafe.myCafe.MyCatCafe;

public class Test {
    public static void testAll(){
        //进行一个店的开
        System.out.println("开店：富有咖啡（Neko Para!）/ 贫穷咖啡 / 测试用无猫咖啡");
        CatCafe richCafe = new MyCatCafe("la soleli", 130000);
        CatCafe poorCafe = new MyCatCafe("my shop", 500);
        CatCafe noCatCafe = new MyCatCafe("shop that has no cat", 1);
        //店的 toString 测试
        System.out.println("店的 toString 测试");
        System.out.println(noCatCafe);
        //进行一个猫的买
        System.out.println("\n买香草:");
        richCafe.BuyCat("Banila", 16, true, "Catgirl");
        System.out.println("买巧克力:");
        richCafe.BuyCat("Chocola", 16, false, "Catgirl");
        System.out.println("买一只\"普通\"的黑猫:");
        poorCafe.BuyCat("little black", 2, true, "blackcat");
        //贫穷报错测试
        System.out.println("\n贫穷买不起猫娘被残忍拒绝（bushi）:");
        poorCafe.BuyCat("Zhi Pianren", 16, false, "Catgirl");
        //没猫报错测试
        System.out.println("\n没猫撸报错测试:");
        noCatCafe.ServeCustomer("ttt", 100);
        //进行一个顾客的招待
        System.out.println("\n招待测试:");
        richCafe.ServeCustomer("JiaXiang", 5);
        //歇业测试
        System.out.println("\n歇业测试:");
        richCafe.CloseShop();

    }
}
