class Solution {
    public static boolean check(String s, char j)
    {
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == j)
            {
                return true;
            }
        }

        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int left = 0, right = 0;
        int n = s.length();

        while(right < n)
        {
            if(!check(s.substring(left, right), s.charAt(right)))
            {
                right++;
            }
            else
            {
                left++;
            }

            count = Math.max(right - left, count);
        }

        return count;
        
    }
}