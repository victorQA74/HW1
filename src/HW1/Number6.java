package HW1;

public class Number6 {

    public static void main(String[] args) {

        //пункт а
        double A = 200; //Цена товара А
        double kA = 0.15; //коэффициент - процент скидки
        double nA = 10; //кол-во товара А

        double B = 30; //Цена товара B
        double nB = 2; //кол-во товара B

        double SA; //Стоимость товара А
        double SB; //Стоимость товара И
        double S; //Итоговая цена
        SA = (A - A * kA) * nA;
        SB = B * nB;
        S = SA + SB;
        System.out.println("Итоговая цена №5: " + S + " руб.");

        //пункт б
        A=500;
        kA = 0.5;
        nA = 7;
        B=50;
        nB = 1;
        SA = (A - A * kA) * nA;
        SB = B * nB;
        S = SA + SB;
        System.out.println("Итоговая цена №6: " + S + " руб.");


    }
}
