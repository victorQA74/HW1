package HW1;

public class Number1_4 {

    public static void main(String[] args) {
        //#1
        String admin;
        String name;
        name="Ivan";
        admin=name;
        System.out.println(admin);

        //#2
        double grade=10;
        grade=grade+5;
        System.out.println("Grade пользователя " + name + " равен " + grade);

        String admin2;
        admin2="Petr";
        double grade2=grade/2;
        System.out.println("Grade пользователя " + admin2 + " равен " + grade2);

        //#3
        double x=5;
        double y=7;
        double z;
        z=x/y;
        System.out.println(z);

        //#4
        int zz=2147483647;
        //System.out.println(zz+2*(-zz)-1);
        System.out.println(zz+1);



    }

}
