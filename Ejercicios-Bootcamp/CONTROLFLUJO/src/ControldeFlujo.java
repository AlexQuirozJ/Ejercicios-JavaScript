import java.util.Scanner;
public class ControldeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LeerEdad= new Scanner(System.in);
		Scanner LeerNombre= new Scanner(System.in);
		System.out.println("Hola, ingresa tu edad");
		int edad= LeerEdad.nextInt();
		System.out.println("Hola, ingresa tu nombre");
		String nombre=LeerNombre.nextLine();
		String mensaje= edadU(edad, nombre);
		System.out.println(mensaje);
	}

	public static String edadU (int edad, String nombre) {
	String mensaje="";
	if(edad>=18 && edad<=29) {
		mensaje= "Felicidades " + nombre + " has sido aceptado en el programa de generation Java Full Stack";
	}else {
		mensaje= "No cumples con los requisitos del bootcam, ";
	}
	return mensaje;
}
}
