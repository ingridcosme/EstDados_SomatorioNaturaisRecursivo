/*
Criar uma aplica��o em Java que tenha uma fun��o recursiva que calcule o somat�_
rio dos N primeiros n�meros Naturais (a fun��o deve retornar zero para n�meros
negativos).
*/

package view;

import java.util.Scanner;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		SomatorioController somat = new SomatorioController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Somat�rio dos N primeiros n�meros naturais\n");
		System.out.printf("Digite um n�mero natural: ");
		int n = ler.nextInt();
		ler.close();
		
		int result = somat.somatorio(n);
		System.out.printf("\nSomat�rio -> " + result);
	}

}
