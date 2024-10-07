class Solution {
    public boolean isNumber(String s) {
        int n=s.length();
        if(n>1){
          if(s.charAt(0)=='I'||s.charAt(1)=='I'||(s.charAt(n-1)>='A'&&s.charAt(n-1)<='z'))
            return false;
        }
        try{
        double d=Double.parseDouble(s);
        }
        catch(Exception e){
           return false;
        }
        return true;
    }
}
