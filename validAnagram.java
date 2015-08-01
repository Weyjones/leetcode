public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(hm.get(c) == null)
                hm.put(c,1);
            else
                hm.put(c, hm.get(c)+1);
        }
        for(int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            if(hm.get(c) == null)
                return false;
            hm.put(c, hm.get(c)-1);
        }
        Set<Character> keys = hm.keySet();
        for(char c : keys)
        {
            if(hm.get(c) != 0)
                return false;
        }
        return true;
    }
}