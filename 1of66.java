public class Solution {
    public boolean Find(int target, int [][] array) {
        int first = array.length-1;
        int second = array[0].length-1;
        int i = 0;
        while(first>=0 && i<=second){
            if(target>array[first][i]){
                i++;
            }
            else if(target<array[first][i]){
                first--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
