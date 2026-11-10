package TrabalhoPoo.modelo;

import TrabalhoPoo.exception.PrecoInvalidoException;

public class Combo implements Prato {
    private String nome;
    private double precoBase;
    private int tempoPreparo;

    public Combo(String nome, double precoBase, int tempoPreparo)
            throws PrecoInvalidoException {

        if (precoBase < 0) {
            throw new PrecoInvalidoException("Preço não pode ser negativo!");
        }

        this.nome = nome;
        this.precoBase = precoBase;
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double calcularPreco() {
        return precoBase *0.85;
    }

    @Override
    public int getTempoPreparo() {
        return tempoPreparo;}
}
