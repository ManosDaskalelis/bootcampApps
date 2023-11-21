package gr.aueb.cf.ch7;

public class StringSearch {

    public static void main(String[] args) {
        String s = "Athens Uni of Eco and Bus";

        if (s.contains("Uni")) {
            System.out.println("Bingo");
        }
        int index = s.indexOf("Uni, 8");
        System.out.println(index);

        if (s.startsWith("A")) {
            System.out.println("Bingo");
        }

        String wholeString = s.substring(6);
    }
}
