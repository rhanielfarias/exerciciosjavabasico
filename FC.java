import java.util.Scanner;

    public class FC {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
System.out.println("Digite a temperatura em Fahrenheit para converter em  celsius");
double f = input.nextDouble();
input.close();
double converter= (f-32)/1.8;
System.out.println(converter + " Celsius");
}
}
