import java.util.Scanner;

    public class HoraSalario {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
System.out.println("Informe quanto vai ganhar por hora");
double hvalor = input.nextDouble();
System.out.println("Informe as horas totais trabalhadas no m�s");
double hmes = input.nextDouble();
input.close();
double saltotal = hvalor*hmes;
System.out.println("O seu sal�rio mensal ser� de:" +saltotal);
}
}
