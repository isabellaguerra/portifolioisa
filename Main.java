package br.edu.fatecpg.view;
import br.edu.fatecpg.service.ConsomeApi;
public class Main {
    public static void main(String[] args) throws Exception {
        String cep = "01007-080";
        String endereco = ConsomeApi.buscarEndereco(cep);
        System.out.println(endereco);
        Scanner scanner = new Scanner(System.in);

List<Endereco> historico = new ArrayList<>();

int opcao = 0;

while (opcao != 4) {

    System.out.println("\n===== CONSULTA DE CEP =====");
    System.out.println("1 - Consultar CEP");
    System.out.println("2 - Ver consultados");
    System.out.println("3 - Limpar histórico");
    System.out.println("4 - Sair");
    System.out.print("Escolha uma opção: ");

    opcao = scanner.nextInt();
    scanner.nextLine();

    switch (opcao) {

        case 1:
            // aqui entra o código que você já fez para consultar a API
            break;

        case 2:
            // aqui vamos mostrar o histórico
            break;

        case 3:
            historico.clear();
            System.out.println("Histórico limpo!");
            break;

        case 4:
            System.out.println("Programa encerrado.");
            break;

        default:
            System.out.println("Opção inválida!");
    }
}
    }
}
