package Ejercicio_02_sorting;

import Materia.Controllers.StackG;

public class StackSorter {
    
    public void sortStack(StackG<Integer> stack) {
        if (stack == null || stack.isEmpty()) {
            return;
        }
        
        StackG<Integer> tempStack = new StackG<>();
        
        while (!stack.isEmpty()) {
            Integer current = stack.pop();
            
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(current);
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
    
    private void displayStack(StackG<Integer> stack, String label) {
        System.out.print(label + ": ");
        
        if (stack.isEmpty()) {
            System.out.println("empty");
            return;
        }
        
        StackG<Integer> aux = new StackG<>();
        StringBuilder output = new StringBuilder();
        
        while (!stack.isEmpty()) {
            aux.push(stack.pop());
        }
        
        boolean first = true;
        while (!aux.isEmpty()) {
            Integer value = aux.pop();
            stack.push(value);
            
            if (!first) {
                output.insert(0, "->");
            }
            output.insert(0, value);
            first = false;
        }
        
        System.out.println("(tope) " + output.toString());
    }
    
    public static void main(String[] args) {
        StackSorter sorter = new StackSorter();
        
        System.out.println("=== Stack Sorting Tests ===");
        
        StackG<Integer> stack1 = new StackG<>();
        stack1.push(2);
        stack1.push(4);
        stack1.push(1);
        stack1.push(5);
        
        System.out.println("\nTest 1:");
        sorter.displayStack(stack1, "Before");
        sorter.sortStack(stack1);
        sorter.displayStack(stack1, "After");
        
        StackG<Integer> stack2 = new StackG<>();
        stack2.push(8);
        stack2.push(3);
        stack2.push(6);
        stack2.push(1);
        
        System.out.println("\nTest 2:");
        sorter.displayStack(stack2, "Before");
        sorter.sortStack(stack2);
        sorter.displayStack(stack2, "After");
        
        StackG<Integer> stack3 = new StackG<>();
        stack3.push(4);
        stack3.push(2);
        stack3.push(4);
        stack3.push(1);
        stack3.push(2);
        
        System.out.println("\nTest 3:");
        sorter.displayStack(stack3, "Before");
        sorter.sortStack(stack3);
        sorter.displayStack(stack3, "After");
    }
}