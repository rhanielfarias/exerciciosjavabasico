import java.util.Scanner;

    public class SalDescontos {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
System.out.println("Informe quanto vai ganhar por hora");
double hvalor = input.nextDouble();
System.out.println("Informe as horas totais trabalhadas no m�s");
double hmes = input.nextDouble();
input.close();
double saltotal = hvalor*hmes;
System.out.println("O seu sal�rio bruto �  de: " +saltotal);
double inss = saltotal*8/100;
System.out.println("� descontado para o INSS do seu sal�rio r$" +inss);
double sindicato = saltotal*5/100;
System.out.println("� descontado para o sindicato do seu sal�rio mensal r$" +sindicato);
double impostoderenda = saltotal*11/100;
System.out.println("O seu sal�rio l�quido com todos os descontos � de r$:");
System.out.print(saltotal-inss-sindicato-impostoderenda);
}
}
