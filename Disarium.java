import java.util.*;
class Disarium {
    int num, size;
    Disarium(int nn) {num = nn; size = 0;}
    void countdigits() {
        Integer f = num; String s = f.toString(); size = s.length();
    }
    int sumofDigits(int n, int p) {
        if(p == 0) {return 0;}
        else {return (int)(Math.pow((n % 10), p)) + sumofDigits(n / 10, p - 1);}
    }
    void check() {
        int s = sumofDigits(num, size);
        if(s == num) {
            System.out.println("Number is Disarium");
        }
        else {
            System.out.println("Number is not Disarium");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        Disarium obj = new Disarium(n);
        obj.countdigits(); obj.check();
    }
}
