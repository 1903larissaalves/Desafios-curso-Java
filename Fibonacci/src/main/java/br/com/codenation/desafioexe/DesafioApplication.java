package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	
	public static List<Integer> fibonacci() {
		
		int primeiroNumero = 0;
		int segundoNumero = 1;		
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(0);
		for (int indexNumero = 0; indexNumero <= 350; indexNumero++) {
			
			indexNumero = primeiroNumero + segundoNumero;			
			segundoNumero = primeiroNumero;
			primeiroNumero = indexNumero;
			
			numeros.add(indexNumero); 
			
			if(indexNumero > 350) {
				break;
			}
		}
		
		return numeros;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);

	}

}