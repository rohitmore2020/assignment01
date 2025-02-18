public class IT2023bit056q3 {
    public static String s= "";

    public static String reverse(String inputString){
        if(inputString.length() == 0){
            return "";
        }
        s += inputString.charAt(inputString.length()-1);
        reverse(inputString.substring(0, inputString.length()-1));
        return s;
    }

    public static boolean isPalindrome(String inputString){
        if(reverse(inputString).equals(inputString) == true){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("171"));
    }
}
