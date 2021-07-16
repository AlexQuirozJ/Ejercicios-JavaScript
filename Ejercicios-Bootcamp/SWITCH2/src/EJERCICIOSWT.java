import java.util.Scanner;
public class EJERCICIOSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oper= new Scanner(System.in);
		System.out.println("1- Suma");
		System.out.println("2- resta");
		System.out.println("3- multiplicación");
		System.out.println("4- division");
		System.out.println("Que operación quiere realizar?");
		int operacion=oper.nextInt();
		Scanner LeerNum1= new Scanner(System.in);
		System.out.println("Ingresa el primer numero");
		int num1=LeerNum1.nextInt();
		Scanner LeerNum2= new Scanner(System.in);
		System.out.println("Ingresa el segundo numero");
		int num2=LeerNum2.nextInt();
		System.out.println("Ingresa el segundo numero");
		
		//para lo que decia carlos, solo declaras una variable llamada resultado en valor=0;
		//y en vez del system, pones resultado=num1+num2;

			switch(operacion) {
			case 1:
				System.out.println("el resultado de la suma es: " + (num1 + num2));
				break;
			case 2:
				System.out.println("el resultado de la resta es: " + (num1 - num2));
				break;
			case 3:
				System.out.println("el resultado de la multiplicación es: " + (num1 * num2));
				break;
			case 4:
				System.out.println("el resultado de la divison es: " + (num1 / num2));
				break;
			default:
				System.out.println("error, ingresa un numero valido" );
		           break;
		}
		
	}

}
