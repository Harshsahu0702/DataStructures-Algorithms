class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i<s1.length();i++)        
        {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        int l=0;
        HashMap <Character, Integer> map2=new HashMap<>();
        for(int i = 0 ; i<s2.length();i++)        
        {
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            if(i-l+1==s1.length())
            {
                if(map.equals(map2))
                    return true;
                if(map2.containsKey(s2.charAt(l)))
                {
                    map2.put(s2.charAt(l),map2.get(s2.charAt(l))-1);
                    if(map2.get(s2.charAt(l))==0)
                    {
                        map2.remove(s2.charAt(l));
                    }
                } 
                l++;
            }
        }
        return false;
    }
}