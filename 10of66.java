public class Solution {
    public int NumberOf1(int n) {
        char[] ch = Integer.toBinaryString(n).toCharArray();
        int count=0;
        for(int i =0;i<ch.length;i++){
            if(ch[i]=='1'){
                count++;
            }
        }
        return count;
    }
}
