import java.util.Stack;

class ValidParantheses {
    private static boolean match(char a, char b) {
        if(b == '(' && a == ')') return true;
        else if(b == '{' && a == '}') return true;
        else if(b == '[' && a == ']') return true;
        return false;
    }
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int idx=0;idx<s.length();idx++) {
            char ele = s.charAt(idx);
            if(ele == '(' || ele == '{' || ele == '[') {
                stack.push(ele);
            } else if(!stack.empty() && match(ele, stack.peek())) {
                stack.pop();
            } else {
                stack.push(ele);
            }
        }
        if(stack.empty()) return true;
        return false;
    }
}