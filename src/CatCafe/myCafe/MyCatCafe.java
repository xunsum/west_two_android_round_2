package CatCafe.myCafe;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

import CatCafe.cats.BlackCat;
import CatCafe.cats.Cat;
import CatCafe.cats.CatGirl;
import CatCafe.cats.OrangeCat;
import CatCafe.customer.Customer;
import CatCafe.exception.CatNotFoundException;
import CatCafe.exception.InsufficientBalanceException;

public class MyCatCafe implements CatCafe {
    private String name;
    private double moneyLeft;
    private ArrayList<Cat> catList;
    private ArrayList<Customer> customerList;
    private ArrayList<Customer> todayCustomerList;
    boolean randomBool;
    int todayRuaTimesTotal = 0;

    public ArrayList<Cat> getCatList() {
        return catList;
    }
    public String getName() {
        return name;
    }
    public double getMoneyLeft() {
        return moneyLeft;
    }
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    public ArrayList<Customer> getTodayCustomerList() {
        return todayCustomerList;
    }

    public MyCatCafe(String name, double moneyLeft) {
        this.moneyLeft = moneyLeft;
        this.catList = new ArrayList<>();
        this.randomBool =  new Random().nextBoolean();
        this.customerList = new ArrayList<>();
        this.todayCustomerList = new ArrayList<>();
        this.name = name;
        /*在买猫时无法决定橘猫将来胖不胖所以随机(使用randomBool)，
        但是橘猫的基因可以决定它胖不胖，
        所以在 new 一只橘猫的时候可以定义它将来胖不胖。（狗头）
        */
    }

    @Override
    public void BuyCat(String catName, int age, boolean isMale, String type) throws InsufficientBalanceException {

        if (type.replace(" ", "").equalsIgnoreCase("blackcat")) {
            catList.add(new BlackCat(catName, age, isMale));
            this.moneyLeft = this.moneyLeft - catList.get(catList.size()-1).getPrice();
            try{
                if (this.moneyLeft < 0){
                    throw new InsufficientBalanceException(moneyLeft + catList.get(catList.size()-1).getPrice());
                }
            }catch (Exception ignore){
                moneyLeft = moneyLeft + catList.get(catList.size()-1).getPrice();
                catList.remove(catList.size()-1);
                return;
            }
            System.out.println("买入一只黑猫，姓名：" + catName);
        } else if (type.replace(" ", "").equalsIgnoreCase("orangecat")) {
            catList.add(new OrangeCat(catName, age, isMale, randomBool));
            this.moneyLeft = this.moneyLeft - catList.get(catList.size()-1).getPrice();
            try{
                if (this.moneyLeft < 0){
                    throw new InsufficientBalanceException(moneyLeft + catList.get(catList.size()-1).getPrice());
                }
            }catch (Exception ignore){
                moneyLeft = moneyLeft + catList.get(catList.size()-1).getPrice();
                catList.remove(catList.size()-1);
                return;
            }
            System.out.println("买入一只橘猫，姓名：" + catName);
        } else if (type.replace(" ", "").equalsIgnoreCase("catgirl")) {
            catList.add(new CatGirl(catName, age));
            this.moneyLeft = this.moneyLeft - catList.get(catList.size()-1).getPrice();
            try{
                if (this.moneyLeft < 0){
                    throw new InsufficientBalanceException(moneyLeft + catList.get(catList.size()-1).getPrice());
                }
            }catch (Exception ignore){
                moneyLeft = moneyLeft + catList.get(catList.size()-1).getPrice();
                catList.remove(catList.size()-1);
                return;
            }
            System.out.println("买入一只猫娘，姓名：" + catName);
        } else{
            System.out.println("请输入 Black Cat / Orange Cat / Black Cat / Cat Girl 之一");
        }

    }

    @Override
    public void ServeCustomer(String name, int ruaTimes) throws CatNotFoundException {
        Customer customer = new Customer(name,ruaTimes);
        try{
            if (catList.size() == 0){
                throw new CatNotFoundException();
            }}catch (Exception ignore){return;}
        customerList.add(customer);
        todayCustomerList.add(customer);
        moneyLeft = moneyLeft + 15 * ruaTimes;
        for(int i = 0; i <= ruaTimes; i++){
            System.out.println("rua猫 ing...");
            Cat catBeRuaing = catList.get(new Random().nextInt(catList.size()));
            System.out.println("rua到了这只猫：" + catBeRuaing);
            moneyLeft = moneyLeft + 15;
            todayRuaTimesTotal++;
        }
    }

    @Override
    public void CloseShop() {
        LocalDate date = LocalDate.now();
        System.out.println("准备歇业，现在时间：" + date + "\n今天的顾客信息:\n"
        + customerList
        + "\n今日收入："
        + todayRuaTimesTotal * 15);
        todayCustomerList.clear();
        todayRuaTimesTotal = 0;
        System.out.println("关店成功!");
    }

    @Override
    public String toString(){
        return "店铺名：" + getName() +
                "\n店铺资金：" + getMoneyLeft() + "元" +
                "\n猫咪列表：" + getCatList();
    }
}
