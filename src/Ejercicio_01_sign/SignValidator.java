package Ejercicio_01_sign;
import java.util.Stack;

public class SignValidator {
    
    public boolean isValid(String s) {
        if (s == null) return false;
        
        Stack<Character> pila = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } 
            else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                
                char top = pila.pop();
                
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        
        return pila.isEmpty();
    }
    
    public static void main(String[] args) {
        SignValidator validator = new SignValidator();
        
        String[] tests = {"([]){}", "({)}", "((()))", "([{}])", "((", "", "([)]"};
        
        System.out.println("Resultados de validacion:");
        for (String test : tests) {
            boolean result = validator.isValid(test);
            System.out.println("Input: \"" + test + "\" -> " + result);
        }
    }
}