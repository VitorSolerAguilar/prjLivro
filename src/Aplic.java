
import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Aplic {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcao = 0;

        System.out.print("Digite o titulo do livro: ");
        String titulo = s.nextLine();

        System.out.print("Digite a identificacao do livro: ");
        int identificacao = s.nextInt();
        Livro livro = new Livro(identificacao, titulo);

        System.out.print("Digite valor da multa: ");
        double valorMulta = s.nextDouble();
        livro.setValMultaDiaria(valorMulta);

        System.out.println("\n");
        do {
            System.out.println("1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("      Digite a opcao: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n----------------------------");
                    System.out.println("Identificacao: " + livro.getIdentificacao());
                    System.out.println("Titulo: " + livro.getTitulo());
                    System.out.println("Situacao: " + (livro.getSituacao() ? "Emprestado" : "Disponivel"));
                    System.out.println("----------------------------\n");
                    break;
                case 2:
                    if (livro.getSituacao() == true) {
                        System.out.println("\n----------------------------");
                        System.out.println("O livro esta emprestado!");
                        System.out.println("----------------------------\n");
                    } else {
                        System.out.println("\n----------------------------");
                        System.out.println("Operação de emprestimo realizada com sucesso!");
                        livro.emprestar();
                        System.out.println("----------------------------\n");
                    }
                    break;
                case 3:
                    if (livro.getSituacao() == false) {
                        System.out.println("\n----------------------------");
                        System.out.println("O livro ja esta disponivel!");
                        System.out.println("----------------------------\n");
                    } else {
                        System.out.println("\n---------------------------------------------------------------");
                        System.out.print("Digite a quantidade de dias de atraso: ");
                        int diasAtraso = s.nextInt();
                        System.out.println("Operacao de devolucao realizada com sucesso\nValor da multa: R$" + livro.devolver(diasAtraso));
                        System.out.println("---------------------------------------------------------------\n");
                    }
                    break;
            }
        } while (opcao < 4);
    }
}
