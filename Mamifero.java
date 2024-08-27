public class Mamifero extends Animal {
	private String alimento;

	public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
		super(nome, cor, "Terra", comprimento, velocidade, patas); // Default ambiente = Terra
		this.alimento = alimento;
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Alimento: " + alimento;
	}
}
