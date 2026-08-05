class Solution {
    public boolean isValid(String s) {
        
        List<Character> open = List.of('(', '{', '[');
        List<Character> closed = List.of(')', '}', ']');
        Map<Character, Character> openclose = new HashMap<>();
        openclose.put(')', '(');
        openclose.put(']', '[');
        openclose.put('}', '{');

        Deque<Character> q = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(open.contains(c)){
                q.push(c);
            }
            if(closed.contains(c)){
                if(q.isEmpty()) return false;
                char popped = q.pop();
                if(openclose.get(c) != popped) return false;
            }
        }

        return q.isEmpty() ? true : false;

    }
}
