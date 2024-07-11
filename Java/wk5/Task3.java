package wk5;
interface Animal{
    void eat();
    void walk();
}
interface Printable{
     void display();
}
class Cow implements Animal,Printable{
    @Override
    public void display() {
        System.out.println("Display");
    }
    @Override
    public void eat() {
        System.out.println("eat");
    }
    @Override
    public void walk() {
        System.out.println("Walk");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.display();
        cow.walk();

    }
}
