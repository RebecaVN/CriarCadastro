package Atividade1;

public class CriarCadastro {
	public static void main(String[] args) {
		Cadastro sportCar1 = new Cadastro();
		Cadastro sportCar2 = new Cadastro(); 
		Cadastro sportCar3 = new Cadastro(); 
		
		sportCar1.nome = "Sport Car";
		sportCar1.estado = "São Paulo";
		sportCar1.numeroDoFuncionario = "15";
		sportCar1.faturamentoMensal = "R$: 650,000";
		
		sportCar2.nome = "Sport Car";
		sportCar2.estado = "Rio de Janeiro";
		sportCar2.numeroDoFuncionario = "20";
		sportCar2.faturamentoMensal = "R$: 420,000";
		
		sportCar3.nome = "Sport Car";
		sportCar3.estado = "Bahia";
		sportCar3.numeroDoFuncionario = "10";
		sportCar3.faturamentoMensal = "R$: 180,000";
		
		
		System.out.println("Nome: " + sportCar1.nome);
		System.out.println("Estado: " + sportCar1.estado);
		System.out.println("Número de Funcionários: " + sportCar1.numeroDoFuncionario);
		System.out.println("Faturamento mensal: " + sportCar1.faturamentoMensal);
		
		System.out.println("---------------");
		System.out.println("Nome: " + sportCar2.nome);
		System.out.println("Estado: " + sportCar2.estado);
		System.out.println("Número de Funcionários: " + sportCar2.numeroDoFuncionario);
		System.out.println("Faturamento mensal: " + sportCar2.faturamentoMensal);
		
		System.out.println("---------------");
		System.out.println("Nome: " + sportCar3.nome);
		System.out.println("Estado: " + sportCar3.estado);
		System.out.println("Número de Funcionários: " + sportCar3.numeroDoFuncionario);
		System.out.println("Faturamento mensal: " + sportCar3.faturamentoMensal);
	}

}
