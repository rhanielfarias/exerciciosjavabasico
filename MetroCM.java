import java.util.Scanner;

    public class     MetroCM {
    public static void main(String[] args) {
double cm=100;
    Scanner input = new Scanner(System.in);
System.out.println("Informe o metro a converter, por favor");
double metro = input.nextDouble();
input.close();
System.out.println("A convers�o de metros para cent�metros deu:"
+metro*cm);
}
}
