import java.util.*;
public class LevelOrder{
    static class Node{
        
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
            
        }
        }
           static void levelOrderTraversal(Node root){
            Queue<Node> q=new LinkedList<>();
            if(root==null)
            return;
            q.add(root);
            q.add(null);
            
            
            while(!q.isEmpty()){
                Node curr=q.poll();
                if(curr==null){
                    if(!q.isEmpty()){
                        q.add(null);
                        System.out.println();
                        
                        }
                }
                else{
                
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                System.out.print(curr.data+" ");
                }
            }
            
            
            
        }
    
    public static void main(String[] args){
        Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(6);
    root.right.left = new Node(9);
    root.right.right.right = new Node(61);
    levelOrderTraversal(root);
        
    }
    
}