class Estagiario extends Funcionario implements Bonificavel {
    String universidade;
    int horasTrabalhadas;

    public Estagiario(String nome, String cpf, double salario, String universidade, int horasTrabalhadas) {
        super(nome, cpf, salario);
        this.universidade = universidade;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalarioTotal() {
        // Exemplo: salário base + 5% por hora trabalhada
        return salario + (horasTrabalhadas * 0.05 * salario);
    }

    @Override
    public double calcularBonus() {
        // Exemplo: 10% do salário
        return salario * 0.1;
    }

    public void registrarHoras(int horas) {
        this.horasTrabalhadas += horas;
        System.out.println("Horas registradas: " + horas + " horas. Total de horas: " + this.horasTrabalhadas);
    }
}
