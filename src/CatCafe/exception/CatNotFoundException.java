package CatCafe.exception;

public class CatNotFoundException extends RuntimeException{
    public CatNotFoundException(){
        System.out.println("很抱歉，没有找到猫。");
    }
}
