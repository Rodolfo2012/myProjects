package funcionarios;

public class AuxiliarDeServiçosGerais extends Funcionario implements CalculadoraDeComissao{

    private Double salario;


    public AuxiliarDeServiçosGerais(String nome, String cpf, Integer matricula, Integer dataDeNascimento) {
        super(nome, cpf, matricula, dataDeNascimento);
    }
    @Override
    public void Calculo() {

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
