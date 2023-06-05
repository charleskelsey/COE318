/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author charl
 */
public class Resistor {
    private double resistance;
    private static int countRezID = 1;
    private int rezID;
    private Node node1;
    private Node node2;
    
    public Resistor(double resistance, Node node1, Node node2) {
        if (resistance < 0) {
            throw new IllegalArgumentException("resistance can't be negative");
        } else {
            this.resistance = resistance;
        }
        this.rezID = countRezID++;
        this.node1 = node1;
        this.node2 = node2;
    }
    
    public Node[] getNodes() {
        Node[] nodeArray = new Node[2];
        nodeArray[0] = node1;
        nodeArray[1] = node2;
        return nodeArray;
    }
    
    @Override
    public String toString() {
        return "R" + this.rezID + " " + this.node1 + " " + this.node2 + " " + this.resistance;
    }
    
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        Resistor r = new Resistor(30.0, node1, node2);
        Resistor s = new Resistor(50.0, node3, node4);
        System.out.println(r);
        System.out.println(s);
    }
}
