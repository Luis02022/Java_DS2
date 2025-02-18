package Atividade3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luis", 19, 
        new Endereco("Rua C", "Salvador", "45"));


        System.out.println(cliente.toString());

    }
}
