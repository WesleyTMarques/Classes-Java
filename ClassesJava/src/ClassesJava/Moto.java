package ClassesJava;

public class Moto extends Veiculos {

	private boolean temSidecar;

	public Moto(String marca, String modelo, int ano, boolean temSidecar) {
		super(marca, modelo, ano);
		this.temSidecar = temSidecar;
		// TODO Auto-generated constructor stub
	}

	public boolean isTemSidecar() {
		return temSidecar;
	}

	public void setTemSidecar(boolean temSidecar) {
		this.temSidecar = temSidecar;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Detalhes da moto: ");
		super.exibirDetalhes();
		System.out.println("Tem Sidecar: " + (temSidecar ? "Sim" : "Não"));
	}
}