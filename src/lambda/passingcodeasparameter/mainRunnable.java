package lambda.passingcodeasparameter;

/**
 * Created by MEHMET on 22.7.2017.
 */
public class mainRunnable {

    public static void main(String[] args){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i++ < 10) {
                    System.out.println("It works!!");
                }
            }
        };
        // Make with lambda
        Runnable rLambda = () -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works!!");
            }
        };
    }
}
