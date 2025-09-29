package aplicacao;

import modelo.*;

public class MainEscola {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Camila", 20, "F", 12345, "Engenharia");
        Professor p1 = new Professor("Carlos", 45, "M", "Matemática", 5000);
        Funcionario f1 = new Funcionario("Ana", 30, "F", "Biblioteca", true);

        a1.cancelarMatr();
        p1.receberAum(1000);
        f1.mudarTrabalho("Secretaria");

        System.out.println("Professor " + p1.getNome() + " agora ganha R$" + p1.getSalario());
        System.out.println("Funcionário " + f1.getNome() + " agora trabalha em " + f1.getSetor());
    }
}
