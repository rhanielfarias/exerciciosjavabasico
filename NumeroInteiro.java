import java.util.Scanner;
    public class NumeroInteiro {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Digite um número inteiro e veja o seu antecessor e seu sucessor");
int numero = input.nextInt();
input.close();
int numeroanterior = numero-1;
int numeroposterior = numero+1;
System.out.println("O número digitado foi: " + numero +"O número anterior é: " + numeroanterior + "O número posterior é:" + numeroposterior);
}
}
