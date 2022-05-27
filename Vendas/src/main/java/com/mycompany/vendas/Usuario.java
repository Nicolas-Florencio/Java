package com.mycompany.vendas;

public class Usuario { 

    private String nome; 

    private String login; 

    private int senha; 

    private int idade; 

    private String email; 

 
    public Usuario(String nome, String login, int senha, int idade, String email) { 

        this.nome = nome; 

        this.login = login; 

        this.senha = senha; 

        this.idade = idade; 

        this.email = email; 

    } 

 

    public String getNome() { 

        return nome; 

    } 

 

    public void setNome(String nome) { 

        this.nome = nome; 

    } 

 

    public String getLogin() { 

        return login; 

    } 

 

    public void setLogin(String login) { 

        this.login = login; 

    } 

 

    public int getSenha() { 

        return senha; 

    } 

 

    public void setSenha(int senha) { 

        this.senha = senha; 

    } 

 

    public int getIdade() { 

        return idade; 

    } 

 

    public void setIdade(int idade) { 

        this.idade = idade; 

    } 

 

    public String getEmail() { 

        return email; 

    } 

 

    public void setEmail(String email) { 

        this.email = email; 

    } 

     

    public void aniversario(){ 

        this.idade++; 

    } 

     

    public String mostrar_usuario(){ 

        String msg; 

         

        msg = "Nome: " + this.getNome(); 

        msg += "\nLogin: " + this.getLogin(); 

    //    msg += "\nSenha: " + this.getSenha(); 

        msg += "\nIdade: " + this.getIdade(); 

        msg += "\nE-mail: " + this.getEmail(); 

         

        return msg; 

    } 

} 
