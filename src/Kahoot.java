import java.util.*;

public class Kahoot {
    public static void main(String[] args) {
        System.out.println(niceMethod(3));

        List<Integer> lista = new ArrayList<>();
        System.out.println(lista.size());
    }
    public static int niceMethod(int number){
        return number < 1 ? 0 : number + niceMethod(number-1);
    }

}
