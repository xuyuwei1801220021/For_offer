public class Solution {
    public double Power(double base, int exponent) {
        double sum = base;
        if( exponent==0){
            return 1.0;
        }
        else if( exponent==1 || exponent==-1){
            sum=sum;
        }
        else{
            for(int i =0;i< Math.abs(exponent)-1;i++){
                sum = sum*base;
            }
            
        }
        if(exponent<0){
                return 1/sum;
            }else{
                return sum;
            }
  }
}
