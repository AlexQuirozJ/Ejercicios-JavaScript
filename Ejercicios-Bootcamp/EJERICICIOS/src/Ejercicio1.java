import javax.swing.JOptionPane;
import java. util. Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FORMA 1 JOPTIONPANE
	    String nombre=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		System.out.println("hola, tu nombre es: " + nombre);
		
		//FORMA 2 SCANNER
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa tu nombre:");
		String nombre2=entrada. nextLine();
		System. out. println("Hola, tu nombre es: " + nombre2);

	}

}

