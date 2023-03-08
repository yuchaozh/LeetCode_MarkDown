import java.util.HashSet;
import java.util.Set;

class Pangram {
  // Function to check if given sentence is pangram
  public static boolean checkIfPangram(String sentence) {
    if (sentence == null || sentence.length() < 26) {
        return false;
      }
      
      // Create a set to store unique characters
      Set<Character> set = new HashSet<>();
      // Convert sentence to lowercase and iterate over each character
      for (char c : sentence.toLowerCase().toCharArray()) {
        if (c >= 'A' && c <= 'z') {  // Character.isLetter(currChar)
            // Add the character to set
            set.add(c);
        }
      }
      
      // Return true if set size is 26 (total number of alphabets)
      return set.size() == 26;
  }

  public static void main(String[] args) {
    // Test case 1: "TheQuickBrownFoxJumpsOverTheLazyDog"
    // Expected output: true
    System.out.println(Pangram.checkIfPangram("TheQuickBrownFoxJumpsOverTheLazyDog"));

    // Test case 2: "This is not a pangram"
    // Expected output: false
    System.out.println(Pangram.checkIfPangram("This is not a pangram"));

    // Test case 3: "abcdef ghijkl mnopqr stuvwxyz"
    // Expected output: true
    System.out.println(Pangram.checkIfPangram("abcdef ghijkl mnopqr stuvwxyz"));

    // Test case 4: ""
    // Expected output: false
    System.out.println(Pangram.checkIfPangram(""));

    // Test case 5: "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    // Expected output: true
    System.out.println(Pangram.checkIfPangram("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
  }
}
