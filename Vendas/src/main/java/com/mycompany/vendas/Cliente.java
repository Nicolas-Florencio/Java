
package com.mycompany.vendas;

public class Cliente extends Usuario{ 

    private float limite; 

 

    public Cliente(float limite, String nome, String login, int senha, int idade, String email) { 

        super(nome, login, senha, idade, email); 

        this.limite = limite; 

    } 

    public float getLimite() { 

        return limite; 

    } 

 

    public void setLimite(float limite) { 

        this.limite = limite; 

    } 

     

    public String mostrarCliente(){ 

        String msg; 

         

        msg = this.mostrar_usuario(); 

        msg +="\nLimite: " + this.getLimite(); 

         

        return msg; 

    } 

    

} 
