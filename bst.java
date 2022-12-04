public class bst {
    public static void main(String[] args) {
        searchSolution s = new searchSolution();

        s.insertionkey('A');
        s.insertionkey('B');
        s.insertionkey('E');
        s.insertionkey('C');
        s.insertionkey('G');
        s.insertionkey('A');
        s.insertionkey('H');
        s.insertionkey('I');
        s.insertionkey('D');
        s.insertionkey('F');

        System.out.println("IN ORDER Search");
        s.InOrderTraversal(s.root);
        System.out.println();
  

        System.out.println("PRE ORDER Search");
        s.PreOrderTraversal(s.root);
        System.out.println();


        System.out.println("POST ORDER Search");
        s.PostOrderTraversal(s.root);
    }

}

class searchSolution {
    node root;

    void insertionkey(char key) {
        root = insertionInTree(root, key);
    }

    node insertionInTree(node root, char key) {
        if (root == null) {
            root = new node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertionInTree(root.left, key);
        } else if (key > root.key) {
            root.right = insertionInTree(root.right, key);
        }
        return root;
    }

    void InOrderTraversal(node n) {
       
        if (n != null) {
            InOrderTraversal(n.left);
            System.out.print(n.key + " ");
            InOrderTraversal(n.right);
        }
    }

    void PreOrderTraversal(node n) {
        
        if (n != null) {
            System.out.print(n.key + " ");
            PreOrderTraversal(n.left);
            PreOrderTraversal(n.right);
        }
    }

    void PostOrderTraversal(node n) {
        
        if (n != null) {
            PostOrderTraversal(n.left);
            PostOrderTraversal(n.right);
            System.out.print(n.key + " ");
        }
    }
   
  
}

class node { 
    char key;
    node left, right;

    node(char KEY) {
        this.key = KEY;
    }
}