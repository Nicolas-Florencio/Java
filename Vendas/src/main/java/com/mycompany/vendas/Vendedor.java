
package com.mycompany.vendas;

public class Vendedor extends Usuario{ 

    private float salario; 

    private int comissao; //percentual 

 

    public Vendedor(float salario, int comissao, String nome, String login, int senha, int idade, String email) { 

        super(nome, login, senha, idade, email); 

        this.salario = salario; 

        this.comissao = comissao; 

    } 

 

    public float getSalario() { 

        return salario; 

    } 

 

    public void setSalario(float salario) { 

        this.salario = salario; 

    } 

 

    public float getComissao() { 

        return comissao; 

    } 

 

    public void setComissao(int comissao) { 

        this.comissao = comissao; 

    } 

     

    public float calcSalario(float val_Vendas){ 

        float sal; 

         

        sal = this.getSalario() + val_Vendas * (this.getComissao()/100); 

         

        return sal; 

    } 

     

    public String mostrar_Vendedor(){ 

        String msg; 

         

        msg = this.mostrar_usuario(); 

        msg += "\nSalário: " + this.getSalario(); 

        msg += "\nComissão: " + this.getComissao() + "%"; 

         

        return msg; 

    } 

     

} 