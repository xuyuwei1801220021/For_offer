import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0){
            return 0;
        }
        for(int i = array.length-1;i>0;i--){
            if(array[i]<array[i-1]){
                return array[i];
            }
        }
        return array[0];
    }
}
