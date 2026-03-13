package br.com.fiapride.model;

public class Veiculos {

    private String individuo;
    private String pl;
    private double gas;


    public Veiculos(String individuo, String pl) {
        this.setIndividuo(individuo);
        this.setPl(pl);
        this.setGas(0); 
    }

    public double getGas() {
        return this.gas;
    }

    private void setGas(double valor) {
        if (valor >= 0) {
            this.gas = valor;
        } else {
            System.out.println("Erro: Gasolina menor que 0");
        }
    }

    public String getIndividuo() {
        return this.individuo;
    }

    private void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPl() {
        return this.pl;
    }

    private void setPl(String pl) {
        this.pl = pl;
    }

    public void adicionar(double v) {
        setGas(this.gas + v);
    }

    public void gasta(double v) {

        if (this.gas >= v) {
            setGas(this.gas - v);
        } else {
            System.out.println("Gasolina insuficiente");
        }

    }
}