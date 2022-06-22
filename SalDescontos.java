import java.util.Scanner;

    public class SalDescontos {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
System.out.println("Informe quanto vai ganhar por hora");
double hvalor = input.nextDouble();
System.out.println("Informe as horas totais trabalhadas no mês");
double hmes = input.nextDouble();
input.close();
double saltotal = hvalor*hmes;
System.out.println("O seu salário bruto é  de: " +saltotal);
double inss = saltotal*8/100;
System.out.println("É descontado para o INSS do seu salário r$" +inss);
double sindicato = saltotal*5/100;
System.out.println("É descontado para o sindicato do seu salário mensal r$" +sindicato);
double impostoderenda = saltotal*11/100;
System.out.println("O seu salário líquido com todos os descontos é de r$:");
System.out.print(saltotal-inss-sindicato-impostoderenda);
}
}
