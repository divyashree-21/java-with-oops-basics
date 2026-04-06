abstract class A{
    abstract void display(int wheel);
    void show(){
        System.out.println("inside class A");
    }
}
abstract class B extends A {
    void display(int wheel){
        System.out.println("Car can move with "+wheel+" wheels");
    }
}
class C extends B {
    void display_we(int wheel){
        System.out.println("Car can move with "+wheel+" wheels");
    }
}
public class Abstractclass {
    public static void main(String[] args){
        C obj = new C();
        obj.display(4);
    }
}
