public class Animal {

	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private float velocidade;

	public Animal(String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = patas;
	}

	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public void alteraComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public void alteraPatas(int patas) {
		this.patas = patas;
	}

	public void alteraCor(String cor) {
		this.cor = cor;
	}

	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Animal: " + nome + "\n" + "Comprimento: " + comprimento + " cm\n" + "Patas: " + patas + "\n" + "Cor: "
				+ cor + "\n" + "Ambiente: " + ambiente + "\n" + "Velocidade: " + velocidade + " m/s";
	}
}
