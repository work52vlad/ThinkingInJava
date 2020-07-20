public class Exercise14 {

    public static void main(String[] args) {

        System.out.println(equals("str", "another_str"));

        System.out.println(equals("str", "str"));

        System.out.println(equals_method("str", "another_str"));

        System.out.println(equals_method("str", "str"));

    }

    static boolean equals(String str, String another_str) {

        return str == another_str;
    }

    static boolean equals_method(String str, String another_str) {

        return str.equals(another_str);
    }

}
