/*
Criar uma aplica��o em Java que tenha uma fun��o recursiva que calcule o somat�_
rio dos N primeiros n�meros Naturais (a fun��o deve retornar zero para n�meros
negativos).
*/

package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	public int somatorio(int n) {
		/*Retorna a soma dos N primeiros n�meros naturais e 0 "zero", caso n seja menor
		 * ou igual a zero*/
		if(n <= 0) { //Caso o n�mero digitado n�o seja um natural, o somat�rio deve retornar 0
			return 0;
		} else {
			if(n == 1) {  //Condi��o de parada
				/*Caso trivial, quando a soma s� tem um n�mero natural a ser somado*/
				return 1;
			} else {
				/*Retorno � dado pela soma do �ltimo n�mero natural a ser considerado
				 * somado com a chamada da fun��o com o num�ro antecessor*/
				return n + somatorio(n - 1);
			}
		}
	}

}
