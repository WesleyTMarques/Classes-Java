package ClassesJava;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Chevrolet", "Celta", 2013, 4);
		Moto moto = new Moto("Honda", "Fz15", 2023, false);
		
		ArrayList<Veiculos> listaVeiculo = new ArrayList<Veiculos>();
		listaVeiculo.add(carro);
		listaVeiculo.add(moto);
		
		for (Veiculos veiculo: listaVeiculo) {
			veiculo.exibirDetalhes();
		}
	}
}