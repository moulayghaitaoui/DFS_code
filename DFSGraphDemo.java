/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritem;

/**
 *
 * @author Ghaitaoui
 */
public class DFSGraphDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DFS_Graph g=new DFS_Graph(4);
       g.AddNode(0, 1);
       g.AddNode(0, 2);
       g.AddNode(1, 0);
       g.AddNode(1, 3);
       g.AddNode(1, 3);
       g.AddNode(2,0);
       g.AddNode(3, 1);
       g.AddNode(3, 2);
       g.DFSExplore( 0);
       g.DFSSearch(0, 3);
        
    }
    
}
