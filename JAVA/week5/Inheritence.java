package week5;
class Animal { //super or parent class
    private String color;
    Animal() {
        System.out.println("animal");
    }
    Animal(String color) {
        this.color = color;
    }
    final void eat() {
        System.out.println("animal eat");
    }
}
class Dog extends Animal { //child class
    int age;
    Dog(String color, int age){
        super(color);
        this.age=age;
    }
    void bark(){
        super.eat();
        System.out.println("dog barks");

    }
}
class BullDog extends Dog{
    BullDog(){
        super("brown", 15);
    }


    public class Inheritence {
        public static void main(String[] args) {
            Dog d1=new Dog("red",12);
            d1.eat();
            d1.bark();

        }
    }
}