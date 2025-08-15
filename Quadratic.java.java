import java.util.*;

public class quadretic {
    public static void main(String[] args) {
        int a, b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        c = sc.nextInt();
        double d = b*b - 4*a*c;
        if (d < 0) {
            System.out.println("no real roots");
}
        double root1 = (-b + Math.sqrt(d)) / (2 * a);
       double root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("both roots are"+root1);
        System.out.println("both roots are"+root2);
    }

}