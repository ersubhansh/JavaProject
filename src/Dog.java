public class Dog {
    public static void main(String[] args) {
        name_of_dog("Max");
        bark();
        eat();
        sleep();
        play();

        name_of_dog("Jackie");
        bark();
        eat();
        sleep();
        play();
    }

    public static void name_of_dog(String name){
        System.out.println("My name is " + name);
    }

    public static void bark(){
        System.out.println("I am barking");
    }
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void sleep(){
        System.out.println("I am sleeping");
    }
    public static void play(){
        System.out.println("I am playing");
    }

}
