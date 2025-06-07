import Controllers.StackG;
import Ejercicio_01_sign.SignValidator;
import Ejercicio_02_sorting.StackSorter;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Validación de signos de apertura y cierre");
        SignValidator validator = new SignValidator();
        System.out.println(validator.isValid(null)); // Debe retornar false
        System.out.println(validator.isValid("()")); // Debe retornar true

        System.out.println("Ordenbamiento de un stack");
        StackG<Integer> numeros = new StackG<Integer>();
        StackSorter ordenador = new StackSorter(); 
        numeros.push(5);
        numeros.push(1);
        numeros.push(4);
        numeros.push(2);
        ordenador.sortStack(numeros);
    }
}
