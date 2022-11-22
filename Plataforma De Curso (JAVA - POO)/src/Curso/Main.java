package Curso;
public class Main {
    public static void main(String[] args) {
       /*Visitante v1 = new Visitante();
       v1.setNome("Beto");
        System.out.println(v1.toString());*/
       Aluno a1 = new Aluno();
       a1.setNome("Claudinho e buxexa");
       a1.setMatricula(111111111);
       a1.setCurso("JAVA");
       Bolsista b1 = new Bolsista();
       b1.setMatricula(1121);
       b1.setBolsa(12.5f);
       b1.pagarMensalidade();
    }
    
}
