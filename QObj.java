package assignment7.QArray;

public class QObj {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(5);
        q.insert(1);
        q.insert(3);
        q.insert(4);
        q.insert(9);
        q.insert(2);
        q.Display();
        q.delete();

    }
}
