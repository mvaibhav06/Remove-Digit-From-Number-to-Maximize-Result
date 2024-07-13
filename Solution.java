class Solution {
    public boolean isGreat(String a, String b){
        if(a.length() > b.length()){
            return true;
        }
        if(a.length() < b.length()){
            return false;
        }

        for(int i=0; i<a.length(); i++){
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            int a1 = Integer.parseInt(c1+"");
            int a2 = Integer.parseInt(c2+"");
            if(a1 < a2){
                return false;
            }else if(a1 > a2){
                return true;
            }
        }
        return true;
    }
    public String removeDigit(String number, char digit) {
        String out = "";
        for(int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            if(ch == digit){
                String s = number.substring(0,i) + number.substring(i+1);
                if(isGreat(s,out)){
                    out = s;
                }
            }
        }
        return out;
    }
}
