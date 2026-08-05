class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> openclose = new HashMap<>();
        openclose.put(')', '(');
        openclose.put(']', '[');
        openclose.put('}', '{');

        Deque<Character> q = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(!openclose.containsKey(c)){
                q.push(c);
            }
            else{
                if(q.isEmpty() || openclose.get(c) != q.pop()) return false;
            }
        }

        return q.isEmpty();

    }
}
