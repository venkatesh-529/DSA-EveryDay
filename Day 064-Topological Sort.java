import java.util.*;

public class GraphCycleCheck {
    public static String isCyclic(int n, int[][] ed) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        Map<Integer, Integer> in = new HashMap<>();

        // Initialize adjacency list and indegree map
        for (int i = 1; i <= n; i++) {
            m.put(i, new ArrayList<>());
            in.put(i, 0);
        }

        // Build graph and update indegrees
        for (int[] a : ed) {
            m.get(a[0]).add(a[1]);
            in.put(a[1], in.get(a[1]) + 1);
        }

        // Queue for nodes with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int node : in.keySet()) {
            if (in.get(node) == 0) {
                q.add(node);
            }
        }

        int count = 0; // Number of nodes processed

        while (!q.isEmpty()) {
            int node = q.poll();
            count++;

            for (int nei : m.get(node)) {
                in.put(nei, in.get(nei) - 1);
                if (in.get(nei) == 0)
                    q.add(nei);
            }
        }

        // If all nodes processed → no cycle
        return (count == n) ? "Acyclic" : "Cyclic";
    }

  }
