public class ConditionEx {
    public static void main(String[] args) {
        double grade=1.0;

        if (grade == 4.0) {
            System.out.println("You are awesome student");
        } else if (grade >=3.5 && grade <4.0) {
            System.out.println("You are great student");
        } else if (grade >=3.0 && grade <3.5) {
            System.out.println("You are OK student");
        } else if (grade >=2.0 && grade <3.0) {
            System.out.println("You need Improvement");
        }  else {
            System.out.println("You are failed");
        }
    }
}
