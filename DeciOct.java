import java.util.*;
class DeciOct {
    int n, oct, n1;
    DeciOct() {n = 0; oct = 0;}
    void getnum(int nn) {n = nn;n1 = n;}
    void deci_oct() {
        if(n == 0) {}
        else {
            int d = n % 8; n = n / 8; deci_oct(); oct = oct * 10 + d;
        }
    }
    void show() {
        deci_oct();
        System.out.println("Decimal Number:" + n1);
        System.out.println("Octal Number:" + oct);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = sc.nextInt();
        DeciOct obj = new DeciOct();
        obj.getnum(n); obj.deci_oct(); obj.show();
    }
}
