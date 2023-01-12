public class Main {
    public static void main(String[] args) {
        //String filter = "\\w {1,} \\w {1,} \\w {1,} \\w {1,} \\w {1,} \\w {1,} \\w {1,} \\w {1,} \\w {1,} \\w {1,}]";
        //System.out.println("This text is simple to read! It has on average less than 10 words per sentence.".matches(filter));
        //System.out.println("This text is hard to read. It contains a lot of sentences as well as a lot of words in each sentence".matches(filter));
        
        int filter1 = "This text is simple to read! It has on average less than 10 words per sentence.".split(" ").length;
        int filter2 = "This text is hard to read. It contains a lot of sentences as well as a lot of words in each sentence".split("").length;
        /// Первый текст
        System.out.println("This text is simple to read! It has on average less than 10 words per sentence.");
    
        if ((filter1/2) < 10){
        System.out.println("Easy");
        } else{
        System.out.println("Hard");
}
        /// Второй текст
        System.out.println("This text is hard to read. It contains a lot of sentences as well as a lot of words in each sentence");
        
        if ((filter2/2) < 10){
            System.out.println("Easy");
        } else{
            System.out.println("Hard");
        }
    }
}
