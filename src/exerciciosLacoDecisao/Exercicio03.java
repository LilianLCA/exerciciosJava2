package exerciciosLacoDecisao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) 
	{
		byte idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Por favor, digite sua idade:");
		idade = ler.nextByte();
		
		if (idade>=10 && idade<=14) 
		{
			System.out.println("Faixa etária: Infantil");
		}
		if (idade>=15 && idade<=17) 
		{
			System.out.println("Faixa etária: Juvenil");
		}
		else if (idade>=18 &&idade<=25);
		{
			System.out.println("Faixa etária: Adulto");
		}
	}
}