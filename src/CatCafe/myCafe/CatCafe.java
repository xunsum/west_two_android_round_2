package CatCafe.myCafe;

public interface CatCafe {
    void BuyCat(String catName, int age, boolean isMale, String type);
    void ServeCustomer(String name, int ruaTimes);
    void CloseShop();
    String toString();
}
