package com.example;

/*
 * ¿Que es un metodo? 
 * 
 * Es un fragmento o bloque de codigo, de sentencias java en este caso, encerrado
 * entre llaves de apertura y cierre {}, que se declara una sola vez en el codigo del programa
 * o que tambien podria existir en la biblioteca o API de Java, y se puede invocar o llamar
 * desde muchas partes del programa, pasandole o no parametros entre parentesis, despues del 
 * nombre del fragmento de codigo.
 * 
 * Cuando el fragmento de codigo esta fuera de una clase (LO CUAL NO ES POSIBLE EN JAVA),
 * se le llama subrutina o funcion, pero cuando esta dentro de una clase se le llama METODO
 * 
 * La ventaja que tiene utilizar metodos es que cuando hay que modificarlos solamente hay 
 * que hacerlo en un solo sitio.
 * 
 * Y nuestro codigo de Java se inicia en un metodo que busca la JVM (Java Virtual Machine) 
 * llamado main(), que podrian existir varios metodos main en nuestro proyecto, pero seria 
 * una mala practica de programacion, porque habria que estarle indicando a la JVM por
 * cual metodo main queremos arrancar nuestro programa
 * 
 * Supongamos que en distintas partes del proyecto tenemos 
 * que sumar dos operandos, es decir, dos datos que se almacenan
 * en variables */

public class App {

	// Metodo sumar
	
	static double sumar(double a, double b) {
		
		double c = a + b;
		
		return c;
	}

	public static void main(String[] args) {
		
		double a = 2.2;
		double b = 2.2;
		
		sumar(a,b);
		
		
		a = 3;
		b = 3;
		
		sumar(a,b);
		
		
		a = 4;
		b = 4;
		
		sumar(a / 2, b * 2 );
		
		
		

	}
}
