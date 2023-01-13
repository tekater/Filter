import java.util.Scanner;

public class Main {
    public static String easy() {
        return "EASY";
    }
    public static String hard() {
        return "HARD";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String one = "This text is simple to read! It has on average less than 10 words per sentence. one more sentences";
        String two = "This text is hard to read. It contains a lot of sentences as well as a lot of words in each sentence";
        // изменил регулярку, чтобы разделяло предложения в строке (! и .)
        String[] inputArray = input.split("[!\\.\\?]");
        String[] sentenceOne = one.split("[!\\.\\?]");
        String[] sentenceTwo = two.split("[!\\.\\?]");

        // нахожу количество слов в общем, без деления на предложения,
        int inputLength = input.split("").length;
        int wordsOne = one.split("").length;
        int wordsTwo = two.split("").length;
        // input - start
        if (inputLength / inputArray.length <= 10) {
            System.out.println(easy());
        } else {
            System.out.println(hard());
        }
        // input - end
        
        // первый текст
        if (wordsOne / sentenceOne.length <= 10){
            System.out.println(easy());
        } else{
            System.out.println(hard());
        }
        // Второй текст
        if (wordsTwo / sentenceTwo.length < 10){
            System.out.println(easy());
        } else{
            System.out.println(hard());
        }
    }
}
