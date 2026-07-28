/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals, (a,b) -> Integer.compare(a.start, b.start));
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(a, b));
        int max = 0;
        for(Interval i : intervals){
            if(pq.size() > 0 && pq.peek() <= i.start){
                pq.poll();   
            }
            pq.offer(i.end);
            max = Math.max(max, pq.size());
        }
        return max;
    }
}
