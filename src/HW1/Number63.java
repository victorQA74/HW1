package HW1;

public class Number63 {

    //объявляем переменные, которые будут использованы в методе main
    private static double A; //Цена товара А
    private static double kA; //коэффициент - процент скидки
    private static double nA; //кол-во товара А
    private static double B; //Цена товара B
    private static double nB; //кол-во товара B
    private static double SA; //Стоимость товара А
    private static double SB; //Стоимость товара И
    private static double S; //Итоговая цена

    public static void main(String[] args) {

        //пункт а

        A=200;
        kA = 0.15;
        nA = 10;
        B=30;
        nB = 2;

        SA = (A - A * kA) * nA;
        SB = B * nB;
        S = SA + SB;
        System.out.println("Итоговая цена пункт а: " + S + " руб.");

        //пункт б
        A=500;
        kA = 0.5;
        nA = 7;
        B=50;
        nB = 1;
        SA = (A - A * kA) * nA;
        SB = B * nB;
        S = SA + SB;
        System.out.println("Итоговая цена пункт б: " + S + " руб.");

        //пункт в
        A=300;
        kA = 0.1;
        nA = 2;
        B=20;
        nB = 3;
        SA = (A - A * kA) * nA;
        SB = B * nB;
        S = SA + SB;
        System.out.println("Итоговая цена пункт в: " + S + " руб.");


    }

}
