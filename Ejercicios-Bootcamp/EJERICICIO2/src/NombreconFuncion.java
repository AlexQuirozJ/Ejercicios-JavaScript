
import java.util.Scanner;
public class NombreconFuncion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PROGRAMA PARA SOLICITAR DATOS E IMPRIMIR POR METODO (FUNCION)
		
		//PRIMERO COLOCAR EL SCANNER Y LA VARIBALE DONDE SE ALMACENARA (LEER)
		Scanner leer = new Scanner(System.in);
		//CUAL MENSAJE APARECERA PARA EL USUARIO
		System.out.println("Ingresa tu nombre");
		//LO QUE EL USUARIO INGRESE EN LEER O EN EL MENSAJE QUE SALDRA, LO VA
		//ALMACENAR EN UNA VARIABLE (NOMBRE)
		String nombre = leer.nextLine();
		//MANDAMOS A LLAMAR AL METODO, DECIMOS QUE IMPRIMA EL METODO SALUDO (HOLA)
		// Y QUE EL SALUDO SE VENGA CON NOMBRE(DATOS INGRESADOS POR EL USUARIO)
		System.out.println(saludo(nombre));	
		
	}
	//COLOCAS TU METODO- STRING ES PORQUE VA RECIBIR EL STRING COMO PARAMETRO 
	// ES UN METODO PUBLIC STATICO Y CON STRING
	// PUBLICO: QUE PUEDO LLLAMARLO DESDE OTRO LADO, PRIVADO: QUE SOLO PUEDO DESDE EL METODO
	// 
	// ENTONCES LO QUE HAY DENTRO DE SALUDO, LO PONEMOS PORQUE DECIMOS QUE VAMOS A RECIBIR
	//UN STRING CON NOMBRE SALUDO
	public static String saludo(String saludo) {
		// QUE ES LO QUE VAMOS A DEVOLVER, EL SALUDO
		//ENTONCES LO QUE ESCRIBAS AQUÍ ES LO QUE VAS A LLAMAR ARRIBA
		
		return "hola " + saludo;
	}
}


//PASO 1: PIDE DATOS POR EL USUARIO
	//Scanner leer= new Scanner(System.in);
	//System.out.println("ingresa tu nombre");
	//String nombre= leer.nextLine();
	//system.out.println(saludo(nombre));
	
	
//PASO 2: COLOCA TU METODO QUE TRAERA LOS DATOS DEL USUARIO
	//public static String saludo(saludo String) {
		//return "Hola" + saludo;
	
	
	