import java.util.Scanner;
    public class NumeroInteiro {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Digite um n�mero inteiro e veja o seu antecessor e seu sucessor");
int numero = input.nextInt();
input.close();
int numeroanterior = numero-1;
int numeroposterior = numero+1;
System.out.println("O n�mero digitado foi: " + numero +"O n�mero anterior �: " + numeroanterior + "O n�mero posterior �:" + numeroposterior);
}
}
