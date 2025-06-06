import Ejercicio_01_sign.SignValidator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Validación de signos de apertura y cierre");
        SignValidator validator = new SignValidator();
        System.out.println(validator.isValid(null)); // Debe retornar false
        System.out.println(validator.isValid("()")); // Debe retornar true
    }
}
