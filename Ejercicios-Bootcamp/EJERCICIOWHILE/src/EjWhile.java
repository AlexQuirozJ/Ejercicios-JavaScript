import java.util.Scanner;
public class EjWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leerNum1= new Scanner(System.in);
		Scanner leerNum2= new Scanner(System.in);

		int num1=0;
		int num2=1;
		while(num1!=num2) {
			System.out.println("Ingresa el primer numero");
			num1=leerNum1.nextInt();
			System.out.println("Ingresa el segundo numero");
			num2=leerNum2.nextInt();
			System.out.println("el numero ingresado fue: " + num1 + "-" + num2);
			
			}
		
	}

}
