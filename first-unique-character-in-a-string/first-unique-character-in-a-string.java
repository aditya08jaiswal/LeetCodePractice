class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();

        for (int i=0; i<n; i++) {
            int index = s.charAt(i) - 'a';
            System.out.println(index);
            count[index]++;
        }
        System.out.println(Arrays.toString(count));
        for (int i=0; i<n; i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}