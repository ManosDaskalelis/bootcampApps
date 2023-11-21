package gr.aueb.cf.ch7;

public class HelloString {

    public static void main(String[] args) {
        String alice = "Alice";
        String bob = "Bob";

        System.out.println(alice + " " + bob);
        System.out.printf("%s %s\n", alice, bob);
        System.out.println("Total length of Alice string: " + alice.length());
        System.out.println("Total length of Bob string: " + bob.length());
    }
}
