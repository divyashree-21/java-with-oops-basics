class Box{
    public double height;
    Box(){
        height = 1.0;
    }
    public void display(){
        System.out.println("Height :"+height);
    }
}
public class AccessSpecifiers {
    public static void main(String[] args) {
        Box obj1 = new Box();
        obj1.display();
        obj1.height = 10.5;
        obj1.display();
    }
    
}
