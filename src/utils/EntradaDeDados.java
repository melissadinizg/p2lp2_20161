package utils;

import java.util.*;
public class EntradaDeDados {
	private static Scanner input = new Scanner(System.in);

	public static String leString(String msg) {
		System.out.println(msg);
		return input.nextLine();
	}

	public static int leIntPositivo(String msg){
		int valor;
		do{
			System.out.print(msg);
			valor = input.nextInt();
			input.nextLine();
		}while(valor < 0);
		return valor;
	}
}
