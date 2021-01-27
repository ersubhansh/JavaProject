package Overriding;

public class Addition {
    public int add(int a , int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a , double b){
        return a+b;
    }
    public static void main (String[] args){
        Addition a= new Addition();
        System.out.println(a.add(10, 20, 30));
        System.out.println(a.add(15,25));
        System.out.println(a.add(20.2,40.4));
    }
}



