import Controllers.StackG;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==============================================");
        System.out.println("Validación de signos de apertura y cierre");
        SignValidator validator = new SignValidator();
        System.out.println("Input: ([]){}");
        System.out.println("Output: "+ validator.isValid("([]){}")); // Debe retornar true
        System.out.println("Input: ({)}");
        System.out.println("Output: "+ validator.isValid("({)}")); // Debe retornar false
        System.out.println("==============================================");
        System.out.println("Ordenamiento de un Stack");
        StackG<Integer> numeros = new StackG<Integer>();
        StackSorter ordenador = new StackSorter(); 
        numeros.push(5);
        numeros.push(1);
        numeros.push(4);
        numeros.push(2);
        System.out.print("Input: ");
        numeros.printStack();
        System.out.print("Output: ");
        ordenador.sortStack(numeros);
    }
}
