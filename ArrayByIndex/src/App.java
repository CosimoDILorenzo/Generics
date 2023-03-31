import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] arr = {6,10,3,4,122,13,23,21};
        String[] arrString = {"ciao","mela","pera","banana","caffe"};
        Algoritmo al = new Algoritmo<>(arrString,3,5);
        
        System.out.println(al.index());
    }
}
