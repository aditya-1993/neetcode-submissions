class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            String key = getKey(s);
            List<String> keySet = map.get(key);
            if(keySet == null){
                keySet = new ArrayList<>();
            }
            keySet.add(s);
            map.put(key, keySet);
        }

        for(String s : map.keySet()){
            res.add(map.get(s));
        }
        return res;
    }


    private String getKey(String s){
        int[] k = new int[26];

        for(char c : s.toCharArray()){
            k[c - 'a']++;
        }
        return Arrays.toString(k);
    }
}
