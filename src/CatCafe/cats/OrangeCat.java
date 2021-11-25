package CatCafe.cats;

public class OrangeCat extends Cat{
    private static double price = 200;
    private boolean isFat;

    public OrangeCat(String name, int age, boolean isMale, boolean isFat){
        super(name, age, isMale, price);
        this.isFat = isFat;
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "\n种族：橘猫"
                + "\n名字是：" + getName()
                + "\n年龄是：" + getAge()
                + "\n是公猫？ " + isMale()
                + "\n价格是: "+ getPrice();
    }
}
