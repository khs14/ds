class linear_linked_list{
    Node head;
    Node tail;
    int size;
    linear_linked_list(){
        this.size = 0;;
    }

    void insert_first(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
        if(tail==null){
            tail = head;
        }
    }

    void insert_last(int val){
        if(tail == null){
            insert_first(val);
            return;
        }
        Node node  = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    void insert(int val , int index){
        if(index==0){
            insert_first(val);
            return;
        }
        if(index==size){
            insert_last(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
        
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("end");
    }

    int delete_first(){
        int val = head.val;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;


    }

    int delete_last(){
        if(size<=1){
            return delete_first();
        }
        int val = tail.val;
        Node second_last = get_node(size-2);
        tail = second_last;
        second_last.next = null;
        size--;
        return val;
        
    }
    int delete(int index){
        if(index ==0){
            delete_first();
        }
        if(index == size){
            delete_last();
        }
        

    }

    Node get_node(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this. next = next;
        }
    }
}



public class l_l_list {
    public static void main(String[] args) {
        linear_linked_list arr = new linear_linked_list();
        arr.insert(1, 0);
        arr.insert(2,1);
        arr.insert_last(3);
        arr.display();
        arr.delete_first();
        arr.display();

    }
    
}
