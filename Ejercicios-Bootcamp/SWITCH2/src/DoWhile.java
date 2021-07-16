import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leerNum1= new Scanner(System.in);
		Scanner leerNum2= new Scanner(System.in);
		int num1;
		int num2;
		do{
			System.out.println("Ingresa el primer numero");
			num1=leerNum1.nextInt();
			System.out.println("Ingresa el segundo numero");
			num2=leerNum2.nextInt();
		} while(num1 != num2); 
		//siempre debes cerrar el scanner al final - leerNum1.close();
		//leerNum2.close();
		System.out.println("el numero ingresado fue: " + num1 + "-" + num2);
		
		
	}
}


