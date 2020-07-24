public class Exercise8 {

    public static void main(String[] args) {

        Count myCount = new Count();
        Count myAnotherCount = new Count();

        System.out.println("myCount = " + myCount.get_count());
        System.out.println("myAnotherCount = " + myAnotherCount.get_count());

        myCount.inc_count();

        System.out.println("myCount = " + myCount.get_count());
        System.out.println("myAnotherCount = " + myAnotherCount.get_count());

    }

}

class Count {

    static int count = 0;

    static void inc_count() {

        count++;

    }

    static int get_count() {

        return count;

    }

}
