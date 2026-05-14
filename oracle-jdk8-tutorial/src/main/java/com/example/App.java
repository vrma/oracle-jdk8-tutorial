package com.example;

public class App {

	public static void main(String[] args) {
		
		/**
		 * ¿Como crear o instanciar objetos?
		 * 
		 * Invocando o llamando a un constructor de la clase del tipo de objeto 
		 * que queremos crear
		 * 
		 * A modo de ejemplo:
		 * 
		 * Queremos crear un objeto de tipo Persona, para lo cual vamos a llamar o invocar 
		 * al constructor de la clase Persona
		 * 
		 * ¿Que es un constructor? 
		 * 
		 * Es un metodo que tiene el mismo nombre que la clase. 
		 * Por defecto, todas las clases tienen un constructor implicito, sin parametros,
		 * que te han otorgado gratuitamente y que lo pierdes en cuanto creas otro constructor 
		 * 
		 * Para crear o instanciar el objeto, el constructor hay que prefijarlo con el operador
		 * new 
		 * 
		 */
		
		int x = 45;
		
		/* En la sentencia que aparece a continuacion, la creacion o instanciacion del objeto 
		 * Persona tiene lugar a traves de la sentencia new Persona(), es decir, a traves de la
		 * invocacion del constructor de la clase Persona. 
		 * Y la variable persona1 NO ES EL OBJETO, es una referencia, que en algunos lenguajes 
		 * de programacion como C++ se le llama un puntero, o apuntador, porque apunta a la 
		 * direccion de memoria donde reside el objeto creado 
		 * Y, tambien, a traves de la variable persona1 es que puedo acceder a los elementos
		 * que estan en la clase Persona, utilizando el operador punto (.) */
		
		Persona persona1 = new Persona();
		
		// Para mostrar el nombre de la persona
		
		System.out.println("El nombre de la persona1 es: " + persona1.nombre); 
		
		Persona persona2 = new Persona("Juan", "Mtnez", 1.80);
		
		
		/* Ejercicio # 1. Crear una clase que se llame Estudiante, que tenga como propiedades
		 * 
		 * 1. nombre
		 * 2. apellido1
		 * 3. apellido2
		 * 4. totalAsignaturas
		 * 5. facultad, que sea un tipo enum, con las constantes INFORMATICA, CIENCIAS, MATEMATICAS 
		 * 
		 * Segundo:
		 * 
		 * El metodos main, poder crear objetos estudiantes, sin parametros, es decir, vacios y
		 * tambien que los pueda crear suministrandoles el nombre, apellido1, totalAsignaturas 
		 * y la facultad donde estudia */
		
		/* Ejemplo:
		 * 
		 * Pido declarar una variable */
		
		// Simplemente la declaracion de la variable
		Estudiante estudiante3;
		
		
		// Crear o instanciar el objeto implica invocar o llamar al constructor de la clase
		estudiante3 = new Estudiante();
		
		// Declara una variable de tipo double y asignale el valor 3.14
		
		double xx = 3.14;
		
		String yyyy = "Pepito";
		
		
		/* Creando objetos estudiante */
		
		Estudiante estudiante6;
		
		estudiante6 = new Estudiante("Maria", "Mtnez", "Machado", 10, Facultad.MATEMATICAS);
		
		
		

	}
}
