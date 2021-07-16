import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int operacion=oper.nextInt();
		Scanner LeerAng1= new Scanner(System.in);
		System.out.println("Ingresa el primer angulo ° entero");
		int angulo1=LeerAng1.nextInt();
		Scanner LeerAng2= new Scanner(System.in);
		System.out.println("Ingresa el segundo angulo ° entero");
		int angulo2=LeerAng2.nextInt();
		Scanner LeerAng3= new Scanner(System.in);
		System.out.println("Ingresa el tercer angulo ° entero");
		int angulo3=LeerAng3.nextInt();
		
		int sumaAng= angulo1 + angulo2 + angulo3;
		
		
		if(sumaAng ==180) {
			System.out.println("Triangulo valido");
		} else { 
			System.out.println("Los angulos introducidos no son iguales a los angulos internos (180°)");
		}
		

		
	}

}
