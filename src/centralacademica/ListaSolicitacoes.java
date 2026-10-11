/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centralacademica;

public class ListaSolicitacoes {

    private No inicio;
    private No fim;
    private int tamanho;

    public void adicionar(Solicitacao solicitacao) {

        No novo = new No(solicitacao);

        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }

        tamanho++;
    }

    public Solicitacao buscar(int codigo) {

        No atual = inicio;

        while (atual != null) {

            if (atual.solicitacao.getCodigo() == codigo) {
                return atual.solicitacao;
            }

            atual = atual.proximo;
        }

        return null;
    }

    public boolean remover(int codigo) {

        if (estaVazia()) {
            return false;
        }

        // Caso 1: remover o primeiro
        if (inicio.solicitacao.getCodigo() == codigo) {

            inicio = inicio.proximo;
            tamanho--;

            if (tamanho == 0) {
                fim = null;
            }

            return true;
        }

        No anterior = inicio;
        No atual = inicio.proximo;

        while (atual != null) {

            if (atual.solicitacao.getCodigo() == codigo) {

                anterior.proximo = atual.proximo;

                if (atual == fim) {
                    fim = anterior;
                }

                tamanho--;
                return true;
            }

            anterior = atual;
            atual = atual.proximo;
        }

        return false;
    }

    public void listar() {

        if (estaVazia()) {
            System.out.println("Nenhuma solicitacao cadastrada.");
            return;
        }

        No atual = inicio;

        while (atual != null) {
            System.out.println(atual.solicitacao);
            atual = atual.proximo;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}