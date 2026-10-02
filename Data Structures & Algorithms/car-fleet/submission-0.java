class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        double[][] posTimeMap = new double[position.length][2];

        for(int i = 0 ; i < position.length ; i++){
            posTimeMap[i][0] = position[i];
            posTimeMap[i][1] = (double)(target - position[i])/speed[i];
        }

        Arrays.sort(posTimeMap, (a,b) -> Double.compare(b[0], a[0]));

        int res = 0;
        double maxTime = 0;
        for(double[] pos : posTimeMap){
            if(pos[1] > maxTime){
                res++;
                maxTime = pos[1];
            }
        }

        return res;
    }
}
