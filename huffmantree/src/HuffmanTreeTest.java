import java.util.ArrayList;
import java.util.List;

public class HuffmanTreeTest {
    public static void main(String[] args) {
        List<Node<String>> nodes = new ArrayList<>();

        nodes.add(new Node<String>("b", 5));
        nodes.add(new Node<String>("a", 7));
        nodes.add(new Node<String>("d", 2));
        nodes.add(new Node<String>("c", 4));

        Node<String> root = HuffmanTree.createTree(nodes);
        System.out.println("weight: " + root.getWeight());

        System.out.println(HuffmanTree.breath(root));
    }

}
