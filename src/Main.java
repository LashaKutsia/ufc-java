public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new  Rectangle(12,50);
        Rectangle rectangle1 = new  Rectangle(13);
        Rectangle rectangle2 = new  Rectangle(2,3);

//        System.out.println(rectangle.getLength());
//        System.out.println(rectangle.getWidth());
//
//        System.out.println(rectangle1.getLength());
//        System.out.println(rectangle1.getWidth());
//
//        System.out.println(rectangle2.getLength());
//        System.out.println(rectangle2.getWidth());



        Rectangle[] arr = {rectangle,rectangle1,rectangle2};

        System.out.println(Rectangle.maxArea(arr));
        System.out.println(rectangle); //ეს იმისთვის რომ maxArea-ს გამოძახებისას მოაქვს უდიდესი ფართობის მქონე ობიექტის მისამარრთი და რომ დამეზუსტებია რომ იდენტური იყო მეთოდით გამოთვლილი და ჩემით(კალკულატორით) გამოთვლილი ობიექტების მისამართები

    }
}
