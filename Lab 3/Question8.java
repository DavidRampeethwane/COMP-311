import java.util.Scanner;//import the Scanner class to read input from the user

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//create a Scanner object to read input from the user

        // Ask the user to enter a word or sentence
        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine();//read the user's input and store it in the variable text    

        int vowelCount = 0;                                                       //declare an integer variable to store the count of vowels

         // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));                     // normalize to lowercase

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {//check if the character is a vowel
                vowelCount++;                                                   //increment the vowel count if a vowel is found
            }
        }

        // Print the result
        System.out.println("The number of vowels in the text is: " + vowelCount);
    }
}
