/*
Criar uma aplicação em Java que tenha uma função recursiva que calcule o somató_
rio dos N primeiros números Naturais (a função deve retornar zero para números
negativos).
*/

package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	public int somatorio(int n) {
		/*Retorna a soma dos N primeiros números naturais e 0 "zero", caso n seja menor
		 * ou igual a zero*/
		if(n <= 0) { //Caso o número digitado não seja um natural, o somatório deve retornar 0
			return 0;
		} else {
			if(n == 1) {  //Condição de parada
				/*Caso trivial, quando a soma só tem um número natural a ser somado*/
				return 1;
			} else {
				/*Retorno é dado pela soma do último número natural a ser considerado
				 * somado com a chamada da função com o numéro antecessor*/
				return n + somatorio(n - 1);
			}
		}
	}

}
