/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.najah.ai_tsp;

/**
 *
 * @author YousefHanbali & OmarSalous
 */
public class Node {
    private int x;
    private int y;
    private Node next;
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    Node(int x,int y){
        this.x = x;
        this.y = y;
        this.next = null;
    }
}
