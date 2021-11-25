package CatCafe.cats;

public class CatGirl extends Cat{//猫娘强制性别女
    private static boolean isMale = false;
    private static double price = 9999;

    public CatGirl(String name, int age){
        super(name, age, isMale, price);
    }


    @Override
    public String toString() {
        return "\n种族：猫娘"
                + "\n名字是：" + getName()
                + "\n年龄是：" + getAge()
                + "\n价格是"+ getPrice();
    }
}
