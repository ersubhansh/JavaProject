public class ConstructorMethod {

    public ConstructorMethod(){
        System.out.println("This is Constructor Method");
    }
    public ConstructorMethod(String param){
        System.out.println("This is Constructor Method with param " + param);
    }
    // Instance method
    public void InstanceMethod(){
        System.out.println("This is a InstanceMethod");
    }
}

class ConstructorMethodExample{
    public static void main(String[] args) {
        ConstructorMethod method1 = new ConstructorMethod();
        method1.InstanceMethod();

        ConstructorMethod method2 = new ConstructorMethod("Constructor");
        method2.InstanceMethod();
    }
}
