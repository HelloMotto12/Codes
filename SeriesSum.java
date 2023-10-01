package school.Recursion;

import java.util.Scanner;
//A class SeriesSum is designed to calculate the sum of the following series:
//        Sum=x^2/1!+x^4/3!+x^6/5!+…x^n/(n−1)!
class SeriesSum {
    int x, n; double sum;
    SeriesSum(int xx, int nn) {
        x = xx; n = nn;
    }
    double find_fact(int m){
        if (m == 0) {
            return 1;
        } else {
            return m * find_fact(m - 1);
        }
    }
    double find_power(int x, int y) {
        if (y == 0) {return 1;}
        else {return x * find_power(x, y - 1 );}
    }
    void calculate() {
        for(int i = 2; i <= n; i += 2) {
            sum = (sum + find_power(x, i)/ find_fact(i-1));
        }
    }
    void display() {
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int x = sc.nextInt();
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();
        SeriesSum obj = new SeriesSum(x,n);
        obj.calculate(); obj.display();
    }
}
