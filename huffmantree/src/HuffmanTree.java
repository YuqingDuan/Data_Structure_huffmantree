import java.util.*;

/**
 * This program demonstrates an implementation of Huffman tree by Java.
 *
 * @param <T> the type of the data stored in a node
 * @author Yuqing Duan
 * @version 1.0
 */
public class HuffmanTree<T> {
    /**
     * Creates a Huffman tree.
     *
     * @param nodes all the nodes in a Huffman tree
     * @param <T>   the type of the data stored in a node
     * @return the root of a Huffman tree
     */
    public static <T> Node<T> createTree(List<Node<T>> nodes) {
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            Node<T> left = nodes.get(nodes.size() - 1);
            Node<T> right = nodes.get(nodes.size() - 2);
            Node<T> parent = new Node<>(null, left.getWeight() + right.getWeight());
            parent.setLeft(left);
            parent.setRight(right);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    /**
     * Prints nodes.
     *
     * @param root the root of a Huffman tree
     * @param <T>  the type of the data stored in a node
     * @return a list stored all the nodes
     */
    public static <T> List<Node<T>> breath(Node<T> root) {
        List<Node<T>> list = new ArrayList<>();
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<T> pNode = queue.poll();
            list.add(pNode);
            if (pNode.getLeft() != null) {
                queue.add(pNode.getLeft());
            }
            if (pNode.getRight() != null) {
                queue.add(pNode.getRight());
            }
        }
        return list;
    }
}