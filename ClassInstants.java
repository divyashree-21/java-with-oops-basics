class Box{
    static int h;
    int w,l;
    void display(){
        System.out.println("Height :"+h+"Width :"+w+"Lenght :"+l);
    }
    static void display_det(){
        System.out.println("static method");
    }
}
public class ClassInstants {
    public static void main(String[] args) {
        Box obj1 = new Box();
        obj1.h = 20;
        obj1.w = 30;
        obj1.l = 40;
        Box obj2 = new Box();
        obj2.h = 50;
        obj2.w = 60;
        obj2.l = 70;
        obj1.display();
        obj2.display();
        Box.display_det();
    }

    
}
