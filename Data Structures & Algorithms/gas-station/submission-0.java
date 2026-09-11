class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=0;
        int costSum=0;
        for(int i : gas){
            gasSum+=i;
        }
        for(int i : cost){
            costSum+=i;
        }
        if(gasSum<costSum) return -1;
        int sum=0;
        int stIdx=0;
        for(int i=0; i<gas.length; i++){
            sum = sum + gas[i] - cost[i];
            if(sum<0){
                stIdx=i+1;
                sum=0;
            }
        }
        return stIdx;
    }
}
