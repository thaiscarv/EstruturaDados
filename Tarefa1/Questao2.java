package Tarefa1;

import java.util.Random;

public class Questao2 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4]; 
		
		int impar=1;
		
		for(int linhas = 0;linhas < 3;linhas++){
			
			for(int cols = 0;cols < 3;cols++){
				matriz[linhas][cols]=impar;		
				
				if (linhas==cols)
					System.out.printf("%d\t",matriz[linhas][cols]);
				else
					System.out.printf("0\t");
				impar+=2;
			}
			
			System.out.printf("\n");
			}
		
		
			int vetor[]; 
			vetor = new int[3];
					
			Random numrandomico = new Random(); 
			int maxValue = Integer.MIN_VALUE; 
			int minValue = Integer.MAX_VALUE; 
			

			for(int i = 0;i < 3;i++){
				vetor[i]= numrandomico.nextInt(999);	
			}

			for(int i = 0;i < 3;i++){
				if (vetor[i] > maxValue)	
					maxValue = vetor[i];
				if (vetor[i]  <minValue)	
					minValue  =vetor[i];
			}
			

			System.out.println("\nO maior valor e " + maxValue);
			System.out.println("\nO menor valor e " + minValue);
			
			System.out.println("\nVetor randomico:");

			for(int num:vetor)
				System.out.println(num);
		
	}

}
