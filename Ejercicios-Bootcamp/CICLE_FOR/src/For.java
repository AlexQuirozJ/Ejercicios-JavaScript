import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("BIENVENIDO A LAS TABLAS DE MULTIPLICAR");
		System.out.println("_______________________________________");
		Scanner oper= new Scanner(System.in);
		System.out.println("Que tabla quieres visualizar?");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		int operacion=oper.nextInt();
		System.out.println("_______________________________________");
		System.out.println("Y EL RESULTADO DE TU TABLA ES:");

		imprimirTabla(operacion);
			}
		
		public static void imprimirTabla(int operacion) {
			
		for (int i=0; i<=10; i++) {
			
			System.out.println(operacion + " X " + i + " =" + i * operacion);
		}
		}
		}



