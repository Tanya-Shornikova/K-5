package ZD1;

import javax.swing.event.TreeModelListener;
import java.util.Scanner;

public class Tsentr {
    public static void main(String[] args) {
        System.out.println("Bыберите геометрическую фигуру");
        System.out.println("1.Круг");
        System.out.println("2.Квадрат");
        System.out.println("3.Прямоугольный треугольник");

        Scanner scanner = new Scanner(System.in);
        int command = scanner.nextInt();

        TsentrItem tsentrItem;

        if (command == 1) {
            tsentrItem = new Krug();
            tsentrItem.runCommand();
        }
        if (command == 2) {
            tsentrItem = new Kvadrat();
            tsentrItem.runCommand();
        }
        if (command == 3) {
            tsentrItem = new Treugolnik();
            tsentrItem.runCommand();
        }
    }
}
