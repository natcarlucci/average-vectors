import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		
		double media = soma / n;
		
		System.out.print("Valores: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f  ",vetor[i]);
		}
		
		System.out.println("");
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("M�dia: %.2f%n", media);
		
		sc.close();
	}

}
