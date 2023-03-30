public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello world!"+(1/0));
        } catch (ArithmeticException a){
            a.getMessage();
        }

        System.out.println("chay tiep ");
    }
}