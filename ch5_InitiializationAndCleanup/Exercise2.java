public class Exercise2 {

    public static void main(String[] args) {

        AtPointOfDef at = new AtPointOfDef();
        System.out.println(at.str);

        InitByConstructor constr = new InitByConstructor();
        System.out.println(constr.str);

    }

}

class AtPointOfDef {

    String str = "a";

}

class InitByConstructor {

    String str;

    InitByConstructor() {

        str = "b";

    }

}
