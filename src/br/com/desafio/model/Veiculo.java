package br.com.desafio.model;

public class Veiculo {

    private String marca;
    private String modelo;
    private String qntCavalo;
    private String tipoCombustivel;
    private int totalLitrosCombustivel;

    public Veiculo(String marca, String modelo, String qntCavalo, String tipoCombustivel, int totalLitrosCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.qntCavalo = qntCavalo;
        this.tipoCombustivel = tipoCombustivel;
        this.totalLitrosCombustivel = totalLitrosCombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQntCavalo() {
        return qntCavalo;
    }

    public void setQntCavalo(String qntCavalo) {
        this.qntCavalo = qntCavalo;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getTotalLitrosCombustivel() {
        return totalLitrosCombustivel;
    }

    public void setTotalLitrosCombustivel(int totalLitrosCombustivel) {
        this.totalLitrosCombustivel = totalLitrosCombustivel;
    }
}
