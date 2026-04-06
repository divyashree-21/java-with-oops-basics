class Outer{
    int age = 10;
    String name = "Ravi";
    void display(){
        System.out.println("Outer class");
        Inner obj = new Inner();
        obj.display();
    }
    class Inner{
        double cgpa = 9.0f;
        void display(){
            System.out.println(age);
            System.out.println(name);
            System.out.println(cgpa);
        }
    }
    void show(){
        Inner obj = new Inner();
        System.out.println(obj.cgpa);
    }
}
public class Nestedclass {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner objj = new Outer().new Inner();// obj1.new Inner();
        obj1.show();
        objj.display();
        System.out.println(objj.cgpa);
        
    }
    
}
