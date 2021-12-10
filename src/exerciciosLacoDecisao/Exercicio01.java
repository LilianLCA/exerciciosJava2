package exerciciosLacoDecisao;

import java.util.Scanner;

public class Exercicio01 
{

	public static void main(String[] args) 
	{		
		byte n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor:");
		n1 = ler.nextByte();
		System.out.println("Entre com o segundo valor:");
		n2 = ler.nextByte();
		System.out.println("Entre com o terceiro valor:");
		n3 = ler.nextByte();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("O primeiro valor é maior.");
		}
		if (n2>n1 && n2>n3)
		{
			System.out.println("O segundo valor é maior.");
		}
		if (n3>n1 || n2>n3)
		{
			System.out.println("O terceiro valor é maior.");
		}
	}
}

