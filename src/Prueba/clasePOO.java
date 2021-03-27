package Prueba;

public class clasePOO {

}

/* Strings:
 * 
 * _ Permite crear objetos que representan cadenas de caractere de longitud arbitraria.
 * _ Los Strings son inmutables. (Al cambiar su contenido no se modifica el arreglo
 * de caracteres que ocupa sino que se crea un nuevo objeto String y la variable apunta a ese objeto)
 * 
 * boolean equals(Object ob) Retorna true si son iguales
 * boolean equalsIgnoreCase(String s) Retorna true si son iguales, ignorando matusculas y minusculas
 * char charAt(int index) Retorna el caracter que se encuentra en el indice pasado como parametro
 * int length() Retorna la cantidad de caracteres de la cadena
 * indexOf(int ch) Retorna el primer indice en que se encuentre el char pasado
 * lastIndexOf(int ch) Retorna el ultimo indice en que se encuentre el char pasado
 * int compareTo(String otherString) Devuelve 0 si las cadenas son iguales
 * String substring(int ini, int end) Retorna un nuevo String, que es subcadena del string
 * String toLowerCase(String str) Retorna la cadena en minuscula
 * String concat(String str) Retorna la cadena resultante de concatenar las dos cadenas
 * 
 * _ Si se hace uso intensivo de los metodos de modificacion de Strings:
 * El Garbage Collector pasara gran parte del tiempo limpiando los String que surgieron de la modificacion
 * del String.
 * 
 * _ Java provee dos "String" mutables:
 * StringBuilder
 * StringBuffer
 * 
 * Enum: Enumeraciones
 * 
 * _ Es un tipo de dato especial que permite a una variable solo recibir asigancion de valores que pertenecen a un conjunto 
 * indefinido de clases.
 * 
 * enum day {Monday, Tuesday, Wednesday, Thursday, Friday};
 * 
 * Wrapper: 
 * 
 * _ Son un conjunto de clases que son equivalentes a los tipos de datos primitivos y 
 * se denominan Wrapper.
 * _ Encapsulan un valor simple e inmutable.
 * _ equals() Compara valores primitivos (busqueda profunda).
 * Integer x = new Integer(1); //boxing
 * int y = x; //unboxing
 * 
 * _ El valor por defecto de los Wrapper es NULL y son Objetos.
 * 
 * JavaDoc: Permite crear documentacion con los comnetarios del codigo fuente.
 * 
 * Java y la POO:
 * 
 * _ Conceptos de Programacion Orientada a Objetos.
 * _ Principio basico: encapsulacion y ocultamiento.
 * 		Los objetos son responsables de administrar su estado y exponen una interface publica 
 * 		para interactuar.
 * _ Jerarquia de objetos que heredan propiedades comunes y refinan comportamientos particulares.
 * _ Alto nivel de abstraccion: Los objetos colaboran enviandose mensajes. Cada mensaje esta asociado a un metodo.
 * _ Basada en objetos con funcionalidades propias.
 * _ Basada en que se hace y no en como se hace.
 * _ El objeto incrementa su funcionalidad a medida que se implementan nuevos metodos.
 * 
 * Encapsulacion:
 * _ Agregacion de datos y comportamientos dentro de una clase.
 * _ Datos privados manipulados solo por los metodos disponibles.
 * _ Re-uso.
 * _ Codigo mas confiable y robusto.
 * 
 * Herencia:
 * _ Disponibilidad a una clase hija de los datos y metodos de una clase padre.
 * _ Un objeto puede heredar todos los comportamientos y propiedades de un objeto padre. 
 * (No privados)
 * _ Java no soporta herencia multiple.
 * 
 * Polimorfismo:
 * _ Es la posibilidad de que un mensaje ejecute dependiendo de quien lo reciba y con que 
 * parametros lo recibe -> sobrecarga y sobreescritura.
 * 
 * _ Se denomina firma de un metodo a la combinacion de nombre de metodo, lista de argumentos
 * y excepciones que retorna en caso de que retorne alguna.
 * _ El tipo de retorno de un metodo, no pertenece a la firma del mismo.
 * 
 * 
 * _super: Hace referencia directa al contexto de la superclase.
 * _this: Hace referencia al contexto de la instancia actual.
 * _ super(): Permite invocar al constructor de la la clase padre. 
 * 
 * 
 * _ "final": Bloquea la sobreescritura de los metodos heredados.
 * 
 * 
 * _ extends: Indica que la clase hija hereda de la clase padre.
 * _ En la sobreescritura, el tipo de retorno entre los metodos padre e hijo debe ser el mismo.
 * _ En la sobreescritura, la lista de argumentos deber ser la misma que la funcion padre.
 * 
 * _ En las relaciones de herencia, se da una situacion particular con la herencia
 * debido a que los tipos de datos padre e hijo a veces pueden ser interpretados como equivalentes.
 * 
 * Alojamiento reserva4 = new Hotel(); Es valido puesto que un hotel es un alojamiento
 * 
 * Sin embargo, no todo alojamiento es un hotel. Una variable de tipo Hijo no puede apuntar a una
 * variable de tipo Padre.
 * 
 * _ Para chequear la consistencia de los tipos de datos se basa en el tipo de dato de la variable
 * declarada (mirada estatica) no en el tipo de dato de lo que la variable apunta (mirada dinamica).
 * 
 * _ Si en tiempo de ejecucion sabemos que la variable apunta a un objeto de determinada instancia
 * y queremos forzar al compilador a que ejecute dicho metodo, podemos hacerlo mediante casting.
 * _ Para evitar este tipo de problemas podemos verificar el tipo antes con el operador instanceof.
 * 
 * _ En tiempo de ejecucion se determina como realizar la llamada del metodo: El codigo
 * a invocar es determinado en base a la clase del objeto utilizado en la llamada.
 * (No se utiliza el tipo de variable de referencia)
 * 
 * _ Al marcar una clase o metodo como abastract, estamos identificandolo como un concepto.
 * Los hijos al heredar el metodo, tienen la obligacion de asignarle comportamiento.
 * No se pueden crear instancias (new) de la clase abstracta.
 * 
 * _ Las clases abstractas tienen 0 o mas metodos abstractos. Siempre son superclases.
 * 
 * Interfaces: (Facturable, Clonable, Serializable, etc.)
 * 
 * _ Declaran solamente constantes y metodos abstractos.
 * 
 * 		Miembros sin modificadores de acceso.
 * 		Constantes: implicitamente publicas, estaticas y finales.
 * 		Metodos: implicitamente publicos y abstractos.
 * 
 * _ Pueden extender una o mas interfaces.
 * 
 * 		No implementan ningun metodo. Las clases que las implementan deben implementar
 * 		sus metodos.
 * 
 * _ Una interfaz puede ser implementada por una o mas clases.
 * 
 * _ Una clase puede implementar multiples interfaces pero heredar solo una de una clase.
 * 
 * _ La interface se transforma en un tipo de datos y define los mensajes que puede aceptar.
 * 
 * Facturable alojamento [];
 * 
 * public abstract class Alojamiento implements Facturable {}
 * 
 * _ No hay problema si dos interfaces se solapan, puesto que no tiene implementacion de los metodos.
 * 
 * _ Las clases abstractas me premiten agrupar y refinar conceptos del dominio del problema segun
 * su estructura interna de datos aun cuando alguno de los comportamientos no puedar ser definido en el
 * nivel abstracto.
 * 
 * _ Las interfaces permiten agrupar y refinar conceptos del dominio del problema
 * de acuerdo a un comportamiento y conjunto de mensajes a resolver.
 * 
 */