package com.company.coding2.recursion.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;

public class start {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        public void size(){
            System.out.println(size);
        }
        public void addLast(int n){
            if (size==0){
                Node temp = new Node();
                temp.data=n;
                temp.next=null;
                tail=head=temp;
            }else {
                Node temp = new Node();
                temp.data=n;
                temp.next=null;
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public void removeFirst(){
            if (size==0){
                System.out.println("underflow");
            }else if (size==1){
                head=tail=null;
                size=0;
            }else {
                head=head.next;
                size--;
            }
        }
        public Node getFirst(){
            return head;
        }
        public Node getLast(){
            return tail;
        }
        public int getAt(int idx){
            if (idx>=size){
                System.out.println("out of index");
                return -1;
            }else{
                Node temp=head;
                for (int i=0;i<idx;i++){
                    temp=temp.next;
                }
                return temp.data;
            }
        }
        public void addFirst(int n){
            Node temp=new Node();
            if (size==0){
                temp.data=n;
                temp.next=null;
                head=tail=temp;
            }else {
                temp.data=n;
                temp.next=null;
                temp.next=head;
                head=temp;
            }
            size++;
        }
        public void dataReverse(){
            ArrayList<Integer> lt = new ArrayList<>();
            Node temp=head;
            while(temp!=null){
                lt.add(temp.data);
                temp=temp.next;
            }
            System.out.println(lt);
            temp=head;
            for (int i=lt.size()-1;i>=0;i--){
                temp.data= lt.get(i);
                temp=temp.next;
            }
        }
        public void addAt(int idx,int n){
            if (idx<0||size<=idx){
                System.out.println("out of index");
            }else{
                Node temp=new Node();
                temp.data=n;
                temp.next=null;
                if (idx==0){
                    addFirst(n);
                }else if(idx==size-1){
                    addLast(n);
                }else{
                    Node nnxt = head;
                    for (int i=0;i<idx-1;i++){
                        nnxt=nnxt.next;
                    }
                    temp.next=nnxt.next;
                    nnxt.next=temp;
                }
                size++;
            }
        }
        public void reverse(){
            Node curr=head;
            Node prev = null;
            while(curr!=null){
                Node temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            Node nh = tail;
            Node nt = head;
            head=nh;
            tail=nt;
        }
        public void removeAll(){
            head=tail=null;
            size=0;
        }
        //stack adapter
        public void top(){
            System.out.println(head.data);
        }
        public void push(int n){
            Node temp = new Node();
            temp.data=n;
            if (size==0){
                temp.next=null;
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }size++;
        }
        public void pop(){
            if (size==0){
                System.out.println("underflow");
            }else if(size==1){
                size--;
                head=tail=null;
            }else{
                size--;
                head=head.next;
            }
        }

        //queue adapter
        public void addqueue(int n){
            Node temp = new Node();
            temp.data=n;
            temp.next=null;
            if (size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;

        }
        public void rmv(){
            if (size==0){
                System.out.println("underflow");
            }else if (size==1){
                size=0;
                head=tail=null;
            }else{
                size--;
                head=head.next;
            }
        }
        public void peek(){
            System.out.println(head.data);
        }


        public void klastnode(int idx){
            HashMap<Integer,Integer> hm=new HashMap<>();
            Node temp=head;
            int i=0;
            while(temp!=null){
                hm.put(i,temp.data);
                i++;
                temp=temp.next;
            }
            temp=head;
            System.out.println(hm.get(hm.size()-1-idx));
        }
    }
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.addLast(1);
        lst.addLast(2);
        lst.addLast(3);
        lst.addLast(4);
        lst.display();
        lst.removeFirst();
        lst.display();
        System.out.println(lst.getAt(2));
        lst.addFirst(1);
        lst.display();
        lst.addAt(1,0);
        lst.display();
        lst.size();
        lst.dataReverse();
        lst.display();
        lst.reverse();
        lst.display();
        lst.removeAll();
        lst.push(4);
        lst.push(3);
        lst.push(2);
        lst.push(1);
        lst.pop();
        lst.display();
        lst.removeAll();
        lst.addqueue(1);
        lst.addqueue(2);
        lst.addqueue(3);
        lst.addqueue(4);

        System.out.println();
        lst.display();
        lst.rmv();
        lst.display();
        lst.klastnode(0);
    }
}
