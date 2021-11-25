package CatCafe.cats;

public abstract class Cat {
    protected String name;
    protected int age;
    protected boolean isMale;
    protected double price;
//getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isMale() {
        return isMale;
    }
    public void setMale(boolean male) {
        isMale = male;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
//constructor
    public Cat(String name, int age, boolean isMale, double price) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.price = price;
    }
//toString method
@Override
    public abstract String toString();
    }
