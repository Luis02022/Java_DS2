package Atividade3;

public class Endereco {
   
    private String logradouro;
    private String cidade;
    private String numero;
    
    public Endereco(String logradouro, String cidade, String numero) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "\nEndereco \nLogradouro: " + logradouro + "\nCidade=" + cidade + "\nNumero=" + numero;
    }

    



    }
