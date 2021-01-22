public class ForLoopArray {
    public static void main(String[] args) {
        double[] numlist = {123.12,224.13,125.14,126.15};
        for ( int i =0; i < numlist.length; i++) {
            System.out.println(numlist[i]);
        }

        double sum=0;
        for (int i =0; i < numlist.length; i++) {
            sum = sum + numlist[i];
        }
        System.out.println("Sum is :" + sum);

        double max = numlist[0];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] > max) {
                max = numlist[i];
            }
        }
        System.out.println("Max number is :" + max);
    }
}
