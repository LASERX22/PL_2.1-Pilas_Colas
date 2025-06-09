# 02.01- Practica Pilas y Colas

## Autor:
- Joey Diaz

Esta es una practica enfocada en el uso de Estructura de datos lineales como lo son pilas y colas, en este caso use una **Pila Generica** que pudiera usarse para cualquier tipo de dato

## Estructura del Proyecto

El proyecto está dividido en tres capas principales:

- **Modelo (`Models/`)**: Define el modelo de los nodos usados en la pila generica
- **Control (`Controllers/`)**: Contiene el formato de la pila generica, controla el funcionamiento de la misma, incluye metodos como `pop()`, `peek()`,`push`,`getSize`, entre otros.
- **Ejercicio 1 (`Ejercicio_01_sign`)**: Implementa un algoritmo que determina si un string que solo contiene los caracteres `()`, `{}` y `[]` es válido.
- **Ejercicio 2 (`Ejercicio_02_sorting`)**: Implementa un algoritmo que ordena un Stack de forma que los elementos más pequeños queden en el tope del Stack.
- **Interfaz (`App.java`)**: Archivo principal en donde se reciben las entradas y se llama a los metodos correspondientes para cada ejercicio.

## Funcionalidades Principales

- Se recibe una entrada con corchetes, llaves o parentesis
- Se agregan numeros a un stack y se llaman un metodo que ordene
- El metodo `SignValidator` devuelve `true` o `false` si la entrada es valida
- El metodo `StackSorter` devuelve la pila ingresada con todos los elementos(en este caso enteros) ordenados

## Cómo ejecutar el proyecto

1. Clona el repositorio o copia el código en tu entorno local.
2. Abre el proyecto en tu IDE de preferencia (Eclipse, IntelliJ, NetBeans o VS Code con soporte Java).
3. Ejecuta la clase `App.java` para comenzar a utilizar el sistema por consola.

## Requisitos

- Java JDK 8 o superior.
- IDE para desarrollo Java o terminal con compilador (`javac` y `java`).

## Conceptos aplicados

- Aplicación práctica de estructuras de datos
- Desarrollo de habilidades de programación
- Revisión y refactorización
- Uso de recursos

## Ejemplo de Salida
```
==============================================
Validación de signos de apertura y cierre
Input: ([]){}
Output: true
Input: ({)}
Output: false
==============================================
Ordenamiento de un Stack
Input: 5 1 4 2
Output: 1 2 4 5
```