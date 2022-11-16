package ZD1;

import java.util.Scanner;

public class Kvadrat implements TsentrItem{

    @Override
    public void runCommand() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одну длину стороны Kвадрата: ");
        int a = scanner.nextInt();
        int S = a*a;
        System.out.println("Площадь квадрата = " + S);
    }
}
