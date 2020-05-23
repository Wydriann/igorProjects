package igorProjects;
import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();
		
		if (idade < 12) {
			System.out.println("Voce é uma criança");
			
		} else if(idade >= 12 && idade <= 18) {
			System.out.println("Você é Adolescente");
			
		} else if (idade > 18 && idade < 30) {
			System.out.println("Você é Jovem");
			
		} else if (idade >= 30 && idade <= 60) {
			System.out.println("Você é adulto");
			
		} else if (idade > 60) {
			System.out.println("Você é idoso");
		}
	}

}
