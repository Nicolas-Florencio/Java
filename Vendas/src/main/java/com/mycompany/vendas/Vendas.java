package com.mycompany.vendas;

public class Vendas { 

    public static void main(String[] args) { 

       Vendedor v = new Vendedor(1000,8,"TOTO","ttoo724", 123456, 10,"toto@auau.com.br"); 

        System.out.println(v.mostrar_Vendedor()); 

        v.aniversario(); 

        System.out.println(v.mostrar_Vendedor()); 

         

        System.out.println("Salário do mês: "+v.calcSalario(15000)); 

         

        Cliente c = new Cliente(3000,"Rex","xer123",987654, 12,"rex_cachorrao@auau.com.br" ); 

         

        System.out.println(c.mostrarCliente()); 

         

        c.aniversario(); 

         

        System.out.println(c.mostrarCliente()); 

    } 
} 
