/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package centralacademica;
public class FilaSolicitacoes {

    private No inicio;
    private No fim;
    private int tamanho;

    public void enfileirar(Solicitacao solicitacao) {

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

    public Solicitacao desenfileirar() {

        if (estaVazia()) {
            return null;
        }

        Solicitacao solicitacao = inicio.solicitacao;

        inicio = inicio.proximo;
        tamanho--;

        if (tamanho == 0) {
            fim = null;
        }

        return solicitacao;
    }

    public Solicitacao consultarInicio() {

        if (estaVazia()) {
            return null;
        }

        return inicio.solicitacao;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public void listar() {

        if (estaVazia()) {
            System.out.println("Fila vazia.");
            return;
        }

        No atual = inicio;

        while (atual != null) {
            System.out.println(atual.solicitacao);
            atual = atual.proximo;
        }
    }
}
