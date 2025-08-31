
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
        String titulo = s.next();

        System.out.print("Digite a identificacao do livro: ");
        int identificacao = s.nextInt();
        Livro livro = new Livro(identificacao, titulo);

        do {
            System.out.println("1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.println();
            System.out.print("      Digite a opcao: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("        Consultar livro");
                    System.out.println("Identificacao: " + livro.getIdentificacao());
                    System.out.println("Titulo: " + livro.getTitulo());
                    System.out.println("Situacao: " + (livro.getSituacao() ? "Disponivel" : "Emprestado"));
                case 2:
                    if (livro.getSituacao()) {
                        System.out.println("O livro esta emprestado");
                    }
                    else {
                        System.out.println("Operação de emprestimo realizada com sucesso");
                        livro.emprestar();
                    }
                 case 3:
                    if(livro.getSituacao() == true){
                        System.out.println("O livro ja esta disponivel");
                    }
                    System.out.print("Digite a quantidade de dias de atraso: ");
                    int diasAtraso = s.nextInt();                      
                    System.out.println("operacao de emprestimo realizada com sucesso\nValor da multa: R$" + livro.devolver(diasAtraso));                
            }              
    }while(opcao < 4);
    }    
}
