import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = "String for reverse";
        System.out.println(reverseWithArray(reverse));
        System.out.println(reverseStringBuilder(reverse));
    }

    public static String reverseWithArray(String reverse) {
        char[] rev = reverse.toCharArray();
        char[] resultCharArray = new char[rev.length];
        for (int i = 0; i < rev.length; i++) {
            resultCharArray[rev.length - i - 1] = rev[i];
        }
        return new String(resultCharArray);
    }

    public static String reverseStringBuilder(String reverse) {
        StringBuilder sb = new StringBuilder(reverse);
        return sb.reverse().toString();
    }
    public static String reverseByStack(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] rev = s.toCharArray();
        char[] endArray = new char[rev.length];
        for(char temp : rev){
            stack.add(temp);
        }
        for(int i=0; i<endArray.length; i++){
            endArray[i] = stack.pop();
        }
        return  new String(endArray);
    }
}
