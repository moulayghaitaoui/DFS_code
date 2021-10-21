/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritem;

import java.util.Stack;

/**
 *
 * @author Ghaitaoui
 */
public class DFS_Graph {
  int size; 
  adjLise[] array;
  public DFS_Graph(int size){
this.size=size; 
array=new adjLise[this.size]; 
for(int i=0;i<size;i++){
array[i]=new adjLise();
array[i].head=null;
}
  }  
  public void AddNode(int src, int dest){
  Node n=new Node(dest,null); 
  n.next= array[src].head;
  array[src].head=n;
  
  }
  
   public void DFSSearch(int starVertex,int Search){
   Boolean[] visited =new Boolean[size];
   Boolean IsFound=false;
   
  for(int i=0;i<size;i++)
      visited[i]=false;
  
  Stack<Integer> s=new Stack<Integer>();
   s.push(starVertex); 
  
   while( !s.isEmpty()){
       int n=s.pop(); 
       s.push(n);
        visited[n]=true;
           Node head=array[n].head;
              Boolean isDone=true;
         while(head !=null){
             if(Search==head.dest){
             System.out.println("node is founded");
             IsFound=true;
             break;
             } 
        if(visited[head.dest]==false){
       s.push(head.dest);
       visited[head.dest]=true;
       isDone=false;
       break;
       }else
       head=head.next;
   }
         if(IsFound==true){
             break;
         }
   if(isDone==true){
   int outN=s.pop();
       System.out.println("Visit node :"+ outN);
   }
   if(IsFound==false){
   System.out.println("node is not founded");
   }
      
  }
  
   }
  public void DFSExplore(int starVertex){
  Boolean[] visited =new Boolean[size];
  for(int i=0;i<size;i++)
      visited[i]=false;
  Stack<Integer> s=new Stack<Integer>();
   s.push(starVertex); 
  
   while( !s.isEmpty()){
       int n=s.pop();
       s.push(n);
        visited[n]=true;
           Node head=array[n].head;
              Boolean isDone=true;
         while(head !=null){
        if(visited[head.dest]==false){
       s.push(head.dest);
       visited[head.dest]=true;
       isDone=false;
       break;
       }else
       head=head.next;
   }  
   if(isDone==true){
   int outN=s.pop();
       System.out.println("Visit node :"+ outN);
   }
  }
  }
}
