class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num > 1){
            if(num % 2 == 0){
                num /= 2;
                count++;
            }else{
                num -= 1;
                count++;
            }
        }
        if(num == 1){
            num-= 1;
            count++;
        }else if(num == 0){
            count = 0;
        }
        return count;
}
}