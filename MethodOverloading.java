class Calculation{
    void mult(int a,int b){
        System.out.println("Multiplication  = "+a*b);
    }
    void mult(double a,double b){
        System.out.println("Multiplication  = "+a*b);
    }
    int mult(int a,int b,int c){
        return a*b*c;
    }
    double mult(double a){
        return a*5.0;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculation obj1 = new Calculation();
        System.out.println(obj1.mult(5.0));
        obj1.mult(3,4);
        obj1.mult(4.0,8.0);
        System.out.println(obj1.mult(5,7,9));
    
}}
