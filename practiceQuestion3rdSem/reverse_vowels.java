public class reverse_vowels {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        
        int l = 0, r = arr.length - 1;
        
        while (l < r) {
            if (!vowels.contains(arr[l] + "")) {
                l++;
                continue;
            }
            if (!vowels.contains(arr[r] + "")) {
                r--;
                continue;
            }
            
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        
        return new String(arr);
    }
}





  
