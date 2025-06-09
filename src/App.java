import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Controllers.StackG;

public class App {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 01: VALIDACION DE SIGNOS =====");
        SignValidator validator = new SignValidator();
        
        String[] testCases = {"([]){}", "({)}", "((()))", "([)]", ""};
        
        for (String test : testCases) {
            boolean result = validator.isValid(test);
            String displayTest = test.isEmpty() ? "\"\"" : "\"" + test + "\"";
            System.out.println("Input: " + displayTest + " -> Output: " + result);
        }

        System.out.println("\n===== EJERCICIO 02: ORDENAR STACK =====");
        StackSorter sorter = new StackSorter();
        
        StackG<Integer> stackToSort = new StackG<>();
        stackToSort.push(2);
        stackToSort.push(4);
        stackToSort.push(1);
        stackToSort.push(5);
        
        System.out.print("Pila antes de ordenar: ");
        stackToSort.printStack();
        
        sorter.sortStack(stackToSort);
        
        System.out.print("Pila ordenada: ");
        stackToSort.printStack();

        StackG<Integer> stackToSort2 = new StackG<>();
        stackToSort2.push(8);
        stackToSort2.push(3);
        stackToSort2.push(7);
        stackToSort2.push(1);
        
        System.out.print("\nCaso adicional - antes: ");
        stackToSort2.printStack();
        
        sorter.sortStack(stackToSort2);
        
        System.out.print("Caso adicional - despues: ");
        stackToSort2.printStack();

        System.out.println("\n===== FIN DE LA EJECUCION =====");
    }
}