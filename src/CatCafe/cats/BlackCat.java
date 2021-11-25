package CatCafe.cats;

public class BlackCat extends Cat {
    private static double price = 350;
    public BlackCat(String name, int age, boolean isMale) {
        super(name, age, isMale, price);
    }

    @Override
    public String toString() {
        return "\n种族：黑猫"
                + "\n名字是：" + getName()
                + "\n年龄是：" + getAge()
                + "\n是公猫？ " + isMale()
                + "\n价格是: "+ getPrice();
    }
}
