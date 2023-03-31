public class App {
    public static void main(String[] args) throws Exception {
        Integer[] numeri = {1,2,3,4,5,6,7,8,9,10};
        ArrayFunction<Integer> a = new ArrayFunction<>(numeri);
        System.out.println(a.numPrime());
    }
}
