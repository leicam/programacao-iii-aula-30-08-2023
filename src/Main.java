import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Informe um número para calcular seu fatorial:");

        Integer num1 = Integer.parseInt(reader.readLine());

        Integer num2 = 1;

        for (Integer i = 1; i <= num1; i++) {
            num2 = i * num2;
        }
        System.out.println(num2);

        System.out.println(calcularFatorial(num1));
    }
    static Integer calcularFatorial(Integer valor){
        if(valor == 1 || valor == 0){
            return 1;
        }
        return valor * calcularFatorial(valor-1);
    }
}
