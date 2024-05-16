public class App {
    public static void main(String[] args) throws Exception {
        try {
            int[] arr ={1,2,3};
            System.out.println(arr[3]);

            String str = null;
            System.out.println(str.length());

            int result = 10/0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");

        }
    }
}
