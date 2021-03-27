package Prueba;

public class HolaMundo { //Clase
	
	//Atributos
	int v1 = 0; //Variable de instancia
	static int v2 = 3; //Variable de clase
	
	//Metodos
	public static void main(String[] args) {
		int n[] = {10, 20 , 30, 40};
		System.out.println("Hi sir 3");
		// TODO Auto-generated method stub
		System.out.println(n[2]);
	}
	
	public void metodo1() {
		int v3 = 0;
		v3++;
		
	}

}

/* Java es un lenguaje orientado a objetos, por lo tanto un programa consta
 * consta de una o mas clases que ejecutan algoritmos definidos en ellas.
 * 
 * El archivo debe contener una unica clase publica y el nombre de dicha clase debe
 * coincidir con el nombre del archivo.
 * 
 * El modificador de acceso public permite que esta clase pueda ser utilizada por otras clases,
 * que estaran definidas en otros archivos en otros directorios.
 * 
 * Una clase internamente tiene miembros de 2 tipos:
 * 
 * _Atributos: Determina el estado del objeto.
 * _Metodos: Comportamiento del objeto.
 * 
 * Variables:
 * 
 * _Son porciones de memoria en las que pueden almacenarse datos.
 * 
 * _Cada variable tiene: Tipo - Identificador - Valor.
 * 
 * Tres tipos de variables: de instancia, de clase y locales.
 * 
 * _ Variables de instancia: Se utilizan para definir los atributos de un objeto.
 * _ Variables de clase(static): Similares a las variables de instancia, pero sus valores
 * son los mismos para todas las intacias de la clase. 
 * _ Variables locales: Variables declaradas dentro de un metodo.
 * 
 * 
 * Variables de Instancia:
 * 
 * _ Representan lo que el objeto conoce.
 * _ Modificadores de Acceso: public - private - protected - default
 * _ Modificador de Alcance: static - final - default
 * _ Tipo de dato: puntero a objeto o primitivo [obligatorio]
 * _ Nombre de la variable [obligatorio]
 * _ Valor de Inicializacion
 * 
 * _ Los valores definidos como final son constantes y no pueden cambiar su valor
 * durante el tiempos de vida del objeto.
 * 
 * Tipos primitivos: int - double - float - long - char
 * boolean - byte - cha - (String)
 * 
 *  Metodo: 
 *  
 *  _ Un metodo puede tener definicion o no. (abstract)
 * `_ Modificador de acceso
 *  _ Modificador de alcance
 *  _ Retorno
 *  _ Nombre
 *  _ Lista de parametros
 *  _ La firma del metodo es lo que identifica inequivocamente al metodo en el programa.
 *  
 *  Constructores:
 *  
 *  _ Es un metodo especial dado que se utiliza para inicializar una instancia de una clase una vez
 *  creada una instancia.
 *  _ Utilizamos new para crear una instancia de una clase e invocar al constructor.
 * 
 * public Cliente() {} //Por defecto
 * Cliente c1 = new Cliente();
 * public Cliente(String nombre, String cuit) {
 * 	this(); //Llamo al otro constructor, SOBRECARGA
 * 	this.nombre = nombre;
 * 	this.cuit = cuit;
 * }
 * 
 * Heap: es el espacio en memoria de java.
 * 
 * Literales numericas:
 * 123
 * 123.456
 * 123L Se guarda como un long, 64 bits
 * 123.456F Se guarda como un float
 * 
 * (1<2) ? "SI":"NO";
 * 
 * Operadores Logicos: &(AND) |(OR) ^(XOR)
 * Operadores Logicos - Short Circuit: && ||
 * _ En el caso de && si el primer argumento da falso, entonces no evalua el segundo argumento.
 * _ En el caso || si el primer argumento da verdadero, entonces no evalua el segundo argumento.
 * 
 * switch(v){
 * case 1:
 * break;
 * default:
 * break;
 * }
 * 
 * Arreglos:
 * _ Contenedor de objetos que almecena un numero fijo de valores de un unico tipo de dato.
 * _ Su largo es establecido cuando el arreglo es creado.
 * _ Declaracion y Creacion: int array[] = new int[3]; int n[] = {10, 20 , 30, 40};
 * _ Los arreglos son pasados por referencia ya que son considerados objetos.
 * _ Multidimensionales: int b[][]; b = new int[3][4];
 * _ .length: Tamano del arreglo
 * _ for(Producto unProducto : arregloProd) {
 * }
 * _ Es valido int v[] = new int[3];
 * 			   int aux[] = new int[5];
 * 			   v = aux;
 * _ System.arraycopy();
 * 
 * Arreglos Dinamicos:
 * ArrayList<String> palabras = new ArrayList<>();
 * palabras.add("Hola");
 * palabras.add("Chau");
 * palabras.size();
 * palabra.get(0);
 * palabras.remove(0);
 * 
 * Paquetes:
 * _ Es una forma de dividir manera logica las clases.
 * _ Un paquete define lo que se denomina "espacio de nombres de clases".
 * _ Una clase se identifica por nombre de clase y nombre de paquetes.
 * _ Todas las clases definidas dentro del espacion de nombres, estan importados explicitamente.
 * _ Para importar un clase utilizamos: import
 * _ public: Cualquiera lo puede ver.
 * _ private: Solo es visible dentro de la misma clase.
 * _ protected: Solo es visible dentro de la misma clase, por las clases que te heredan y
 *	 y por las clases que se encuentren dentro del mismo paquete.
 * 
 * Notacion:
 * Nombres Clase: CamelCase
 * Variables y  Metodos: lowerCamelCase
 * 
 */