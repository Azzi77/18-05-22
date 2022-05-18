public class TestaFuncionario {
    public static void main(String[] args) {


       Gerente gerente = new Gerente();
       Supervisor supervisor = new Supervisor();
       Vendedor vendedor = new Vendedor();

       gerente.setNome("Regina");
       gerente.setIdade(44);
       gerente.setSalario(10000.0);

       supervisor.setNome("Ricardo");
       supervisor.setIdade(45);
       supervisor.setSalario(5000.0);

       vendedor.setNome("Roberto");
       vendedor.setIdade(40);
       vendedor.setSalario(3000.0);

       gerente.bonificacao();
       supervisor.bonificacao();
       vendedor.bonificacao();

        System.out.println("Gerente " + gerente );
        System.out.println("Supervisor " + supervisor);
        System.out.println("Vendedor " + vendedor);
        System.out.println("Gerente: Salario + Bonificacao = R$ " + gerente.bonificacao());
        System.out.println("Supervisor: Salario + Bonificacao = R$ " + supervisor.bonificacao());
        System.out.println("Vendedor: Salario + Bonificacao = R$ " + vendedor.bonificacao());
    }
}
