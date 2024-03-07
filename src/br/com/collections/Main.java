package br.com.collections;


import java.util.*;

public class Main {

    private static void mostrarCadastros(List<Pessoa> lista){
        List<Pessoa> mulher = new ArrayList<>();
        List<Pessoa> homem = new ArrayList<>();

        for(Pessoa pessoa : lista){
            if(pessoa.getSexo().equalsIgnoreCase("feminino")){
                mulher.add(pessoa);
            } else if (pessoa.getSexo().equalsIgnoreCase("masculino")) {
                homem.add(pessoa);
            }
        }

        System.out.println("Lista de mulheres: " + mulher);
        System.out.println("Lista de homens: " + homem);

    }


    private static void cadastrar(){
        Scanner input = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();

        System.out.println("quantas pessoas deseja cadastrar?:  ");
        int quantidade = input.nextInt();
        input.nextLine();

        while(quantidade > 0){
            System.out.print("Digite o nome da pessoa: ");
            String nome = input.nextLine();

            System.out.print("Digite o sexo da pessoa: ");
            String sexo = input.nextLine();

            Pessoa pessoa = new Pessoa(nome,sexo);

            listaPessoas.add(pessoa);
            System.out.println("Pessoa cadastrada: ");

            quantidade --;

        }
        input.close();

        mostrarCadastros(listaPessoas);
        System.out.println("_______xxxxxxx_______");

        }




    public static void main(String [] args){

        cadastrar();


    }
}
