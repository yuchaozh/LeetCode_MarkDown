class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            map[c - 'a']--;
        }
        for (int num : map) {
            if (num != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "listen";
        String t1 = "silent";
        System.out.println(isAnagram(s1, t1)); // Expected output: true
    
        // Test case 2
        String s2 = "hello";
        String t2 = "world";
        System.out.println(isAnagram(s2, t2)); // Expected output: false
    
        // Test case 3
        String s3 = "anagram";
        String t3 = "nagaram";
        System.out.println(isAnagram(s3, t3)); // Expected output: true
    
        // Test case 4
        String s4 = "rat";
        String t4 = "car";
        System.out.println(isAnagram(s4, t4)); // Expected output: false
    
        // Test case 5
        String s5 = "";
        String t5 = "";
        System.out.println(isAnagram(s5, t5)); // Expected output: true
    }
}