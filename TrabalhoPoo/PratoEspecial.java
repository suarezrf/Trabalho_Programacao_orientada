package TrabalhoPoo.modelo;

public class PratoEspecial implements Prato {

    private String nome;
    private double precoBase;
    private double ingredientePremium;
    private int tempoPreparo;

    public PratoEspecial(String nome, double precoBase, double ingredientePremium, int tempoPreparo) {

        this.nome = nome;
        this.precoBase = precoBase;
        this.ingredientePremium = ingredientePremium;
        this.tempoPreparo = tempoPreparo;
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double calcularPreco() {
        return precoBase + ingredientePremium;
    }

    @Override
    public int getTempoPreparo() {
        return tempoPreparo;
    }
}