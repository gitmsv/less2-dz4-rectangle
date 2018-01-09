/*
 * This application displays a rectangle
 * The height and width of the rectangle are entered from the keyboard
 */
package ua.jvlab.smlnk;

import java.util.Scanner;

/**
 * @author: $.m.lnk
 * @version: 1.0.0
 * @date: 09.01.2018
 */
public class RectangleRuns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (
                // Создание сканера для ввода высоты и ширины прямоугольника
                Scanner sc = new Scanner(System.in)) {
            int height;
            int width;
            System.out.println("Введите высоту прямоугольника:");
            height = sc.nextInt();
            System.out.println("Введите ширину прямоугольника:");
            width = sc.nextInt();

            // вывод первой стороны (1-я строка) прямоугольника
            for (int j = 0; j < width; j += 1) {
                System.out.print("*");
            }
            System.out.println();

            // вывод тела (строк) прямоугольника по условию
            for (int i = 1; i < height - 1; i += 1) {
                for (int n = 0; n < width; n += 1) {
                    if ((n == 0) || (n == width - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            // вывод нижней стороны (последняя строка) прямоугольника
            for (int j = 0; j < width; j += 1) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }

}
