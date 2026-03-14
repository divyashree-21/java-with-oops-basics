class Addition
{
    void add(){
        int a = 10,b = 20;
        System.out.println("Addition  = "+(a+b));
    }
    void add(int a){
        System.out.println("Addition : "+(a+5));
    }
    void add(int a,int b){
        System.out.println("Addition  = "+(a+b));
    }
    void add(double a,double b){
        System.out.println("addition  = "+(a+b));
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

}
public class AddMethodOverloading {
    public static void main(String[] args) {
        Addition obj1 = new Addition();
        obj1.add();
        obj1.add(10);
        obj1.add(10, 20);
        obj1.add(10.5, 20.5);
        System.out.println(obj1.add(10, 20, 30));
    }
}
