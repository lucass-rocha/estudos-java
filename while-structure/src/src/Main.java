package src;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// PARA O EXERCÍCIO A SENHA CORRETA ADOTADA FOI 2002//
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua senha: ");
		x = sc.nextInt();
		
		while (x != 2002) {
			System.out.println("SENHA INVÁLIDA, TENTE NOVAMENTE!");
			x = sc.nextInt();
		}
		System.out.println("ACESSO PERMITIDO");	
		sc.close();
	}

}
