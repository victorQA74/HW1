package HW1;

public class Number5 {

    public static void main(String[] args) {
        double A = 1000;
        double B = 500;
        double Summa; //стоимость товаров без скидки
        double Discount; //сумма скидки
        double k = 0.1; //коэффициент - процент скидки
        double SummaDiscount; //стоимость товаров co скидкой
        Summa = A + B;
        Discount = k * Summa;
        SummaDiscount = Summa - Discount;
        if (Summa >= 1500) {
            System.out.println("Сумма скидки: " + Discount + " руб.");
            System.out.println("Cтоимость товаров co скидкой: " + SummaDiscount + " руб.");
        }
    }

}
