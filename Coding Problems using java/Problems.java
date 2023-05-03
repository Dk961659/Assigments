import java.util.*;

public class MinimumPlanes {

    static class Airport implements Comparable<Airport> {
        int id;
        int fuel;

        public Airport(int id, int fuel) {
            this.id = id;
            this.fuel = fuel;
        }

        public int compareTo(Airport other) {
            return this.fuel - other.fuel;
        }
    }
// using priority queue to arrange the array value and index and store in priorityqueue.

    public static int minimumPlanes(int[] fuel) {
        int n = fuel.length;
        PriorityQueue<Airport> heap = new PriorityQueue<>();
        heap.add(new Airport(1, fuel[0]));
        int planes = 0;

        while (!heap.isEmpty()) {
            Airport curr = heap.poll();

            if (curr.id == n) {
                return planes;
            }

            if (curr.fuel == 0) {
                continue;
            }

            planes++;

            for (int i = curr.id + 1; i <= n && i <= curr.id + curr.fuel; i++) {
                heap.add(new Airport(i, fuel[i-1]-1));
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] fuel = {2, 1, 2, 3, 1};
        int planes = minimumPlanes(fuel);
        System.out.println(planes); // output: 2

        int[] fuel2 = {1, 6, 3, 4, 5, 0, 0, 0, 6};
        planes = minimumPlanes(fuel2);
        System.out.println(planes); // output: 3
    }
}

// we can use priorityqueue to solve this problem because priorityqueue can arrage the arrage feul and indexing 
// for storing this we can make a class which have two fields first is id->index , fuel->for array value