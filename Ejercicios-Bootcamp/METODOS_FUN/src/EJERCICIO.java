import java.util.Scanner;
public class EJERCICIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner LeerNum1= new Scanner(System.in);
		System.out.println("Hola, ingresa el primer numero");
		int num1=LeerNum1.nextInt();
		
		Scanner LeerNum2= new Scanner(System.in);
		System.out.println("Hola, ingresa el segundo numero");
		int num2=LeerNum2.nextInt();
		
		Scanner LeerNum3= new Scanner(System.in);
		System.out.println("Hola, ingresa el segundo numero");
		int num3=LeerNum3.nextInt();
		

			if (num1<num2&&num2<num3) {
				System.out.println("el numero mayor es: " + num3);
				System.out.println(num3); 
				System.out.println(num2); 
				System.out.println(num1);
				
			}else if (num2<num1&&num1<num3) {
				System.out.println("el numero mayor es " + num3);
				System.out.println(num3);
				System.out.println(num1);
				System.out.println(num2);

			}
			else if(num3<num1&&num1<num2) {
				System.out.println("el mayor es: " + num2);
				System.out.println(num2);
				System.out.println(num1);
				System.out.println(num3);

				
			}else if(num3<num2&&num2<num1) {
				System.out.println("el numero mayor es: " + num1);
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);

				
		} else if(num1<num2&&num3<num2&&num1<num3) {
			System.out.println("el numero mayor es: " + num2);
			int mensaje= num2, num3, num1;
			//System.out.println(num3);
			//System.out.println(num1);
		}}}
		
		
			


