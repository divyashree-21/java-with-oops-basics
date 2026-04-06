final class Animal{
    final int age = 20;
    final void move(){
        System.out.println("Inside the Animal class");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        System.out.println(obj1.age);
        obj1.age = 12;
        obj1.move();
        }    
}
