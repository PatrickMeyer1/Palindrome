/**
 * This class takes a word and verifies if it is a palindrome 
 * Definition: A palindrome is a word that can be read the same backward or forwards
 */
public class Palindrome{

    // Instance variables

    private String word;
    private int wordLength;

    /**
     * The constructor takes as arguments the word to verify and sets wordLength to the length of the word that is passed in
     */
    public Palindrome(String word){
        // Sets the word to lowercase, because lowercase and uppercase letters in a word can still be a palindrome
        this.word = word.replaceAll("\\s", "").toLowerCase();
        this.wordLength = this.word.length();
    }

    /**
     * The function splits the word in half and checks if the element of the index of the first half is equal to the element of the index of the second half
     */
    public void findPalindrome(){
        for (int i = 0; i <= wordLength/2; i++){
            if(word.charAt(i) == word.charAt(wordLength-1-i)){
                System.out.println(word.charAt(i) + " is equal to " +  word.charAt(wordLength-1-i));
                if(i == wordLength/2) System.out.println("The word is a palindrome");
            } else {
                System.out.println(word.charAt(i) + " is NOT equal to " +  word.charAt(wordLength-1-i));
                System.out.println("The word is NOT a palindrome");
                break;
            }
        }
    }

    /**
     * The main method creates a Palindrome objects and calls the findPalindrome function
     */
    public static void main(String[] args){
        
        // Instanciating Palindrome objects
        Palindrome word0 = new Palindrome("LAVAL");
        Palindrome word1 = new Palindrome("LAval");        
        Palindrome word2 = new Palindrome("nuRseS rUN");
        Palindrome word3 = new Palindrome("LAVEEAL");
        Palindrome word4 = new Palindrome("DonKeY");

        // Calling the findPalindrome method
        System.out.println("Word 1: LAVAL");
        word0.findPalindrome();
        System.out.println("Word 2: LAval");
        word1.findPalindrome();
        System.out.println("Word 3: nuRseS rUN");
        word2.findPalindrome();
        System.out.println("Word 4: LAVEEAL");
        word3.findPalindrome();
        System.out.println("Word 5: DonKeY");
        word4.findPalindrome();
        
    }
}