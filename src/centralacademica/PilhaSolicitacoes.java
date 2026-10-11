/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centralacademica;
public class PilhaSolicitacoes {

    private No topo;
    private int tamanho;

    public void empilhar(Solicitacao solicitacao) {

        No novo = new No(solicitacao);

        novo.proximo = topo;
        topo = novo;

        tamanho++;
    }

    public Solicitacao desempilhar() {

        if (estaVazia()) {
            return null;
        }

        Solicitacao solicitacao = topo.solicitacao;

        topo = topo.proximo;
        tamanho--;

        return solicitacao;
    }

    public Solicitacao consultarTopo() {

        if (estaVazia()) {
            return null;
        }

        return topo.solicitacao;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public void listar() {

        if (estaVazia()) {
            System.out.println("Historico vazio.");
            return;
        }

        No atual = topo;

        while (atual != null) {
            System.out.println(atual.solicitacao);
            atual = atual.proximo;
        }
    }
}