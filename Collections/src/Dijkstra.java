import java.util.*;

public class Dijkstra {
        private class Edge{
            int weight;
            int des;
            public Edge(int des,int weight){
                this.des = des;
                this.weight = weight;
            }
            public int getWeight(){
                return this.weight;
            }
        }
        private Map<Integer,List<Edge>> createAdjList(List<List<Integer>> B){
            Map<Integer, List<Edge>> map = new HashMap<>();
            for(List l : B){
                int source = (int)l.get(0);
                int des = (int)l.get(1);
                int weight = (int)l.get(2);
                map.putIfAbsent(source,new ArrayList<>());
                map.putIfAbsent(des,new ArrayList<>());
                    map.get(source).add(new Edge(des,weight));
                    map.get(des).add(new Edge(source,weight));
            }
            return map;
        }
        public ArrayList<Integer> solve(int A, List<List<Integer>> B, int C) {
            ArrayList<Integer> distance = new ArrayList<>();
            Set<Integer> vis = new HashSet<>();
            for(int i=0;i<A;i++){
                distance.add(Integer.MAX_VALUE);
            }
            PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparing(Edge :: getWeight));
            pq.add(new Edge(C,0));

            Map<Integer,List<Edge>> graph = createAdjList(B);
            while(!pq.isEmpty()){
                Edge e = pq.poll();
                int w = e.weight;
                int val = e.des;
                if(distance.get(val) > w)
                    distance.set(val, w);
                vis.add(val);
                if(graph.get(e.des) != null) {
                    for (Edge c : graph.get(e.des)) {
                        if (!vis.contains(c.des)) {
                            System.out.println(w + c.weight);
                            pq.add(new Edge(c.des, w + c.weight));
                        }
                    }
                }
            }
            for(int i=0;i<distance.size();i++){
                if(distance.get(i) == Integer.MAX_VALUE)
                    distance.set(i,-1);
            }
            return distance;
        }

}
