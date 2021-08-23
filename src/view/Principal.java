/*
Criar uma aplicação em Java que tenha uma função recursiva que calcule o somató_
rio dos N primeiros números Naturais (a função deve retornar zero para números
negativos).
*/

package view;

import java.util.Scanner;

import controller.SomatorioController;

public class Principal {

	public static void main(String[] args) {
		SomatorioController somat = new SomatorioController();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Somatório dos N primeiros números naturais\n");
		System.out.printf("Digite um número natural: ");
		int n = ler.nextInt();
		ler.close();
		
		int result = somat.somatorio(n);
		System.out.printf("\nSomatório -> " + result);
	}

}
