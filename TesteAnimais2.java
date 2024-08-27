import java.util.ArrayList;
import java.util.Scanner;

public class TesteAnimais2 {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Animal");
            System.out.println("2 - Adicionar Peixe");
            System.out.println("3 - Adicionar Mamífero");
            System.out.println("4 - Ver todos os animais");
            System.out.println("5 - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (escolha) {
                case 1:
                    System.out.print("Nome do animal: ");
                    String nomeAnimal = scanner.nextLine();
                    System.out.print("Cor: ");
                    String corAnimal = scanner.nextLine();
                    System.out.print("Ambiente: ");
                    String ambienteAnimal = scanner.nextLine();
                    System.out.print("Comprimento (em cm): ");
                    int comprimentoAnimal = scanner.nextInt();
                    System.out.print("Velocidade (em m/s): ");
                    float velocidadeAnimal = scanner.nextFloat();
                    System.out.print("Número de patas: ");
                    int patasAnimal = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    zoo.add(new Animal(nomeAnimal, corAnimal, ambienteAnimal, comprimentoAnimal, velocidadeAnimal, patasAnimal));
                    break;

                case 2:
                    System.out.print("Nome do peixe: ");
                    String nomePeixe = scanner.nextLine();
                    System.out.print("Característica (ex: Barbatanas e cauda): ");
                    String caracteristicaPeixe = scanner.nextLine();
                    System.out.print("Comprimento (em cm): ");
                    int comprimentoPeixe = scanner.nextInt();
                    System.out.print("Velocidade (em m/s): ");
                    float velocidadePeixe = scanner.nextFloat();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    zoo.add(new Peixe(nomePeixe, caracteristicaPeixe, comprimentoPeixe, velocidadePeixe));
                    break;

                case 3:
                    System.out.print("Nome do mamífero: ");
                    String nomeMamifero = scanner.nextLine();
                    System.out.print("Cor: ");
                    String corMamifero = scanner.nextLine();
                    System.out.print("Alimento preferido: ");
                    String alimentoMamifero = scanner.nextLine();
                    System.out.print("Comprimento (em cm): ");
                    int comprimentoMamifero = scanner.nextInt();
                    System.out.print("Velocidade (em m/s): ");
                    float velocidadeMamifero = scanner.nextFloat();
                    System.out.print("Número de patas: ");
                    int patasMamifero = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    zoo.add(new Mamifero(nomeMamifero, corMamifero, alimentoMamifero, comprimentoMamifero, velocidadeMamifero, patasMamifero));
                    break;

                case 4:
                    // Exibindo todos os animais do zoo
                    System.out.println("Zoo:");
                    for (Animal animal : zoo) {
                        System.out.println(animal);
                        System.out.println();
                    }
                    break;

                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}

