class ReverseVowels {
    public static String reverseVowels(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        String vowels = "aeiouAEIOU";
        int left = 0, right = s.length() - 1;
        char[] array = s.toCharArray();

        while (left < right) {
            while (left < right && vowels.indexOf(array[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(array[right]) == -1) {
                right--;
            }

            char temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }

        return new String(array);
    }
    

    public static void main(String[] args) {
        // Test Case 1
    String s1 = "hello";
    String expectedOutput1 = "holle";
    String actualOutput1 = ReverseVowels.reverseVowels(s1);
    System.out.println("Test Case 1: " + (expectedOutput1.equals(actualOutput1)));

    // Test Case 2
    String s2 = "DesignGUrus";
    String expectedOutput2 = "DusUgnGires";
    String actualOutput2 = reverseVowels(s2);
    System.out.println("Test Case 2: " + (expectedOutput2.equals(actualOutput2)));

    // Test Case 3
    String s3 = "AEIOU";
    String expectedOutput3 = "UOIEA";
    String actualOutput3 = reverseVowels(s3);
    System.out.println("Test Case 3: " + (expectedOutput3.equals(actualOutput3)));

    // Test Case 4
    String s4 = "aA";
    String expectedOutput4 = "Aa";
    String actualOutput4 = reverseVowels(s4);
    System.out.println("Test Case 4: " + (expectedOutput4.equals(actualOutput4)));

    // Test Case 5
    String s5 = "";
    String expectedOutput5 = "";
    String actualOutput5 = reverseVowels(s5);
    System.out.println("Test Case 5: " + (expectedOutput5.equals(actualOutput5)));
    }
}
