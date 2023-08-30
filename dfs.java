import java.util.*;

class dfs {
    private int V; 
    private LinkedList<Integer>[] adj; 

   
    dfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

   
    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

  
    void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

 
    void DFSTraversal() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; ++i) {
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        dfs g = new dfs(7);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);

        System.out.println("DFS traversal starting from vertex 0:");
        g.DFS(0);

        System.out.println("\nDFS traversal starting from all vertices:");
        g.DFSTraversal();
    }
}

