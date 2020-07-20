public class Exercise9 {

    public static void main(String[] args) {

        System.out.println(fib(2));

    }



    public static int fib(int n) {

        int num1 = 1;
        int num2 = 1;
        int temp;

        for (int i = 2; i < n; i++) {

            temp = num1;
            num1 += num2;
            num2 = temp;

        }

        return num1;

    }
}
