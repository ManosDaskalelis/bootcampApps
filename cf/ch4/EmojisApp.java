package gr.aueb.cf.ch4;

/**
<<<<<<< HEAD
 * Εμφανίζει  τα emojis στο range
=======
 * Εμφανίζει ολαα τα emojis στο range
>>>>>>> e9dbb517e4291eddca609fa5d856ab8e65ffaa01
 * U+1F600 - U+1F64F
 */
public class EmojisApp {

    public static void main(String[] args) {
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji <= emojiEnd) {
            System.out.print(Character.toChars(emoji)); // Surrogate Pairs
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                System.out.println();
            }
        }
    }
}
