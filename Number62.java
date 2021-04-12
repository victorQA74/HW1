public class Number62 {
    public static void main(String[] args) {
        //пункт а
        double A; //Цена товара А
        double kA; //коэффициент - процент скидки
        double nA=10; //кол-во товара А

        double B; //Цена товара B
        double nB=2; //кол-во товара B

        double SA; //Стоимость товара А
        double SB; //Стоимость товара И
        double S; //Итоговая цена

        if(A==200 & kA==0.15 & B==30){
            SA=(A-A*kA)*nA;
            SB=B*nB;
            S=SA+SB;
            System.out.println("Итоговая ценe: " + S + " руб.");
        }
        else{

            }
    }
}
