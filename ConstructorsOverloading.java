class Box{
    double height,width,lenght;
    Box(){
        height=width=lenght=0.0;
    }
    Box(double height,double width){
        this.height = height;
        this.width = width;
    }
    Box(double h,double w,double l){
        height = h;
        width = w;
        lenght = l;
    }
}
public class ConstructorsOverloading {
    public static void main(String[] args) {
    Box obj1 = new Box();
    Box obj2 = new Box(10.5,20.5);
    Box obj3 = new Box(10.5,20.5,30.5);
    System.out.println("Height :"+obj1.height+"Width :"+obj1.width+"Lenght :"+obj1.lenght);
    System.out.println("Height :"+obj2.height+"Width :"+obj2.width+"Lenght :"+obj2.lenght);
    System.out.println("Height :"+obj3.height+"Width :"+obj3.width+"Lenght :"+obj3.lenght);  
}
}