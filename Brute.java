import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Collections;

/**
 * Created by cmayer on 8/3/2015.
 */
public class Brute {
    public static void main(String[] args) {


        int times = 0;
        // rescale coordinates and turn on animation mode
        StdDraw.setXscale(0, 32768);
        StdDraw.setYscale(0, 32768);
        StdDraw.show(0);
        StdDraw.setPenRadius(0.01);  // make the points a bit larger

        // read in the input and create an array to hold the ordered pairs.
        String filename = "D:\\Libraries\\Desktop\\input6.txt";
        In in = new In(filename);
        int N = in.readInt();
        Point[] arrayPoint = new Point[N];

        ArrayList<Point> arr = new ArrayList<>();
        ArrayList<Point> holder = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int x = in.readInt();
            int y = in.readInt();
            Point temp = new Point(x, y);
            StdDraw.point(x, y);
            arrayPoint[i] = temp;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                times++;
                if (!arr.contains(arrayPoint[j]) && arrayPoint[i].slopeTo(arrayPoint[j]) == Double.POSITIVE_INFINITY) {
                    arr.add(arrayPoint[j]);
                }
                if (!holder.contains(arrayPoint[j]) && arrayPoint[i].slopeTo(arrayPoint[j]) == -1) {
                    holder.add(arrayPoint[j]);
                }

            }

        }

        Collections.sort(holder);
        Collections.sort(arr);
        Point[] test = arr.toArray(new Point[arr.size()]);
        Point[] test1 = holder.toArray(new Point[holder.size()]);

        // display to screen all at once
        test[0].drawTo(test[4]);
       // test1[0].drawTo(test1[3]);

        StdDraw.show(0);

        for (Point t : holder) {
            System.out.print(t.toString() + " -> ");
        }
        System.out.println();

        for (Point point : arr) {
            System.out.print(point.toString() + " -> ");
        }
        System.out.println(times);



        // reset the pen radius
        StdDraw.setPenRadius();
    }
}

