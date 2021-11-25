package CatCafe.customer;

import java.time.LocalDate;

public class Customer {
    private String name;
    private int ruaTimes;
    private LocalDate arrivingTime;
//getter setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRuaTimes() {
        return ruaTimes;
    }
    public void setRuaTimes(int ruaTimes) {
        this.ruaTimes = ruaTimes;
    }
    public LocalDate getArrivingTime() {
        return arrivingTime;
    }

//constructor
    public Customer(String name, int ruaTimes) {
        this.name = name;
        this.ruaTimes = ruaTimes;
        this.arrivingTime = LocalDate.now();
    }

//toString

    @Override
    public String toString() {
        return "顾客信息：" +
                "\n名字：" + name  +
                "\n想rua " + ruaTimes +
                "次 猫,\n他的到达时间是：" + arrivingTime;
    }
}
