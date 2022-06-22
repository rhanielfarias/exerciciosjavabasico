import java.util.Scanner;

    public class HoraSalario {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
System.out.println("Informe quanto vai ganhar por hora");
double hvalor = input.nextDouble();
System.out.println("Informe as horas totais trabalhadas no mês");
double hmes = input.nextDouble();
input.close();
double saltotal = hvalor*hmes;
System.out.println("O seu salário mensal será de:" +saltotal);
}
}
