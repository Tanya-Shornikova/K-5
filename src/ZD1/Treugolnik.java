package ZD1;

import java.util.Scanner;

public class Treugolnik implements TsentrItem {

    @Override
    public void runCommand() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Введите 1 Kатет:");
        int a = scanner.nextInt();
        System.out.println("2) Введите 2 Kатет:");
        int b = scanner.nextInt();
        int S = (a*b)/2;
        System.out.println("Площадь прямоугольного треугольника = " + S);
    }
}
