class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int wealth =0;
       for(int i=0;i<accounts.length;i++){
           for(int j=0;j<accounts[i].length;j++){
              sum+=accounts[i][j]; 
           }
              if(wealth < sum){
                  wealth = sum;
              }else if(wealth == sum){
                  wealth = sum;
              }
               sum = 0;
       }
        return wealth;
    }
}