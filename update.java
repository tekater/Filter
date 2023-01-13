public class Main {
    public static void main(String[] args) {
        String[] filter1 = "This text is simple to read! It has on average less than 10 words per sentence. one more sentences".split("[\\d\\w,] ");
        String[] filter2 = "This text is hard to read. It contains a lot of sentences as well as a lot of words in each sentence".split("[\\d\\w,] ");
        /// Первый текст
        System.out.println("This text is simple to read! It has on average less than 10 words per sentence.");
        int length1 = filter1.length;
        int length2 = filter2.length;
        System.out.println(length1);
       if ((length1/2) < 10){
            System.out.println("Easy");
        } else{
            System.out.println("Hard");
        }
        /// Второй текст
        System.out.println("This text is hard to read. It contains a lot of sentences as well as a lot of words in each sentence");
        System.out.println(length2);
        if ((length2/2) < 10){
            System.out.println("Easy");
        } else{
            System.out.println("Hard");
        }
    }
}
