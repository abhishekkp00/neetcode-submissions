class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int no = 1;
        while (true) {
            long sum = 0;
            for(int i = 0; i < piles.length; i++){
                sum += (piles[i] + no - 1L) / no;
            }
            if(sum <= h){
                return no;
            }
            no++;
        }
    }
}
