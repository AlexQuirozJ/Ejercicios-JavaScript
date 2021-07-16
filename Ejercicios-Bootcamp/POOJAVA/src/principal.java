import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//para conectar dos archivos, colocar el nombre de la clase, luego el del objeto y luego el de la clase
		CuentaBancaria cuenta_personal = new CuentaBancaria("Alex Quiroz", 1304.12f);
		//CuentaBancaria cuenta_Secundaria= new CuentaBancaria("Javis");
		//cuenta_Secundaria.setSaldo= (-1300.89f);
		//System.out.println(cuenta_Secundaria.getSaldo());
		
		
		//Menu CuentaBancaria
		/*
		 * 1- Retiro
		 * 2- Deposito
		 * 3- imprimir saldo
		 * 4- Estado de cuenta
		 * 5- Agregar beneficiario
		 * 6- salir
		 * */
		
		int opcion=0;
		
		
		
		do {
		Scanner leer= new Scanner(System.in);
		System.out.println("1- Retiro");
		System.out.println("2- Deposito");
		System.out.println("3- Imprimir Saldo");
		System.out.println("4- Estado de cuenta");
		System.out.println("5- Agregar beneficiario");
		System.out.println("6- Salir");
		
		opcion= leer.nextInt();
		
		
		switch(opcion) {
		case 1: 
			System.out.println("Ingresa la cantidad a retirar");
			float monto= leer.nextFloat();
			cuenta_personal.retiros(monto);
			System.out.println("**********************************");
			break;
			
		case 2: 
			
			System.out.println("Ingrese la cantidad que desea depostiar");
			float deposito= leer.nextFloat();
			cuenta_personal.depositos(deposito);
			System.out.println("**********************************");
			break;
			
		case 3: 
			System.out.println("El monto total de su saldo es: " + cuenta_personal.consultarSaldo());
			
		case 4: 
			System.out.println("El nombre del beneficiario es: " + cuenta_personal.beneficiario);
			break;
		case 5: 
			System.out.println("Ingresa tu nombre de beneficiario: ");
			String nombre = leer.next();
			cuenta_personal.beneficiario=nombre;
			System.out.println("**********************************");
			break;
			
		}
		
		} while (opcion != 6);
		
		
		
		
		
		// con esto llenamos los atributos de la clas que establecimos en CuentaBancaria
		/*cuenta_personal.beneficiario = "Alex Quiroz";
		System.out.println(cuenta_personal.beneficiario);
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingresa un monto a depositar");
		float deposito= leer.nextFloat();
		
		System.out.println("Ingresa un monto a retirar");
		float retiro= leer.nextFloat();
		
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println("Tu saldo actual es %.2f " + cuenta_personal.consultarSaldo());
		System.out.println(cuenta_personal.beneficiario);;*/
		
		
		//CuentaBancaria cuenta_papa = new CuentaBancaria();
		//cuenta_personal.beneficiario = "Maria del Carmen";
		//System.out.println(cuenta_personal.beneficiario);

	}

}
