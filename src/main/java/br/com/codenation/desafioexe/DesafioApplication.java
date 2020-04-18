package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> listaFibonacci = new ArrayList<>();

		int max = 350;
		int valorFibonacci = 2;

		listaFibonacci.add(0);
		listaFibonacci.add(1);

		for (int i = 1; valorFibonacci < max; i++){
			listaFibonacci.add(listaFibonacci.get(i) + listaFibonacci.get(i - 1));
			valorFibonacci = listaFibonacci.get(i + 1);
		}

		return listaFibonacci;
	}

	public static Boolean isFibonacci(int a) {
		return fibonacci().contains(a);
	}

}