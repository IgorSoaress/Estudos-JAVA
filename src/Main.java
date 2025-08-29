import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Digite 5 números para adicionar na lista:");
        for (int i = 0; i < 5; i++) numbers.add(scanner.nextInt());

        System.out.println("Lista dos numeros digitados: " + numbers);
        System.out.println("O maior numero da lista é: " +
                numbers.stream().max(Integer::compareTo).orElse(0));
        System.out.println("A média dos numeros da lista é: " +
                numbers.stream().mapToInt(Integer::intValue).average().orElse(0));

    }
}