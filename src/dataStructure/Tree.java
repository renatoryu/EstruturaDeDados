
package dataStructure;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public Node root;

    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }

        public boolean isLeaf(){
            return (this.left == null) && (this.right == null);
        }
    }

    public void insert(int value){
        if (root == null) root = new Node(value);
        else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(queue.size() > 0){
                Node currentNode = queue.remove();
                if (currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }
                if (currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node) { // ou  Busca em Profundidade
    //Raíz, esquerda, direita
    if(node == null) return;
    System.out.println(node.value);
    preOrder(node.left);
    preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
    //Esquerda, raíz, direita
    if(node == null) return;
    inOrder(node.left);
    System.out.println(node.value);
    inOrder(node.right);
    }

    public void posOrder(){
        posOrder(root);
    }

    private void posOrder(Node node){
    //esquerda, direita, raíz
    if(node == null) return;
    posOrder(node.left);
    posOrder(node.right);
    System.out.println(node.value);
    }

    public void BFS(){ //Busca em Largura
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node node = queue.remove();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);

            System.out.println(node.value);
        }
    }

}
