package br.com.gsoares;

public class NewProject {

		public static void main(String[] args) {
			int notaUm=0;
			int notaDois=5;
			int notaTres=4;
			int notaQuatro=9;
			
			double media = (notaUm+notaDois+notaTres+notaQuatro) / 4;
			
			if (media >= 7) {
				System.out.print("Aprovado");
			} else if (media >= 5) {
				System.out.print("Recuperação");
			} else {
				System.out.print("Reprovado");
			}
	}
}