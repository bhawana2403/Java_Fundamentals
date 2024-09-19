import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int A = 6;
        List<List<Integer>> B = new ArrayList<>();

        // Adding rows to the 2D ArrayList
        B.add(Arrays.asList(0, 4, 9));
        B.add(Arrays.asList(3, 4, 6));
        B.add(Arrays.asList(1, 2, 1));
        B.add(Arrays.asList(2, 5, 1));
        B.add(Arrays.asList(2, 4, 5));
        B.add(Arrays.asList(0, 3, 7));
        B.add(Arrays.asList(0, 1, 1));
        B.add(Arrays.asList(4, 5, 7));
        B.add(Arrays.asList(0, 5, 1));

        int C = 4;

        Dijkstra dijkstra = new Dijkstra();

        ArrayList<Integer> ans = dijkstra.solve(A,B,C);
        for (int i: ans){
            System.out.print(i+" ");
        }
    }

}
