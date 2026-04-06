class Animal{
    void move(){
        System.out.println("Inside the Animal class");
    }
    void display(){
        System.out.println("Display method");
    }
    static void sound(int decible){
        System.out.println("Animal sound upto "+decible+"decibles");
    }
}
class Cat extends Animal{
    @Override void move(){
        super.move();
        System.out.println("Inside the cat class");
    }
    static void sound(int dec){
        System.out.println("Cat can sound upto 10 decibles");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        Animal obj = new Cat();
        obj.move();
        obj.sound(10);
    }
    
}
