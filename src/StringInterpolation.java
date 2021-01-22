public class StringInterpolation {
    public static void main (String[] args) {
        String custname = "Joe Biden";
        int age = 78;
        String Address = "White House";
        String City = "Washington";
        String State = "DC";

        System.out.println(String.format("Student Details : Name %s, Age %d, Address %s, City %s, State %s", custname,age,Address,City,State));
    }
}
