package view;
import java.util.*;
import controller.Controle;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Tamanho do vetor: ");
		int n=sc.nextInt();
		int []vetor=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Valor: ");
			vetor[i]=sc.nextInt();
		}
		Controle controle=new Controle();
		int totalNegativos=controle.negativos(vetor,n-1);
		System.out.println("Total de negativos: "+totalNegativos);
	}
}
