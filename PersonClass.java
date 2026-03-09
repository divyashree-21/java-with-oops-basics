class person{
    char gender;
    int age;
    String name;
    void Walking(){
        System.out.println(name+" is walking");
    }
    void Talking(){
        System.out.println(name+" is talking");
    }
}
public class PersonClass {
    public static void main(String[] args){
        person obj1 = new person();
        person obj2 = new person();
        obj1.gender = 'M';
        obj1.age = 25; 
        obj1.name = "Raj";
        obj2.gender = 'F';
        obj2.age = 30;
        obj2.name = "Alice";
        System.out.println("for object 1:");
        obj1.Walking();
        obj1.Talking();
        System.out.println("for object 2:");    
        obj2.Walking();
        obj2.Talking();
    }     
    
}
