public class TesteAnimais {
	public static void main(String[] args) {
		Animal camelo = new Animal("Camelo", "Amarelo", "Terra", 150, 2.0f, 4);
		Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", 300, 1.5f);
		Mamifero ursoDoCanada = new Mamifero("Urso-do-canadá", "Vermelho", "Mel", 180, 0.5f, 4);

		System.out.println("Zoo:");
		System.out.println(camelo);
		System.out.println();
		System.out.println(tubarao);
		System.out.println();
		System.out.println(ursoDoCanada);
	}
}
