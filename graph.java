import java.util.*;


public class graph {
    static class edge{
    int src;
    int dest;//creating a graph;

    public edge(int s,int d){
        this.src=s;
        this.dest=d;
    }//here we are using the method of array of arraylist in java to store the graph in the memory
    //for this we are creating a graph 


}


    public static void main(String args[]){
        Scanner gc = new Scanner(System.in);
        System.out.println("enter the size of your graph");
        int y = gc.nextInt();
        ArrayList<edge> graph[]= new ArrayList[y];
        for(int k=0;k<y;k++){
            graph[k]= new ArrayList<>();
        }
        for(int i=0;i<y;i++){
            int x = gc.nextInt();
            for(int j=0;j<x;j++){
                int a=gc.nextInt();
                graph[i].add(new edge(i,a));

            }

        }
        // System.out.println("enter the vetex with which you want to find the neighbours");
        // int c=gc.nextInt();

        // for(int z=0;z<graph[c].size();z++){
        //    edge e = graph[c].get(z);
        //    System.out.println(e.dest);
        // }
        System.out.println("enter the root node from where you want to traverse");
        int g= gc.nextInt();
        int visited[]= new int[y];
        Queue<Integer> queue = new LinkedList<>();
        int vi =0;
        
        for(int z=0;z<y;z++){
            visited[vi]=g;
            for(int h=0;h<graph[g].size();h++){
                edge e = graph[g].get(h);
                
               queue.add(e.dest);
                    
                // if(queue.contains(e.dest)){
                // continue;
                // }
                // else{
                //     queue.add(e.dest);
                // }
                
            }
            queue.remove(0);
            g=queue.peek();            
            System.out.println(queue);

            vi=vi+1;
   
        }
        System.out.println("the bfs:");
        for(int ass=0;ass<y;ass++){
            System.out.println(visited[ass]);
        }
        



        
     }
    
 }
