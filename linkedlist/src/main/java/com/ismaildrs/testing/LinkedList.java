package com.ismaildrs.testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedList {

    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    int size;

    public LinkedList(){
        head = new Node(5);
        head.next = new Node(5);
        head.next.next = new Node(5);
        System.out.println(getAverageBelowThreshold(12));
        System.out.println(getAverageBelowThresholdRec(12));
        System.out.println(findDuplicateRecursively());
    }

    public double getAverageBelowThreshold(int threshold){

        int counter = 0, sum = 0;
        Node current;
        for(current = head; current != null; current= current.next){
            if(current.data < threshold){
                counter++;
                sum += current.data;
            }
        }

        return (double) sum/counter;
    }

    private double getAverageBelowThresholdRec(int threshold){
        return traverseListRec(head, threshold, 0, 0);
    }

    public double traverseListRec(Node node, int threshold, int counter, int sum){

        if (node == null){
            return counter == 0 ? 0 : (double) sum /counter;
        }

        return traverseListRec(node.next, threshold, node.data < threshold ? counter + 1 : counter, node.data < threshold ? sum + node.data : sum);
    }

    public List<Integer> findDuplicates(){
        Set<Integer> set = new HashSet<>();
        Node current;
        List<Integer> result = new ArrayList<>();
        for(current = head; current != null; current = current.next){
            if (set.contains(current.data) && !result.contains(current.data)) {
               result.add(current.data);
            } else {
                set.add(current.data);
            }
        }
        return result;
    }

    public List<Integer> findDuplicateRecursively(){
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        return findElementsRec(set, head, result);
    }

    private List<Integer> findElementsRec(Set<Integer> set, Node node, List<Integer> result){

        if(node == null){
            return result;
        }


        if(set.contains(node.data) && !result.contains(node.data)) {
            result.add(node.data);
        } else {
            set.add(node.data);
        }

        return findElementsRec(set, node.next, result);
    }



}
