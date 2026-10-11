/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centralacademica;
public class Solicitacao {

    private int codigo;
    private String nomeAluno;
    private String tipo;
    private String descricao;

    public Solicitacao(int codigo, String nomeAluno, String tipo, String descricao) {
        this.codigo = codigo;
        this.nomeAluno = nomeAluno;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "#" + codigo
                + " | " + nomeAluno
                + " | " + tipo
                + " | " + descricao;
    }
}