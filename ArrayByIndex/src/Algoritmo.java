import java.util.ArrayList;

public class Algoritmo <T>{
    T[] arr;
    int min;
    int max;

    public Algoritmo(T[] arr, int min, int max) {
        this.arr = arr;
        this.min = min;
        setMax(max);
    }

    public ArrayList<T> index() {
        ArrayList<T> idxArray = new ArrayList<>();
        for (int i = this.min; i < this.max; i++) {
            idxArray.add(this.arr[i]);
        }
        return idxArray;
    }

    public void setMax(int massimo) {
        if(massimo > this.arr.length) {
            this.max = this.arr.length;
        } else {
            this.max = massimo;
        }
    }
}
