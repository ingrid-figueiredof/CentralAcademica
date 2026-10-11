/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centralacademica;

import java.util.Scanner;
public class CentralAcademica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ListaSolicitacoes lista = new ListaSolicitacoes();
        FilaSolicitacoes fila = new FilaSolicitacoes();
        PilhaSolicitacoes pilha = new PilhaSolicitacoes();

        int opcao;

        do {

            System.out.println("\n========== CENTRAL ACADEMICA ==========");
            System.out.println("1 - Abrir nova solicitacao");
            System.out.println("2 - Consultar solicitacao");
            System.out.println("3 - Exibir solicitacoes cadastradas");
            System.out.println("4 - Exibir fila de atendimento");
            System.out.println("5 - Atender proxima solicitacao");
            System.out.println("6 - Consultar ultimo atendimento");
            System.out.println("7 - Desfazer ultimo atendimento");
            System.out.println("8 - Exibir estatisticas");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Codigo: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();

                    System.out.print("Descricao: ");
                    String descricao = scanner.nextLine();

                    if (lista.buscar(codigo) != null) {
                        System.out.println("Ja existe uma solicitacao com esse codigo.");
                        break;
                    }

                    Solicitacao nova = new Solicitacao(
                            codigo,
                            nome,
                            tipo,
                            descricao
                    );

                    lista.adicionar(nova);
                    fila.enfileirar(nova);

                    System.out.println("Solicitacao cadastrada com sucesso.");

                    break;

                case 2:

                    System.out.print("Digite o codigo: ");
                    int codigoBusca = scanner.nextInt();
                    scanner.nextLine();

                    Solicitacao encontrada = lista.buscar(codigoBusca);

                    if (encontrada == null) {
                        System.out.println("Solicitacao nao encontrada.");
                    } else {
                        System.out.println("Solicitacao encontrada:");
                        System.out.println(encontrada);
                    }

                    break;

                case 3:

                    System.out.println("\n--- SOLICITACOES CADASTRADAS ---");
                    lista.listar();

                    break;

                case 4:

                    System.out.println("\n--- FILA DE ATENDIMENTO ---");
                    fila.listar();

                    break;

                case 5:

                    Solicitacao atendida = fila.desenfileirar();

                    if (atendida == null) {
                        System.out.println("Nao existem solicitacoes na fila.");
                    } else {

                        pilha.empilhar(atendida);

                        System.out.println("Solicitacao atendida:");
                        System.out.println(atendida);
                    }

                    break;

                case 6:

                    Solicitacao ultimo = pilha.consultarTopo();

                    if (ultimo == null) {
                        System.out.println("Nenhum atendimento realizado.");
                    } else {
                        System.out.println("Ultimo atendimento:");
                        System.out.println(ultimo);
                    }

                    break;

                case 7:

                    Solicitacao desfeita = pilha.desempilhar();

                    if (desfeita == null) {
                        System.out.println("Nao existe atendimento para desfazer.");
                    } else {

                        fila.enfileirar(desfeita);

                        System.out.println("Atendimento desfeito.");
                        System.out.println(
                                "Solicitacao retornou para o final da fila:"
                        );
                        System.out.println(desfeita);
                    }

                    break;

                case 8:

                    System.out.println("\n--- ESTATISTICAS ---");
                    System.out.println(
                            "Solicitacoes cadastradas: "
                                    + lista.tamanho()
                    );

                    System.out.println(
                            "Solicitacoes aguardando atendimento: "
                                    + fila.tamanho()
                    );

                    System.out.println(
                            "Atendimentos no historico: "
                                    + pilha.tamanho()
                    );

                    break;

                case 0:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
    

