class Singleton{
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
public class SingletonDesignPattern {
    public static void main(String args[]){
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Objects are different instances.");
        }
    }
}
