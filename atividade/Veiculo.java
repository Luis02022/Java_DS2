public class Veiculo {
    String placa; 
    String cor;
    int numeroPassageiros;
    float capacidadeTanque;
    float consumoMedio;
    
    public Veiculo(String placa, String cor, int numeroPassageiros, float capacidadeTanque, float consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoMedio = consumoMedio;

    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
    public float getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public float getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(float consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    
    @Override
    public String toString() {
        return "Veiculo [placa=" + placa + ", cor=" + cor + ", numeroPassageiros=" + numeroPassageiros
                + ", capacidadeTanque=" + capacidadeTanque + ", consumoMedio=" + consumoMedio + "]";
    }


    


}
