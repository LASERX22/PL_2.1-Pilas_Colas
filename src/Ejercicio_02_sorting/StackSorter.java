package Ejercicio_02_sorting;

import Controllers.StackG;

public class StackSorter {
    private StackG<Integer> newStack;

    public StackSorter() {
        this.newStack = new StackG<>(); //Uso una pila auxiliar para ordenar los numeros
    }

    public void sortStack(StackG<Integer> stack){
        if(stack==null){
            System.out.println("No se encuentran numeros");
        }
        while(!stack.isEmpty()) { // El bucle seguira hasta que el stack a ordenar este vacio
            int menor=stack.pop(); //Extraigo el ultimo elemento de la pila original
            while(!newStack.isEmpty() && newStack.peek()<menor){ //El bucle seguira mientras la pila auxiliar tenga elementos y el ultimo de la pila auxiliar sea menor al ultimo elemento de la pila original
                stack.push(newStack.pop()); //agrego a la pila original el ultimo elemento de la pila auxiliar
            }
            newStack.push(menor); //De no cumplirse una de las dos condiciones, se agrega a la pila auxiliar el ultimo elemento de la pila original
                                 //Esto sirve mas a modo de reparticion entre dos pilas para descartar el elemento mas grande
        }
        while(!newStack.isEmpty()){
            stack.push(newStack.pop());
        }
        stack.printStack();
    }
}