public class assignment {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;

//        Difference between the prefix and post fix is noticed when using the declared variables in expressions
        int a = 2 * ++n; // evaluates to 10
        int b = 2 * m++; // evaluates to 8--> this is because post-fix evaluates the original value of the variable


        System.out.println(a);
        System.out.println(b);
    }
}
