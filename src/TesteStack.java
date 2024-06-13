import dataStructure.Stack;

public class TesteStack {
    public static void main(String[] args) {
        Stack myStack = new Stack(50);
        myStack.print();
        myStack.getTop(); //imprime o topo da pilha
        myStack.getHeight(); //tamanho/altura da pilha
        myStack.push(3); //adicionar valor a pilha //3 50
        myStack.push(20); //20 3 50
        myStack.push(7); //7 20 3 50

        myStack.pop(); //20 3 50
        myStack.print(); 
        myStack.getTop();
        myStack.getHeight();
    }
}
