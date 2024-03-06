package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("INSIRA A COORDENADA X: ");
		x = sc.nextInt();
		System.out.println("INSIRA A COORDENADA Y: ");
		y = sc.nextInt();
		
		while (x > 0 && y > 0) {
			System.out.println("PRIMEIRO");
			System.out.println("INSIRA A COORDENADA X: ");
			x = sc.nextInt();
			System.out.println("INSIRA A COORDENADA Y: ");
			y = sc.nextInt();
		}
		while (x > 0 && y < 0) {
			System.out.println("QUARTO");
			System.out.println("INSIRA A COORDENADA X: ");
			x = sc.nextInt();
			System.out.println("INSIRA A COORDENADA Y: ");
			y = sc.nextInt();
		}
		while (x < 0 && y > 0) {
			System.out.println("SEGUNDO");
			System.out.println("INSIRA A COORDENADA X: ");
			x = sc.nextInt();
			System.out.println("INSIRA A COORDENADA Y: ");
			y = sc.nextInt();
		}
		while (x< 0 && y < 0) {
			System.out.println("TERCEIRO");
			System.out.println("INSIRA A COORDENADA X: ");
			x = sc.nextInt();
			System.out.println("INSIRA A COORDENADA Y: ");
			y = sc.nextInt();
		}
		sc.close();
	}
	

}
