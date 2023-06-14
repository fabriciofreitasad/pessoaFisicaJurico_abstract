package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Fisico;
import entities.Juridico;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.println("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte nº " + i + ":");
			System.out.println("Pessoa fisica ou juridico: f/j ");
			char ch = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'f') {
				System.out.print("Despesas de Saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new Fisico(name, rendaAnual, gastoSaude));
			} else {
				System.out.print("Número de funcionários: ");
				Integer numeroFunc = sc.nextInt();
				list.add(new Juridico(name, rendaAnual, numeroFunc));

			}
			System.out.println();
			System.out.println("IMPOSTO PAGOS:");
			for (Contribuinte con : list) {
				System.out.println(con.getName() + ": $ " + String.format("%.2f", con.taxa()));
			}
			for (Contribuinte con : list) {
				double sum = 0.0;
				sum += con.taxa();
				System.out.printf("Total de imposto: "+String.format("%.2f",sum));
			}

		}

		sc.close();

	}

}
