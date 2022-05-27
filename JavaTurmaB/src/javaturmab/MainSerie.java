//Dupla: Marllon Silva Araujo Coelho - Rm: 19019 e Nicolas Florencio Alves - Rm:
package javaturmab;

public class MainSerie {
    public static void main(String args[]){
        //nome da dupla
        System.out.println("Dupla:\nMarllon Silva Araujo Coelho \t Rm: 19019 \nNicolas Florencio Alves \t Rm: 19283\n\n");
        
        //SÉRIE 01
        Serie c1 = new Serie();
        c1.setNome("Brooklin nine-nine");
        c1.setDisponivel("Sim");
        c1.setdataLancamento("17 de setembro de 2013");
        c1.setClassificacao(14);
        c1.setGenero("Comédia televisiva, Policial processual, Sitcom");
        c1.setCriacao("Daniel J. Goor, Michael Schur");
        c1.setRelevancia(96);
        c1.setPlataforma("Netflix");
        c1.setQuantEp(130);
        c1.setduracaoMedEp(20);
        c1.setTemporada(6);
        c1.status();
        
        //SÉRIE 02
        Serie c2 = new Serie();
        c2.setNome("THE BOYS");
        c2.setDisponivel("Sim");
        c2.setdataLancamento("26 de Julho de 2019");
        c2.setClassificacao(18);
        c2.setGenero("Super-herói, Suspense, Humor negro, Drama, Ação");
        c2.setCriacao("Eric Kripke");
        c2.setRelevancia(95);
        c2.setPlataforma("Amazon Prime Video");
        c2.setQuantEp(8);
        c2.setduracaoMedEp(60);
        c2.setTemporada(2);
        c2.status();
        
        //SÉRIE 03
        Serie c3 = new Serie();
        c3.setNome("Breaking Bad");
        c3.setDisponivel("Sim");
        c3.setdataLancamento("20 de Janeiro de 2008");
        c3.setClassificacao(16);
        c3.setGenero("Ação, Suspense, Drama, Crime, Western Contemporaneo, Humor negro");
        c3.setCriacao("Vince Giligan");
        c3.setRelevancia(96);
        c3.setPlataforma("Netflix");
        c3.setQuantEp(62);
        c3.setduracaoMedEp(50);
        c3.setTemporada(8);
        c3.status();
        
        //SÉRIE 04
        Serie c4 = new Serie();
        c4.setNome("The Mandalorian");
        c4.setDisponivel("Sim");
        c4.setdataLancamento("12 de Novembro de 2019");
        c4.setClassificacao(18);
        c4.setGenero("Ação, Aventura, Ópera espacial");
        c4.setCriacao("Jon Favreu");
        c4.setRelevancia(97);
        c4.setPlataforma("Disney+");
        c4.setQuantEp(8);
        c4.setduracaoMedEp(35);
        c4.setTemporada(1);
        c4.status();
        
        //SÉRIE 05
        Serie c5 = new Serie();
        c5.setNome("Dark");
        c5.setDisponivel("Sim");
        c5.setdataLancamento("1 de Dezembro de 2017");
        c5.setClassificacao(16);
        c5.setGenero("Drama, Ficção científica, Suspense");
        c5.setCriacao("Baran bo Odar");
        c5.setRelevancia(96);
        c5.setPlataforma("Netflix");
        c5.setQuantEp(26);
        c5.setduracaoMedEp(60);
        c5.setTemporada(3);
        c5.status();
        
        //SÉRIE 06
        Serie c6 = new Serie();
        c6.setNome("Demolidor");
        c6.setDisponivel("Sim");
        c6.setdataLancamento("10 de Abril de 2015");
        c6.setClassificacao(18);
        c6.setGenero("Drama, Fantasia, Ação");
        c6.setCriacao("Kati Johson");
        c6.setRelevancia(94);
        c6.setPlataforma("Netflix");
        c6.setQuantEp(39);
        c6.setduracaoMedEp(50);
        c6.setTemporada(3);
        c6.status();
        
        //SÉRIE 07
        Serie c7 = new Serie();
        c7.setNome("F.R.I.E.N.D.S");
        c7.setDisponivel("Sim");
        c7.setdataLancamento("22 de Setembro de 1994");
        c7.setClassificacao(12);
        c7.setGenero("Comédia");
        c7.setCriacao("David Crane");
        c7.setRelevancia(94);
        c7.setPlataforma("Netflix");
        c7.setQuantEp(236);
        c7.setduracaoMedEp(20);
        c7.setTemporada(10);
        c7.status();
    }
}
