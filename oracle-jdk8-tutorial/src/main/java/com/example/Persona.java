/* Estos caracteres, es decir, forward slash (/) seguido de asterisco (*) 
  y lo mismo pero a la inversa para el cierre del comentario, permite 
  escribir, documentar, el proyecto o el codigo que estemos desarrollando.
  
   Lo que se escribe entre comentarios, el compilador de java no lo toma 
   en cuenta a la hora de compilar el resto de las sentencia de Java que
   aparecen en el proyecto */ 

// Paquete principal
// creado con el archetype de Maven
// cuando se creo el proyecto

package com.example; 

/* Una clase en Java es una platilla a partir de la cual se pueden 
 * crear o instanciar objetos.
 * 
 *  Todo el codigo, es decir, las sentencias (ordenes) del lenguaje Java
 *  tienen que estar contenidas dentro de alguna clase 
 *  
 *  La plantilla es una estructura MUERTA hasta que se utiliza en el metodo
 *  main de la clase App 
 *  
 *  La clase, ademas de ser una plantilla sirve como tipo de datos */


public class Persona extends Object {
	
	// A continuacion vamos a especificar o definar lo que caracteriza
	// a una persona, que se le llama de cualquiera de las formas
	// siguientes: 
	
	// 1. Campos (fields)
	// 2. variables miembros de la clase (como en el lenguaje C++)
	// 3. Atributos
	// 4. Propiedades
	
	/**
	 * Comentario en formato de Javadoc. La importancia de escribir los
	 * comentarios en este formato es que existe un herramienta que se llama
	 * Javadoc, que colecta todos los comentarios que encuentre en este 
	 * formato y crea un documento.
	 */
	
	/**
	 * CONCEPTO DE VARIABLE: 
	 * 
	 * Es un identificador, es decir, un nombre, que hace referencia
	 * a una ubicacion, direccion, en la memoria RAM del equipo y 
	 * en la cual se puede almacenar un valor de un tipo de dato 
	 * concreto.
	 * 
	 * El identificador, es decir, el nombre de la variable, NO puede comenzar 
	 * un numero y tampoco puede tener espacios en blanco.
	 * 
	 * Lo correcto es que el nombre utilice, lo notacion llamada camel case,
	 * que implica que la primera letra sea en minusculas y a partir de ahi
	 * letra mayuscula cuando haya una inflexion, un cambio.
	 * 
	 */
	
	/* La variable nombre, declarada a continuacion, solamente va a permitir
	 * que se almacenen en ella cadenas de caracteres, es decir, letras
	 * de la A a la Z mayusculas y minusculas, porque antes del nombre
	 * de la variable (nombre) hemos puesto el tipo de datos String
	 * que indica que la variable solamente puede almacenar valores 
	 * encerrados entre comillas dobles */
	
	String nombre = "Susana de las Mercedez";
	String primerApellido = "Mtnez";
	double estatura = 1.75;	
	int totalCoches = 2;
	Genero genero; 
	
	// El modificador final impide que se pueda cambiar el valor de una variable, 
	// por lo cual se convierte una variable a una constante.
	static final String PAIS = "España"; 
	
	// Constructor sin parametros, que es el constructor por defecto
	// , que se pierde en el momento que creamos otro constructor, 
	// pero que puede ser creado cuando queramos
	
	
	
	public Persona(String nombre, String primerApellido, double estatura) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.estatura = estatura;
	}

	public Persona(String nombre, String primerApellido, double estatura, int totalCoches, Genero genero) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.estatura = estatura;
		this.totalCoches = totalCoches;
		this.genero = genero;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}



}


