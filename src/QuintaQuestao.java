import java.util.Scanner;

public class QuintaQuestao {
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		
		int menor, maior;
		int[][] num = new int[4][4];
		int matriz[][] = new int[4][4];
		 menor= matriz[0][0];
		 maior=matriz[0][0];

		int cont =0;

		//for (int i=0; i<(num.length); i++ ) {
		    //for (int j=0;j<num[i].length;j++) {
		    	//num[i][j] = sc.nextInt();
		    //}
		//}	
		
		//for (int i=0; i<(num.length); i++ ) {
		    //for (int j=0;j<num[i].length;j++) {
		    	//System.out.println(num[i][j]);
		   // }
		//}	
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[j][i] = sc.nextInt();
				cont++;
			}
		}
		

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if(matriz[i][j]>maior){
		            maior=matriz[i][j];
		           }
				}
			}
		System.out.printf("O maior numero e: [%d]",maior);
		
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println("");
		}
		}
	}	

	
