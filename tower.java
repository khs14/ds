import java.util.Scanner;

class tower{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int t1d = obj.nextInt();
        int t2d = obj.nextInt();
        int t3d = obj.nextInt();
        obj.close();
        toh(n, t1d, t2d, t3d);

    }
    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0){
            return;
        }
        toh(n-1, t1id, t3id, t2id);
        System.out.println(n + " " + t1id + " -> " + t2id );
        toh(n-1, t3id, t2id, t1id);
    }
}
