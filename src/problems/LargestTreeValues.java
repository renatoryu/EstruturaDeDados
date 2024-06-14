package problems;

import java.util.List;

import dataStructure.Tree;

import java.util.ArrayList;

public class LargestTreeValues { //Maior valor em cada nível da Árvore Binária
        public static List<Integer> largestValues(Tree tree) {
            var list = new ArrayList<Integer>();
            solveTree(tree.root, 0, list);
            return list;
        }

        private static void solveTree(Tree.Node node, final int level, final ArrayList<Integer> list){

            if(node == null) return;

            if(level == list.size()){
                list.add(node.value);
            } else {
                list.set(level, Math.max(list.get(level), node.value));
            }

            solveTree(node.left, level+1, list);
            solveTree(node.right, level+1, list);

        }
}
