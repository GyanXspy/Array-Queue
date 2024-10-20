package assignment7.QArray;

import java.util.Scanner;

public class Queue {
    int data;
    int front = -1;
    int rear = -1;
    static int size;
    int Q[];
    Queue(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length :");
        int s = sc.nextInt();
        Q = new int[s];
        int size = 0;
    }
    boolean isEmpty(){
        if (size == 0 ) {
            return true;
        }
        else return false;
    }
    void insert(int item){
        if (size == Q.length) {
            System.out.println("Queue if overload");
            return;
        }
        if (front == -1) {
            front = rear = 0;
            Q[rear] = item;

        }
        else{
            Q[++rear] = item;

        }
        size++;
    }
    void delete(){
        int x = Q[front];
        System.out.println("Deleting element :"+x);
        front++;
        size --;
    }
    void Display(){
        if (isEmpty()) {
            System.out.println("Queue is empty ");
            return;
        }
        for (int i = 0; i < Q.length; i++) {
            System.out.print(Q[i]+" ");
        }
        System.out.println();
    }
}
