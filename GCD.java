import java.util.*;
class GCD {
    Scanner sc = new Scanner(System.in);
    int de = 0, d = 0, rem = 0;
    void input() {
        System.out.print("Enter the larger number:");
        de = sc.nextInt();
        System.out.print("Enter the smaller number:");
        d = sc.nextInt();
    }
    void calc() {
        rem = de % d;
        while(rem != 0) {
            de = d;
            d = rem;
            rem = de % d;
        }
        System.out.println("GCD:" + d);
    }
    public static void main(String[] args) {
        GCD obj = new GCD();
        obj.input(); obj.calc();
    }
}
