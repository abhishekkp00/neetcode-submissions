class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while(n != 1){

            if(set.contains(n)) return false;
            set.add(n);

            sum = 0;

            while(n > 0){
                int dig = n % 10;
                sum += dig * dig;
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
    
}
