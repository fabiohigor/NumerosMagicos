package com.b2w;

public class NumerosMagicos {

	public int[] numerosMagicos(int[][] lista) {
		int cont = 0;
		int resposta[] = new int[lista.length];
		int posix = 0;

		for (int[] is : lista) {
			System.out.println(is[0] + " - " + is[1]);
			cont = 0;
			for (int i = is[0]; i <= is[1]; i++) {
				if (Math.sqrt(i) == (int) Math.sqrt(i)) {
					if (primo((int) Math.sqrt(i))) {
						System.out.println(i + " eh magico");
						cont++;
					}
				}

			}
			resposta[posix] = cont;
			posix++;
			System.out.println("Quantidade de numeros magicos: " + cont);

		}
		return resposta;
	}

	private boolean primo(int i) {
		if (i == 1)
			return false;

		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
