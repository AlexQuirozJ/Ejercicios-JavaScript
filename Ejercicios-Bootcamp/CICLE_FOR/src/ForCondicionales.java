import java.util.Scanner;

public class ForCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SOLICITAS LOS DATOS AL USUARIO Y ALMACENAS EL VALOR EN VARIABLE
		Scanner oper = new Scanner(System.in);
		System.out.println("Ingresa el numero para sumar los pares e impares");
		int operacion = oper.nextInt();

		// DECLARAS VARIABLES EN 0 PORQUE VAMOS A UTILIZARLAS PARA SUMAR
		int sp = 0;
		int simp = 0;
		// LE DECIMOS QUE RECORRA i HASTA QUE SEA IGUAL QUE OPERACIÓN, OSEA EL DATO QUE
		// SOLICITASTE AL USUARIO
		for (int i = 0; i <= operacion; i++) {
			// SI i%2 es igual a 0 entonces empieza con sumas en par
			if (i % 2 == 0) {
				// decimos que sumapares (sp) = sp + i, osea mas el numero recorrido por el for
				// pero que arriba se declaro como impar
				sp = sp + i;
				// si no es igual a 0 entonces es impar y hace la suma
			} else {
				simp = simp + i;

			}
		}
		System.out.println("la suma de los numeros pares es: " + sp);
		System.out.println("la suma de los numeros impares es: " + simp);

	}
}