import java.util.*;

class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;//This will count how many numbers divide n exactly (no remainder).

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 3)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
    }
}

