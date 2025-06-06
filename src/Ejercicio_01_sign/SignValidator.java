package Ejercicio_01_sign;

import Controllers.StackG;

public class SignValidator {
    private StackG<Character> aperturas;

    public SignValidator() {
        this.aperturas = new StackG<>();
    }

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == '(' || character == '[' || character == '{') {
                aperturas.push(character);
            } else if (character == ')' || character == ']' || character == '}') {
                if (aperturas.isEmpty()) {
                    return false;
                }
                char last = aperturas.peek();
                if (last == '(' && character == ')') {
                    aperturas.pop();
                }
                if (last == '[' && character == ']') {
                    aperturas.pop();
                }
                if (last == '{' && character == '}') {
                    aperturas.pop();
                }
            }
        }
        if (aperturas.isEmpty()) {
            return true;
        } else {
            return false; // Si quedan signos de apertura sin cerrar, retorna false
        }
    }
}