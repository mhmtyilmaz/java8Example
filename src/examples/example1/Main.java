package examples.example1;

/**
 * Created by MEHMET on 23.7.2017.
 */
public class Main {

    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;

        boolean b = p1.test("Hello World");
        System.out.println("Hello is shorter than 20 chars : " + b);


        // Chaining
        Predicate<String> p3 = p1.and(p2);
        System.out.println("P3 for Yes : " +p3.test("Hello World"));
        System.out.println("P3 for Good morning : " +p3.test("Good Morning"));
        System.out.println("P3 for Good morning gentlemen : " +p3.test("Good Morning gentlemen"));


        Predicate<String> p4 = p1.or(p2);
        System.out.println("P4 for Yes : " +p4.test("Yes"));
        System.out.println("P4 for Good morning : " +p4.test("Good Morning"));
        System.out.println("P4 for Good morning gentlemen : " +p4.test("Good Morning gentlemen"));


        Predicate<String> p5 = Predicate.isEqualsTo("Yes");
        System.out.println("P5 for Yes: " +p5.test("Yes"));
        System.out.println("P5 for No: " +p5.test("No"));


        Predicate<Integer> p6 = Predicate.isEqualsTo(1);
        System.out.println("P6 for 1: " +p6.test(1));
        System.out.println("P6 for -1: " +p6.test(-1));

    }
}
