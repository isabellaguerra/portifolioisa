package br.edu.fatecpg.view;
import br.edu.fatecpg.service.ConsomeApi;
public class Main {
    public static void main(String[] args) throws Exception {
        String cep = "11706160";
        String endereco = ConsomeApi.buscarEndereco(cep);
        System.out.println(endereco);
    }
}
