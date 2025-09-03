abstract class Funcionario {
    String nome;
    String cpf;
    double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract double calcularSalarioTotal(); // Método abstrato para cálculo do salário total
}

// Interface Bonificavel
interface Bonificavel {
    double calcularBonus(); // Método para calcular o bônus
}
