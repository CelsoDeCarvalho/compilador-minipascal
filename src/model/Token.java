/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author De Carvalho
 */
public class Token {
    
    private String classe;
    private String lexema;
    private String padrao;
    private int linha;
    private int coluna;

    public Token(String classe, String lexema, String padrao, int linha, int coluna) {
        this.classe = classe;
        this.lexema = lexema;
        this.padrao = padrao;
        this.linha = linha;
        this.coluna = coluna;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    
}
