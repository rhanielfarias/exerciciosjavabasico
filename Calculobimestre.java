import java.util.Scanner;

    public class CalculoBimestre{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Digite o primeiro peso:");
double primeiranota=input.nextDouble();
System.out.println("Digite o segundo peso:");
double segundanota=input.nextDouble();
System.out.println("Digite o terceiro peso:");
double terceiranota=input.nextDouble();
System.out.println("Digite o quarto peso:");
double quartanota=input.nextDouble();
input.close();
double media=primeiranota+segundanota+terceiranota+quartanota/4;
System.out.println("A média das notsas do bimestre foi: " +media);
}
}
