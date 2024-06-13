import dataStructure.LinkedList;

public class TesteLinkedList {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList("elemento 1"); //criou a lista com o elemento 1
        list.append("elemento 2"); //adicionou o elemento 2
        list.append("elemento 3"); //adicionou o elemento 3
        list.append("elemento 4"); //adicionou o elemento 4
        list.prepend("elemento 0"); //adicionou o elemento 0 no começo da lista
        list.removeFirst(); //remove o primeiro elemento da lista
        list.removeLast(); // remove o último elemento da lista
        list.get(0); // consigo obter o index dos elementos
        list.insert(1, "elemento 1.5"); // a partir do index consigo adicionar um elemento qualquer
        list.set(0, "elemento 0.5"); // a partir do index consigo alterar o valor de um elemento da lista
        list.remove(2); // a partir do index consigo remover um elemento da lista
        list.print(); // imprime os valores da lista

        list.getHead(); // imprime o valor do primeiro elemento da lista
        list.getTail(); // imprime o valor do último elemento da lista
        list.getLength(); // imprime a contagem de elementos da lista

        System.out.println("---------------------------------");

        list.makeEmpty(); // torna a lista vazia
        list.print();
        list.getHead();
        list.getTail(); 
        list.getLength(); 

    }
}
