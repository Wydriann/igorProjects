package igorProjects;
import java.util.Scanner;

public class idealWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		double altura = input.nextDouble();
		System.out.println();
		System.out.print("Digite 1 se você for do sexo Feminino \nDigite 2 se você for do sexo Masculino \nOpção?: ");
		byte sexo = input.nextByte();
		System.out.println();
			
		switch (sexo) {
		
			case 1: {			
				double idealWeight = (62.1 * altura) - 44.7;
				System.out.printf("Seu peso ideal é de %.2f Kg\n", idealWeight);
				break;
			}
			
			case 2: {
				double idealWeight = (72.2 * altura) - 58.0;
				System.out.printf("Seu peso ideal é de %.2f Kg", idealWeight);
				break;
			}
		}
		input.close();
	}
		
}


