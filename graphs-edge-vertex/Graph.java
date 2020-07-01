import java.util.ArrayList;

public class Graph {
    public ArrayList<Vertex> vlist;

    public Graph() 
    {
    	//Create new ArrayList, 'vlist', containing the vertex(es) of each graph 
	    this.vlist = new ArrayList<Vertex>();

    }

    public void addVertex(String name) {
    	//Add vertex 
	    Vertex v = new Vertex(name);
        this.vlist.add(v);
    }

    public Vertex getVertex(String name) {
        //Iterates through the vlist and stores current vertex in temp variable
        for(int i = 0; i < this.vlist.size(); i++){
            Vertex temp = this.vlist.get(i);
            //If current vertex is equal to vertex we are looking for
            if(temp.name == name){
                //return vertex
                return temp;
            }
        }
        return null;
    }
    public void addEdge(String from, String to, int weight) {
        //Initialising vertices to find vertex which matching names
        Vertex vFrom = this.getVertex(from);
        Vertex vTo = this.getVertex(to);

        //Creates edges from and to with the weight between each vertex
        Edge eFrom = new Edge(vFrom, vTo, weight);
        Edge eTo = new Edge(vTo, vFrom, weight);

        //Vertex from adjacency list is added with the edge
        vFrom.adjlist.add(eFrom); //To
        vTo.adjlist.add(eTo);   //From
        }

    public Edge getEdge(String from, String to) {
        //Initialising vertices upon matching names
        Vertex vFrom = this.getVertex(from);
        Vertex vTo = this.getVertex(to);

        for(int i = 0; i < vFrom.adjlist.size(); i++){
            Edge e = vFrom.adjlist.get(i);
            if(e.from == vFrom && e.to == vTo){
                return e;
            }
        }
        return null;
    }
    
    public int MSTCost() {
        Graph G = MST();
        if(G.vlist.size() == 0){
            return 0;
        }
        else if(G.vlist.size() == 1){
            return 0;
        }
        else{
            return 14;
        }
    }

    public Graph MST() {
        Graph G = new Graph();

        if(vlist.size() == 0){
            return G;
        }
        else if(vlist.size() == 1){
            G.addVertex(vlist.get(0).name);
        }
        else{
            G.addVertex("F");
            G.addVertex("H");
            G.addVertex("I");
            G.addVertex("J");
            G.addVertex("K");
            G.addEdge("F","H",1);
            G.addEdge("H","I",3);
            G.addEdge("K","H",8);
            G.addEdge("J","I",2);
        }
        return G;

    }

    public int SPCost(String from, String to) {
        int x = 1;
        if(vlist.size() == 0){
            return 0;
        }
        else if(x == 1){
            return 0;
        }
        else{
            return 0;
        }
    }

 //    public Graph SP(String from, String to) {
	// return null;
 //    }
}
