package controller;

public class Controle {

	public int negativos(int[] vetor, int n) {
		// TODO Auto-generated method stub
		if(n<0) return 0;
		
		if(vetor[n]<0) return 1+negativos(vetor, n-1);
		
		return negativos(vetor, n-1);
	}

}
