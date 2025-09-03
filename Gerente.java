class Gerente extends Funcionario implements Bonificavel {
    int quantidadeDeSubordinados;

    public Gerente(String nome, String cpf, double salario, int quantidadeDeSubordinados) {
        super(nome, cpf, salario);
        this.quantidadeDeSubordinados = quantidadeDeSubordinados;
    }

    @Override
    public double calcularSalarioTotal() {
        // Exemplo: salário base + 10% de bônus por subordinado
        return salario + (quantidadeDeSubordinados * 0.1 * salario);
    }

    @Override
    public double calcularBonus() {
        // Exemplo: 20% do salário
        return salario * 0.2;
    }

    public void atribuirTarefa(String tarefa) {
        System.out.println("Atribuindo a tarefa: " + tarefa);
    }
}
