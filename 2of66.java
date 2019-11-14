public class Solution {
    public String replaceSpace(StringBuffer str) {
    	int len = str.length();
        StringBuffer temp = new StringBuffer();
        for(int i = 0;i<len;i++){
            if(str.charAt(i)==' '){
                temp.append('%');
                temp.append('2');
                temp.append('0');
            }
            else{
                temp.append(str.charAt(i));
            }
        }
        return temp.toString();
    }
}
