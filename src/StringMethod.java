public class StringMethod {
    public static void main(String[] args) {
        System.out.println(greet("Jake"));
        System.out.println(greet("Raj"));
        System.out.println(greet("Sanjiv"));
    }

    public static String greet(String name){
        return ("Hello " + name);
    }
}
