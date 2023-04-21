package com.mycompany.pizzaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pedido {
    
    private static final Scanner scan = new Scanner(System.in);

    private static float valor;
    private static float valorPizza;
    
    private static int contadorBebida = 0;
    private static int contadorPizza = 0;
    private static int tipoPedido = 0;
    
    static List<Bebida> pedidoBebida = new ArrayList<>();
    static List<Pizza> pedidoPizza = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Pizzaria dados = new Pizzaria();
  
        System.out.println("Bem vindo a pizzaria, "+ dados.getNome()+".");
        System.out.println("Cnpj: "+ dados.getCnpj()+ ".");

        pedirAlgo();
        
    }
    
    private static void pedirAlgo(){
        
        System.out.println("Deseja fazer o seu pedido?");
        System.out.println("[ 1 ] Sim");
        System.out.println("[ 2 ] Nao");
        
        int opcao = scan.nextInt();
        
        switch (opcao) {
            case 1 -> {
                
                pedirTipoEntrega();
                  
            }
            case 2 -> {
                
                System.exit(0);
                
            }
            default -> {
                System.out.println("Por favor, selecione uma opcao valida!");
                pedirAlgo();
            }
        }
        
        
    }
    
    private static void pedirTipoEntrega(){
        
        System.out.println("Como deseja fazer seu pedido?");
        System.out.println("[ 1 ] Pedido A La Carte");
        System.out.println("[ 2 ] Retirada no balcao");
        System.out.println("[ 3 ] Delivery");
        
        int opcao = scan.nextInt();
        
        switch (opcao) {
            case 1 -> {
                
                fazerPedidoFisico();
                    
            }
            case 2 -> {
                
                tipoPedido = 1;
                fazerPedidoFisico();
                
            }
            case 3 -> {
                
                tipoPedido = 2;
                fazerPedidoFisico();
                
            }
            default -> {
                System.out.println("Por favor, selecione uma opcao valida!");
                pedirTipoEntrega();
            }

        }
        
        
    }
    
    private static Pessoa fazerPedidoBalcao(){
        
        Pessoa pessoa = new Pessoa(true);

        scan.nextLine();
        
        System.out.println("Qual o seu nome?");
        String nome = scan.nextLine().trim();
        while (nome == null || nome.isEmpty()) {
            System.out.println("Nome invalido. Por favor, informe um nome valido.");
            nome = scan.nextLine().trim();
        }
        pessoa.setNome(nome);

        System.out.println("Qual o seu cpf?");
        String cpf = scan.nextLine().trim();
        while (cpf == null || cpf.isEmpty()) {
            System.out.println("CPF invalido. Por favor, informe um CPF valido.");
            cpf = scan.nextLine().trim();
        }
        pessoa.setCpf(cpf);

        System.out.println("Qual o seu rg?");
        String rg = scan.nextLine().trim();
        while (rg == null || rg.isEmpty()) {
            System.out.println("RG invalido. Por favor, informe um RG valido.");
            rg = scan.nextLine().trim();
        }
        pessoa.setRg(rg);

        System.out.println("Qual o seu telefone?");
        String telefone = scan.nextLine().trim();
        while (telefone == null || telefone.isEmpty()) {
            System.out.println("Telefone invalido. Por favor, informe um telefone valido.");
            telefone = scan.nextLine().trim();
        }
        pessoa.setTelefone(telefone);  

        return pessoa;
    }
    
    private static Pessoa fazerPedidoDelivery(){
    
    Pessoa pessoa = new Pessoa();

        scan.nextLine();
        
        System.out.println("Qual o seu nome?");
        String nome = scan.nextLine().trim();
        while (nome == null || nome.isEmpty()) {
            System.out.println("Nome invalido. Por favor, informe um nome valido.");
            nome = scan.nextLine().trim();
        }
        pessoa.setNome(nome);

        System.out.println("Qual o seu cpf?");
        String cpf = scan.nextLine().trim();
        while (cpf == null || cpf.isEmpty()) {
            System.out.println("CPF invalido. Por favor, informe um CPF valido.");
            cpf = scan.nextLine().trim();
        }
        pessoa.setCpf(cpf);

        System.out.println("Qual o seu rg?");
        String rg = scan.nextLine().trim();
        while (rg == null || rg.isEmpty()) {
            System.out.println("RG invalido. Por favor, informe um RG valido.");
            rg = scan.nextLine().trim();
        }
        pessoa.setRg(rg);

        System.out.println("Qual o seu telefone?");
        String telefone = scan.nextLine().trim();
        while (telefone == null || telefone.isEmpty()) {
            System.out.println("Telefone invalido. Por favor, informe um telefone valido.");
            telefone = scan.nextLine().trim();
        }
        pessoa.setTelefone(telefone);
        
        System.out.println("Qual a sua cidade?");
        String cidade = scan.nextLine().trim();
        while (cidade == null || cidade.isEmpty()) {
            System.out.println("Cidade invalida. Por favor, informe uma cidade valida.");
            cidade = scan.nextLine().trim();
        }
        pessoa.setCidade(cidade);
        
        System.out.println("Qual a sua rua?");
        String rua = scan.nextLine().trim();
        while (rua == null || rua.isEmpty()) {
            System.out.println("Rua invalida. Por favor, informe uma rua valida.");
            rua = scan.nextLine().trim();
        }
        pessoa.setRua(rua);
        
        System.out.println("Qual o seu bairro?");
        String bairro = scan.nextLine().trim();
        while (bairro == null || bairro.isEmpty()) {
            System.out.println("Bairro invalido. Por favor, informe um bairro valido.");
            bairro = scan.nextLine().trim();
        }
        pessoa.setBairro(bairro);
        
        System.out.println("Qual o numero?");
        String numero = scan.nextLine().trim();
        while (numero == null || numero.isEmpty()) {
            System.out.println("Numero invalido. Por favor, informe um numero valido.");
            numero = scan.nextLine().trim();
        }
        pessoa.setNumero(numero);
        
        return pessoa;
    
    }
    
    private static void fazerPedidoFisico(){
    
        System.out.println("O que deseja pedir?");
        System.out.println("[ 1 ] Pizza");
        System.out.println("[ 2 ] Bebida");
        System.out.println("[ 3 ] Finalizar pedido");
        System.out.println("[ 0 ] Sair do programa");
        
        int opcao = scan.nextInt();
        
        switch (opcao) {
            case 1 -> {
                
                pedirQuantidadePizzas();
                    
            }
            case 2 -> {
                
                pedirBebida();     
                
            }
            case 3 -> {
                
                if (valor == 0) {
                    
                    System.out.println("Seu pedido esta vazio!");
                    fazerPedidoFisico();
                            
                } else {
                    
                    finalizarPedido(); 
                    
                }
                
                    
                
            }
            case 0 -> {
                
                System.exit(0);     
                
            }
            default -> {
                System.out.println("Por favor, selecione uma opcao valida!");
                fazerPedidoFisico();
            }

        }
  
    }
    
    private static void pedirBebida(){
    
        System.out.println("Bebidas");
        System.out.println("[ 1 ] Agua RS3.00");
        System.out.println("[ 2 ] Refrigerante RS4.00");
        System.out.println("[ 3 ] Suco RS5.00");
        System.out.println("[ 4 ] Vinho RS6.00");
        System.out.println("[ 5 ] Cerveja RS7.00");
        System.out.println("[ 0 ] Sair da categoria bebidas");
    
        int opcao = scan.nextInt();
        
        switch (opcao) {
            case 1 -> {
                
                System.out.println("Quantidade de agua");
                int quantidade = scan.nextInt();

                
                for (int i = 0; i < quantidade; i++) {
                    Bebida bebida = new Bebida();
                    bebida.setCodigo(contadorBebida);
                    bebida.setItem("Agua");
                    bebida.setValor(3);

                    pedidoBebida.add(bebida);
                    contadorBebida++;

                    valor += 3;
                }
                
                pedirBebida();
            }
            case 2 -> {
                
                System.out.println("Quantidade de refrigerante");
                int quantidade = scan.nextInt();
                
                
                for (int i = 0; i < quantidade; i++) {
                    Bebida bebida = new Bebida();
                    bebida.setCodigo(contadorBebida);
                    bebida.setItem("Refrigerante");
                    bebida.setValor(4);

                    pedidoBebida.add(bebida);
                    contadorBebida++;

                    valor += 4;
                }
  
                pedirBebida();
            }
            case 3 -> {
                
               System.out.println("Quantidade de suco");
                int quantidade = scan.nextInt();
                
                for (int i = 0; i < quantidade; i++) {
                    Bebida bebida = new Bebida();
                    bebida.setCodigo(contadorBebida);
                    bebida.setItem("Suco");
                    bebida.setValor(5);

                    pedidoBebida.add(bebida);
                    contadorBebida++;

                    valor += 5;
                }

                pedirBebida();
            }
            case 4 -> {
                
               System.out.println("Quantidade de vinho");
                int quantidade = scan.nextInt();
                
                for (int i = 0; i < quantidade; i++) {
                    Bebida bebida = new Bebida();
                    bebida.setCodigo(contadorBebida);
                    bebida.setItem("Vinho");
                    bebida.setValor(6);

                    pedidoBebida.add(bebida);
                    contadorBebida++;

                    valor += 6;
                }
                   
                pedirBebida();
            }
            case 5 -> {
                
                System.out.println("Quantidade de cerveja");
                int quantidade = scan.nextInt();
                
                
                for (int i = 0; i < quantidade; i++) {
                    Bebida bebida = new Bebida();
                    bebida.setCodigo(contadorBebida);
                    bebida.setItem("Cerveja");
                    bebida.setValor(7);

                    pedidoBebida.add(bebida);
                    contadorBebida++;

                    valor += 7;
                }
                
               
                pedirBebida();
            }
            case 0 -> {
             
                fazerPedidoFisico();
                
            }
            default -> {
                System.out.println("Por favor, selecione uma opcao valida!");
                pedirBebida();
            }

        }
        
    }
    
    private static void pedirQuantidadePizzas(){
    
        System.out.println("Quantas pizzas voce deseja?");
        int quantidade = scan.nextInt();
        
        if (quantidade <= 0) {
            
            fazerPedidoFisico();
            
        } else {
            
            for (int i = 0; i < quantidade; i++) {
            
            pedirTamanhoPizza();
        
            }
        }
        
        fazerPedidoFisico();
        
    }
   
    private static void pedirTamanhoPizza(){
        
        System.out.println("Qual o tamanho da pizza?");
            
        System.out.println("Tamanhos");
        System.out.println("[ 1 ] Pequena ( 1 sabor RS 5.00)");
        System.out.println("[ 2 ] Media ( 2 sabor RS 10.00)");
        System.out.println("[ 3 ] Grande ( 3 sabor RS 15.00)");
        System.out.println("[ 4 ] Familia ( 4 sabor RS 20.00)");
            
        int tamanho = scan.nextInt();
        
        montarPizza(tamanho);  
                        
        }
    
    private static void montarPizza(int tamanho){
    
        switch (tamanho) {
            case 1 -> {
                
                System.out.println("Pizzas Salgadas");
                System.out.println("[ 1 ] Calabresa RS10.00");
                System.out.println("[ 2 ] File RS11.00");
                System.out.println("[ 3 ] Coracao RS12.00");
                System.out.println("[ 4 ] Lombo RS13.00");
                System.out.println("[ 5 ] Mexicana RS14.00");
                System.out.println("[ 6 ] Portuguesa RS15.00");
                System.out.println("[ 7 ] Palmito RS16.00");
                System.out.println("[ 8 ] Atum RS17.00");
                System.out.println("[ 9 ] Frango RS18.00");
                System.out.println("[ 10 ] Bolonhesa RS19.00");
                System.out.println("Pizzas Doces");
                System.out.println("[ 11 ] Brigadeiro RS20.00");
                System.out.println("[ 12 ] Charge RS21.00");
                System.out.println("[ 13 ] Alpino RS22.00");
                System.out.println("[ 14 ] Prestigio RS23.00");
                System.out.println("[ 15 ] Chocolate RS24.00");
                System.out.println("[ 16 ] Sensacao RS25.00");
                System.out.println("[ 17 ] Sorvete RS26.00");
                System.out.println("[ 18 ] Nutella RS27.00");
                System.out.println("[ 19 ] Mms RS28.00");
                System.out.println("[ 20 ] Caramelo RS29.00");
                
                Pizza pizza = new Pizza();
                
                for (int j = 0; j < tamanho; j++) {

                    System.out.println("Sabor "+ j);
                    int sabor = scan.nextInt();
                    
                    switch (sabor) {
                        case 1 -> {
     
                            pizza.setSabor("Calabresa");
 
                            valorPizza += 10;
     
                        }
                        case 2 -> {
                                
                            pizza.setSabor("File");

                            valorPizza += 11;
          
                        }
                        case 3 -> {
                            
                            pizza.setSabor("Coracao");
                            
                            valorPizza += 12;
          
                        }
                        case 4 -> {
                            
                            pizza.setSabor("Lombo");

                            valorPizza += 13;
          
                        }
                        case 5 -> {
                            
                            pizza.setSabor("Mexicana");

                            valorPizza += 14;
          
                        }
                        case 6 -> {
                            
                            pizza.setSabor("Portuguesa");

                            valorPizza += 15;
          
                        }
                        case 7 -> {
                            
                            pizza.setSabor("Palmito");

                            valorPizza += 16;
          
                        }
                        case 8 -> {
                            
                            pizza.setSabor("Atum");

                            valorPizza += 17;
          
                        }
                        case 9 -> {
                            
                            pizza.setSabor("Frango");

                            valorPizza += 18;
          
                        }
                        case 10 -> {
                            
                            pizza.setSabor("Bolonhesa");

                            valorPizza += 19;
          
                        }
                        case 11 -> {
                            
                            pizza.setSabor("Brigadeiro");

                            valorPizza += 20;
          
                        }
                        case 12 -> {
                            
                            pizza.setSabor("Charge");

                            valorPizza += 21;
          
                        }
                        case 13 -> {
                            
                            pizza.setSabor("Alpino");

                            valorPizza += 22;
          
                        }
                        case 14 -> {
                            
                            pizza.setSabor("Prestigio");

                            valorPizza += 23;
          
                        }
                        case 15 -> {
                            
                            pizza.setSabor("Chocolate");

                            valorPizza += 24;
          
                        }
                        case 16 -> {
                            
                            pizza.setSabor("Sensacao");

                            valorPizza += 25;
          
                        }
                        case 17 -> {
                            
                            pizza.setSabor("Sorvete");

                            valorPizza += 26;
          
                        }
                        case 18 -> {
                            
                            pizza.setSabor("Nutella");

                            valorPizza += 27;
          
                        }
                        case 19 -> {
                            
                            pizza.setSabor("Mms");

                            valorPizza += 28;
          
                        }
                        case 20 -> {
                            
                            pizza.setSabor("Caramelo");

                            valorPizza += 29;
          
                        }
                        default -> {
                            
                            System.out.println("Por favor, selecione uma opcao valida!");
                            montarPizza(tamanho);
                            
                        }

                    }
     
                }
                
                
                float x = valorPizza + 5;

                pizza.setValor(x);
                pizza.setCodigo(contadorPizza);
                contadorPizza++;
                pedidoPizza.add(pizza);
                
                valor += x;
                
                valorPizza = 0;
                
                
                    
            }
            case 2 -> {
                
                System.out.println("Pizzas Salgadas");
                System.out.println("[ 1 ] Calabresa RS10.00");
                System.out.println("[ 2 ] File RS11.00");
                System.out.println("[ 3 ] Coracao RS12.00");
                System.out.println("[ 4 ] Lombo RS13.00");
                System.out.println("[ 5 ] Mexicana RS14.00");
                System.out.println("[ 6 ] Portuguesa RS15.00");
                System.out.println("[ 7 ] Palmito RS16.00");
                System.out.println("[ 8 ] Atum RS17.00");
                System.out.println("[ 9 ] Frango RS18.00");
                System.out.println("[ 10 ] Bolonhesa RS19.00");
                System.out.println("Pizzas Doces");
                System.out.println("[ 11 ] Brigadeiro RS20.00");
                System.out.println("[ 12 ] Charge RS21.00");
                System.out.println("[ 13 ] Alpino RS22.00");
                System.out.println("[ 14 ] Prestigio RS23.00");
                System.out.println("[ 15 ] Chocolate RS24.00");
                System.out.println("[ 16 ] Sensacao RS25.00");
                System.out.println("[ 17 ] Sorvete RS26.00");
                System.out.println("[ 18 ] Nutella RS27.00");
                System.out.println("[ 19 ] Mms RS28.00");
                System.out.println("[ 20 ] Caramelo RS29.00");
                
                Pizza pizza = new Pizza();
                
                for (int j = 0; j < tamanho; j++) {

                    System.out.println("Sabor "+ j);
                    int sabor = scan.nextInt();
                    
                    switch (sabor) {
                        case 1 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Calabresa");
                                       
                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Calabresa");
                            
                            }
                            
                            valorPizza += 10;
     
                        }
                        case 2 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("File");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'File");
                                
                            }
                            
                            valorPizza += 11;
          
                        }
                        case 3 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Coracao");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Coracao");
                                
                            }
                            
                            valorPizza += 12;
          
                        }
                        case 4 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Lombo");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Lombo");
                                
                            }
                            
                            valorPizza += 13;
          
                        }
                        case 5 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Mexicana");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Mexicana");
                                
                            }
                            
                            valorPizza += 14;
          
                        }
                        case 6 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Portuguesa");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Portuguesa");
                                
                            }
                            
                            valorPizza += 15;
          
                        }
                        case 7 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Palmito");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Palmito");
                                
                            }
                            
                            valorPizza += 16;
          
                        }
                        case 8 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Atum");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Atum");
                                
                            }
                            
                            valorPizza += 17;
          
                        }
                        case 9 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Frango");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Frango");
                                
                            }
                            
                            valorPizza += 18;
          
                        }
                        case 10 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Bolonhesa");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Bolonhesa");
                                
                            }
                            
                            valorPizza += 19;
          
                        }
                        case 11 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Brigadeiro");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Brigadeiro");
                                
                            }
                            
                            valorPizza += 20;
          
                        }
                        case 12 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Charge");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Charge");
                                
                            }
                            
                            valorPizza += 21;
          
                        }
                        case 13 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Alpino");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Alpino");
                                
                            }
                            
                            valorPizza += 22;
          
                        }
                        case 14 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Prestigio");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Prestigio");
                                
                            }
                            
                            valorPizza += 23;
          
                        }
                        case 15 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Chocolate");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Chocolate");
                                
                            }
                            
                            valorPizza += 24;
          
                        }
                        case 16 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Sensacao");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Sensacao");
                                
                            }
                            
                            valorPizza += 25;
          
                        }
                        case 17 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Sorvete");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Sorvete");
                                
                            }
                            
                            valorPizza += 26;
          
                        }
                        case 18 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Nutella");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Nutella");
                                
                            }
                            
                            valorPizza += 27;
          
                        }
                        case 19 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Mms");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Mms");
                                
                            }
                            
                            valorPizza += 28;
          
                        }
                        case 20 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Caramelo");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Caramelo");
                                
                            }
                            
                            valorPizza += 29;
          
                        }
                        default -> {
                            
                            System.out.println("Por favor, selecione uma opcao valida!");
                            montarPizza(tamanho);
                            
                        }

                    }
     
                }
                
                float x = (valorPizza/2) + 10;

                pizza.setValor(x);
                pizza.setCodigo(contadorPizza);
                contadorPizza++;
                pedidoPizza.add(pizza);
                
                valor += x;
                
                valorPizza = 0;       
                
            }
            case 3 -> {
                
                System.out.println("Pizzas Salgadas");
                System.out.println("[ 1 ] Calabresa RS10.00");
                System.out.println("[ 2 ] File RS11.00");
                System.out.println("[ 3 ] Coracao RS12.00");
                System.out.println("[ 4 ] Lombo RS13.00");
                System.out.println("[ 5 ] Mexicana RS14.00");
                System.out.println("[ 6 ] Portuguesa RS15.00");
                System.out.println("[ 7 ] Palmito RS16.00");
                System.out.println("[ 8 ] Atum RS17.00");
                System.out.println("[ 9 ] Frango RS18.00");
                System.out.println("[ 10 ] Bolonhesa RS19.00");
                System.out.println("Pizzas Doces");
                System.out.println("[ 11 ] Brigadeiro RS20.00");
                System.out.println("[ 12 ] Charge RS21.00");
                System.out.println("[ 13 ] Alpino RS22.00");
                System.out.println("[ 14 ] Prestigio RS23.00");
                System.out.println("[ 15 ] Chocolate RS24.00");
                System.out.println("[ 16 ] Sensacao RS25.00");
                System.out.println("[ 17 ] Sorvete RS26.00");
                System.out.println("[ 18 ] Nutella RS27.00");
                System.out.println("[ 19 ] Mms RS28.00");
                System.out.println("[ 20 ] Caramelo RS29.00");
                
                Pizza pizza = new Pizza();
                
                for (int j = 0; j < tamanho; j++) {

                    System.out.println("Sabor "+ j);
                    int sabor = scan.nextInt();
                    
                    switch (sabor) {
                        case 1 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Calabresa");
                                       
                            } else{
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Calabresa");
                            
                            }
                            
                            valorPizza += 10;
     
                        }
                        case 2 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("File");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'File");
                                
                            }
                            
                            valorPizza += 11;
          
                        }
                        case 3 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Coracao");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Coracao");
                                
                            }
                            
                            valorPizza += 12;
          
                        }
                        case 4 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Lombo");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Lombo");
                                
                            }
                            
                            valorPizza += 13;
          
                        }
                        case 5 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Mexicana");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Mexicana");
                                
                            }
                            
                            valorPizza += 14;
          
                        }
                        case 6 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Portuguesa");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Portuguesa");
                                
                            }
                            
                            valorPizza += 15;
          
                        }
                        case 7 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Palmito");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Palmito");
                                
                            }
                            
                            valorPizza += 16;
          
                        }
                        case 8 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Atum");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Atum");
                                
                            }
                            
                            valorPizza += 17;
          
                        }
                        case 9 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Frango");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Frango");
                                
                            }
                            
                            valorPizza += 18;
          
                        }
                        case 10 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Bolonhesa");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Bolonhesa");
                                
                            }
                            
                            valorPizza += 19;
          
                        }
                        case 11 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Brigadeiro");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Brigadeiro");
                                
                            }
                            
                            valorPizza += 20;
          
                        }
                        case 12 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Charge");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Charge");
                                
                            }
                            
                            valorPizza += 21;
          
                        }
                        case 13 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Alpino");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Alpino");
                                
                            }
                            
                            valorPizza += 22;
          
                        }
                        case 14 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Prestigio");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Prestigio");
                                
                            }
                            
                            valorPizza += 23;
          
                        }
                        case 15 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Chocolate");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Chocolate");
                                
                            }
                            
                            valorPizza += 24;
          
                        }
                        case 16 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Sensacao");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Sensacao");
                                
                            }
                            
                            valorPizza += 25;
          
                        }
                        case 17 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Sorvete");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Sorvete");
                                
                            }
                            
                            valorPizza += 26;
          
                        }
                        case 18 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Nutella");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Nutella");
                                
                            }
                            
                            valorPizza += 27;
          
                        }
                        case 19 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Mms");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Mms");
                                
                            }
                            
                            valorPizza += 28;
          
                        }
                        case 20 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Caramelo");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Caramelo");
                                
                            }
                            
                            valorPizza += 29;
          
                        }
                        default -> {
                            
                            System.out.println("Por favor, selecione uma opcao valida!");
                            montarPizza(tamanho);
                            
                        }

                    }
     
                }
                
                float x = (valorPizza/3) + 15;

                pizza.setValor(x);
                pizza.setCodigo(contadorPizza);
                contadorPizza++;
                pedidoPizza.add(pizza);
                
                valor += x;
                
                valorPizza = 0;   
                
            }
            case 4 -> {
                
                System.out.println("Pizzas Salgadas");
                System.out.println("[ 1 ] Calabresa RS10.00");
                System.out.println("[ 2 ] File RS11.00");
                System.out.println("[ 3 ] Coracao RS12.00");
                System.out.println("[ 4 ] Lombo RS13.00");
                System.out.println("[ 5 ] Mexicana RS14.00");
                System.out.println("[ 6 ] Portuguesa RS15.00");
                System.out.println("[ 7 ] Palmito RS16.00");
                System.out.println("[ 8 ] Atum RS17.00");
                System.out.println("[ 9 ] Frango RS18.00");
                System.out.println("[ 10 ] Bolonhesa RS19.00");
                System.out.println("Pizzas Doces");
                System.out.println("[ 11 ] Brigadeiro RS20.00");
                System.out.println("[ 12 ] Charge RS21.00");
                System.out.println("[ 13 ] Alpino RS22.00");
                System.out.println("[ 14 ] Prestigio RS23.00");
                System.out.println("[ 15 ] Chocolate RS24.00");
                System.out.println("[ 16 ] Sensacao RS25.00");
                System.out.println("[ 17 ] Sorvete RS26.00");
                System.out.println("[ 18 ] Nutella RS27.00");
                System.out.println("[ 19 ] Mms RS28.00");
                System.out.println("[ 20 ] Caramelo RS29.00");
                
                Pizza pizza = new Pizza();
                
                for (int j = 0; j < tamanho; j++) {

                    System.out.println("Sabor "+ j);
                    int sabor = scan.nextInt();
                    
                    switch (sabor) {
                        case 1 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Calabresa");
                                       
                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Calabresa");
                            
                            }
                            
                            valorPizza += 10;
     
                        }
                        case 2 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("File");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'File");
                                
                            }
                            
                            valorPizza += 11;
          
                        }
                        case 3 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Coracao");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Coracao");
                                
                            }
                            
                            valorPizza += 12;
          
                        }
                        case 4 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Lombo");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Lombo");
                                
                            }
                            
                            valorPizza += 13;
          
                        }
                        case 5 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Mexicana");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Mexicana");
                                
                            }
                            
                            valorPizza += 14;
          
                        }
                        case 6 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Portuguesa");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Portuguesa");
                                
                            }
                            
                            valorPizza += 15;
          
                        }
                        case 7 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Palmito");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Palmito");
                                
                            }
                            
                            valorPizza += 16;
          
                        }
                        case 8 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Atum");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Atum");
                                
                            }
                            
                            valorPizza += 17;
          
                        }
                        case 9 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Frango");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Frango");
                                
                            }
                            
                            valorPizza += 18;
          
                        }
                        case 10 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Bolonhesa");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Bolonhesa");
                                
                            }
                            
                            valorPizza += 19;
          
                        }
                        case 11 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Brigadeiro");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Brigadeiro");
                                
                            }
                            
                            valorPizza += 20;
          
                        }
                        case 12 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Charge");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Charge");
                                
                            }
                            
                            valorPizza += 21;
          
                        }
                        case 13 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Alpino");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Alpino");
                                
                            }
                            
                            valorPizza += 22;
          
                        }
                        case 14 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Prestigio");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Prestigio");
                                
                            }
                            
                            valorPizza += 23;
          
                        }
                        case 15 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Chocolate");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Chocolate");
                                
                            }
                            
                            valorPizza += 24;
          
                        }
                        case 16 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Sensacao");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Sensacao");
                                
                            }
                            
                            valorPizza += 25;
          
                        }
                        case 17 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Sorvete");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Sorvete");
                                
                            }
                            
                            valorPizza += 26;
          
                        }
                        case 18 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Nutella");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Nutella");
                                
                            }
                            
                            valorPizza += 27;
          
                        }
                        case 19 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Mms");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Mms");
                                
                            }
                            
                            valorPizza += 28;
          
                        }
                        case 20 -> {
                            
                            if (pizza.getSabor() == null) {
                                
                                pizza.setSabor("Caramelo");

                            } else {
                            
                                pizza.setSabor(pizza.getSabor() + "', 'Caramelo");
                                
                            }
                            
                            valorPizza += 29;
          
                        }
                        default -> {
                            
                            System.out.println("Por favor, selecione uma opcao valida!");
                            montarPizza(tamanho);
                            
                        }

                    }
     
                }
                
                float x = (valorPizza/4) + 20;

                pizza.setValor(x);
                pizza.setCodigo(contadorPizza);
                contadorPizza++;
                pedidoPizza.add(pizza);
                
                valor += x;
                
                valorPizza = 0;     
                
            }
            default -> {
                System.out.println("Por favor, selecione uma opcao valida!");
                pedirTipoEntrega();
            }

            
            
            }
    
    }
             
    private static void finalizarPedido(){
        
        if (tipoPedido == 1) {
            
            System.out.println("Retirada no balcao");
            System.out.println(" ");
            Pessoa pessoa = fazerPedidoBalcao();
            
            System.out.println(" ");
            System.out.println("-----DADOS-----");
            System.out.println(" ");

            System.out.println(pessoa.toString(true));
            
            tipoPedido = 0;
            finalizarPedido();
            
        } else if(tipoPedido == 2){
            
            System.out.println("Delivery");
            System.out.println(" ");
            Pessoa pessoa = fazerPedidoDelivery();
            
            System.out.println(" ");
            System.out.println("-----DADOS-----");
            System.out.println(" ");

            System.out.println(pessoa);
            
            
            tipoPedido = 0;
            finalizarPedido();
            
            
        } else {
        
        System.out.println(" ");
        System.out.println("-----PEDIDO-----");
        System.out.println(" ");
        System.out.println("PIZZAS");
        System.out.println(" ");
        
        System.out.println(pedidoPizza.toString());
        
        System.out.println(" ");
        System.out.println("BEBIDAS");
        System.out.println(" ");
        
        System.out.println(pedidoBebida.toString());
        
        System.out.println(" ");
        System.out.println("VALOR TOTAL: "+ valor);
        System.out.println(" ");
        
        System.out.println("Remover algum item?");
        System.out.println("[ 1 ] Sim");
        System.out.println("[ 2 ] Nao");
        int op = scan.nextInt();
        
            switch (op) {
                case 1 -> {
                    
                    removerItem();
                    
                }
                case 2 -> {
                    
                    fazerPagamento();
                    
                }
                default -> finalizarPedido();
            }
    
        }
    
    }
    
    private static void removerItem(){
    
        System.out.println("-----Remover item-----");
        System.out.println("[ 1 ] Pizza");
        System.out.println("[ 2 ] Bebida");
        System.out.println("[ 0 ] Cancelar");
        int op = scan.nextInt();
        
            switch (op) {
                case 1 -> {
                    
                    removerPizza();
                    
                }
                case 2 -> {
                    
                    removerBebida();
                    
                }
                case 0 -> {
                    
                    finalizarPedido();
                    
                }
                default -> {
                
                    System.out.println("Por favor, selecione uma opcao valida!");
                    removerItem();
                
                }
            }
    
        }
    
    private static void removerPizza(){
    
        System.out.println("Qual pizza voce quer remover pelo seu codigo");
        int codigo = scan.nextInt();
        
        
        Pizza pizza = pedidoPizza.get(codigo);
        float valorPizzaRemovida = pizza.getValor();
        
        
        
        
        
        //float valorPizza = pedidoPizza.get(codigo).valor;
        
        
        
        valor = valor - valorPizzaRemovida;
        
        pedidoPizza.remove(codigo);
        
        removerItem();
        
    }
            
    private static void removerBebida(){
    
        System.out.println("Qual a bebida voce quer remover pelo seu codigo");
        int codigo = scan.nextInt();
        
        Bebida bebida = pedidoBebida.get(codigo);
        float valorBebidaRemovida = bebida.getValor();
        
        //float valorBebida = pedidoBebida.get(codigo).valor;
        
        valor = valor - valorBebidaRemovida;
        
        pedidoBebida.remove(codigo);
        
        removerItem();
    
    }
    
    private static void fazerPagamento(){
    
        System.out.println("Metodo de pagamento?");
        System.out.println("[ 1 ] Cartao");
        System.out.println("[ 2 ] Pix");
        
        int opcao = scan.nextInt();
        
        switch (opcao) {
            case 1 -> {
                
                Cartao cartao = new Cartao();
                
                System.out.println("Qual o nome do cartao?");
                String nome = null;
                do {
                    if (scan.hasNextLine()) {
                        scan.skip(".*\n");
                    }
                    nome = scan.nextLine().trim();
                    if (nome.isEmpty()) {
                        System.out.println("Nome invalido. Por favor, informe um nome valido.");
                    }
                } while (nome.isEmpty());
                cartao.setNome(nome);   

                System.out.println("Qual o cvc?");
                String cvc = scan.nextLine().trim();
                while (cvc == null || cvc.isEmpty()) {
                    System.out.println("cvc invalido. Por favor, informe um cvc valido.");
                    cvc = scan.nextLine().trim();
                }
                cartao.setCvc(cvc);

                System.out.println("Qual a validade?");
                String validade = scan.nextLine().trim();
                while (validade == null || validade.isEmpty()) {
                    System.out.println("Validade invalida. Por favor, informe uma validade valida.");
                    validade = scan.nextLine().trim();
                }
                cartao.setValidade(validade);

                System.out.println("Qual o numero do cartao?");
                String numero = scan.nextLine().trim();
                while (numero == null || numero.isEmpty()) {
                    System.out.println("Numero invalido. Por favor, informe um numero valido.");
                    numero = scan.nextLine().trim();
                }
                cartao.setNumero(numero);
                       
                System.out.println(" ");
                System.out.println("PAGAMENTO CARTAO");
                System.out.println(" ");
                
                System.out.println(cartao);
                
                System.out.println(" ");
                System.out.println("PEDIDO PAGO, BOA NOITE");
                System.out.println(" ");
                
            }
            case 2 -> {
                
                Pix pix = new Pix();
                
                System.out.println("Qual a chave PIX?");
                String chave = null;
                do {
                    if (scan.hasNextLine()) {
                        scan.skip(".*\n");
                    }
                    chave = scan.nextLine().trim();
                    if (chave.isEmpty()) {
                        System.out.println("Chave PIX invalida. Por favor, informe uma chave valida.");
                    }
                } while (chave.isEmpty());
                pix.setChave(chave);  
                
                System.out.println(" ");
                System.out.println("PAGAMENTO PIX");
                System.out.println(" ");
                
                System.out.println(pix);
                
                System.out.println(" ");
                System.out.println("PEDIDO PAGO, BOA NOITE");
                System.out.println(" ");
                
            }
            default -> {
                System.out.println("Por favor, selecione uma opcao valida!");
                fazerPagamento();
            }

        }
        
    }
    
}
    
    
    
    
            
            
            
    
    
    

