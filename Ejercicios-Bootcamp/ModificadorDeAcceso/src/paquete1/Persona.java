package paquete1;

public class Persona {
	
	//MODIFICADORES DE ACCESO: DEFAULT, PRIVATE, PROTECTED, 
	//DEFAULT: SOLO PUEDES INGRESAR AL ATRUBUTO DESDE EL MISMO PACKAGE
	//ES DECIR, SI CREAR UNA CLASE EN UN PAQUETE Y DEFINES SUS ATRIBUTOS Y QUIERES LLAMALOS DESDE OTRO
	//PACAKGE ENTONCES NO PODRAS, SOLO POR MEDIO DEL MISMO PACKAGE CON LA MISMA CLASE O UNA NUEVA
	//EL DEFAULT NO PONES NADA ANTES DE TU NOMBRE DEL OBJETO

	//PRIVATE: SOLO PUEDES ACCESAR AL ATRIBUTO DESDE LA MISMA CLASE
	//private int edad=0;
	//PROTECTED: SOLO PUEDES INGRESAR AL ATRIBUTO DESDE LA MISMA CLASE Y DESDE OTRA CLASE PERO EN EL MISMO PAQUETE
	//protected String domicilio ="";

	String nombre ="";
	protected String domicilio ="";
	private int edad=0; //marca error porque es privado y no puedes llamarlo desde otra clase
	
	
	//esto es un metodo
	String saludar() {
		return "hola, mi nombre es: " + this.nombre;
	}
}
