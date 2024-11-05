package ClassesJava;

public class Carro extends Veiculos{

	private int numeroDePortas;
	
	public Carro (String marca, String modelo, int ano, int numeroDePortas) {
		super (marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Detalhes do carro: ");
		super.exibirDetalhes();
		System.out.println("Numero de Portas: " + numeroDePortas);
	}	
}