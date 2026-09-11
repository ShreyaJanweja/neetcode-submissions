class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] count = new int[10001];
        int people=0;
        int from=0;
        int to=0;
        for(int[] trip : trips){
            people = trip[0];
            from = trip[1];
            to = trip[2];
            count[from] += people;
            count[to] -= people;
        }
        int current=0;
        for(int i=0; i<count.length; i++){
            current+=count[i];
            if(current>capacity) return false;
        }
        return true;
    }
}