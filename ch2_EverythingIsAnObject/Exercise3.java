public class Exercise3 {

    public static void main(String[] args) {

        ATypeName someObj = new ATypeName();

        someObj.printCat();

    }
}

class ATypeName {
    public void printCat() {

        String multilineCat = "  ./\\…/\\ \n (.‘•..•’.) \n  ..=*=.. \n(.\\.||./.)~~**";
        System.out.println(multilineCat);

    }
}
