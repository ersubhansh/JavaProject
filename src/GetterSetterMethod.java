public class GetterSetterMethod {
    public static void main(String[] args){
        Automobile A1= new Automobile("Ford","Ecosport",2013);
        System.out.println(A1.getMake());
        System.out.println(A1.getModel());
        System.out.println(A1.getYear());

        A1.setMake("Toyota");
        A1.setModel("Ecosport");
        A1.setYear(2013);
    }

}
