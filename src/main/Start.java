package main;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		
		int filas = 5;
		int columnas = 5;
		
		
		//no distingue entre filas y columnas. Nosotros diremos que primero filas y luego columnas.
		int[][] matriz = new int[filas][columnas];
		
//		matriz[2][6] = 9;
//		matriz[0][4] = 9;
//		matriz[3][0] = 9;
		
//		int variable =1;
//		
//		for(int i=0;i<filas;i++) {
//			for (int j=0;j<columnas;j++) {
//				matriz[i][j]=(variable);
//				System.out.print(matriz[i][j]+" ");
//				variable++;
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<filas;i++) {
//			for (int j=0;j<columnas;j++) {
//				if (j==0 | i==0 | i==filas-1 | j==columnas-1) {
//					matriz[i][j]=1;
//				}
//				System.out.print(matriz[i][j]+" ");
//			}
//		System.out.println();
//		}
		for(int i=0;i<filas;i++) {
			int variable=columnas;
			for (int j=0;j<columnas;j++) {
//				if (j==0 | j==columnas-1 | i==j |i==columnas/2 | j==filas-i-1) {
//					matriz[i][j]=5;
//				}
				
				if ((j<=i|j>=i)&&i!=variable) {
					matriz[i][j]=5;
					
				}
				variable-=2;
				System.out.print(matriz[i][j]+" ");
			}
		System.out.println();
		}
		

	}	
}
