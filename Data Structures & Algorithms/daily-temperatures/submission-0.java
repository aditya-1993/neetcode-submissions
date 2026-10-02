class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        Deque<Integer> st = new ArrayDeque<>();

        for(int i = 0 ; i < temperatures.length ; i++){
            int curr = temperatures[i];

            while(!st.isEmpty() && temperatures[st.peek()] < curr){
                int poppedT = st.pop();
                result[poppedT] = i - poppedT;
            }
            st.push(i);
        }

        return result;
    }
}
