import java.util.ArrayList;
import java.util.List;

public class ArrayFunction <T extends Integer>{
    private T[] arr;

    public ArrayFunction(T[] arr) {
        this.arr = arr;
    }

    public ArrayList<T> numPair() {
        ArrayList<T> numeriPari = new ArrayList<>();
        for (T numero : this.arr) {
            if(numero.intValue() % 2 == 0) {
                numeriPari.add(numero);
            }
        }
        return numeriPari;
    }

    public ArrayList<T> numOdd() {
        ArrayList<T> numeriDispari = new ArrayList<>();
        for (T numero : this.arr) {
            if(numero.intValue() % 2 != 0) {
                numeriDispari.add(numero);
            }
        }
        return numeriDispari;
    }

    public ArrayList<T> numPrime() {
        ArrayList<T> numeriPrimi = new ArrayList<>();
        for (T t : this.arr) {
            if(isPrime(t.intValue())) {
                numeriPrimi.add(t);
            }
        }
        return numeriPrimi;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
