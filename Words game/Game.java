import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        String[] words = {"penguin", "apple", "dog", "uncle", "ape", "beautiful"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String response;

        //number of fails
        int fails = 0;
        //round
        int round = 0;

        while(fails <= 3){
            //random word from array of words
            String word = words[random.nextInt(words.length)];

            String hashWord = word;

            //increasing number of "*"
            for (int i = 0; i <= round && i/5 <= hashWord.length() - 2; i+=5){

                //random char from word
                char rc = hashWord.charAt(random.nextInt(word.length()));

                //search ror another char if we got '*'
                while(rc == '*'){
                    rc = hashWord.charAt(random.nextInt(word.length()));
                }

                //rc into *
                hashWord = hashWord.replaceFirst(String.valueOf(rc), "*");
            }


            //display random word
            System.out.print("Your random word: ");
            System.out.println(hashWord);

            //ask to enter word
            System.out.print("Enter word: ");
            response = scanner.nextLine();

            if (word.equalsIgnoreCase(response)){
                round++;
                System.out.println("You got it!\n");
            } else {
                fails++;
                System.out.println("Nope. The word is " + word + "\n");
            }
        }
        //end of game
        System.out.println("End of game! You've got "  + round + " points.");
    }
}
