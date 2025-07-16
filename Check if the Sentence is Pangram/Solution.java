public class Solution {
    public static void main(String[] args) {
        String sentence = "anmt";
        System.out.println(checkIfPangram(sentence));


    }

    public static boolean checkIfPangram(String sentence) {
        boolean flag = false;
        for(int i = 97;i<=122;i++){
            for(int j = 0;j<sentence.length();j++){
                int ascii = (int) sentence.charAt(j);
                if(i == ascii){
                    flag = true;
                    break;
                }else{
                    flag = false;
                }
            }
            if(!flag){
                break;
            }
        }
        return flag;
    }
}