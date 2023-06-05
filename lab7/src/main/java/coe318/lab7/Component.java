/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author charl
 */
public class Component {
    private double resistance;
    private static int countRezID = 1;
    private String comp;
    private int rezID;
    private int node1;
    private int node2;
    
    public Component(String comp, int node1, int node2, double value) {
        if (resistance < 0) {
            throw new IllegalArgumentException("resistance can't be negative");
        } else {
            this.resistance = resistance;
        }
        this.comp = comp;
        this.rezID = countRezID++;
        this.node1 = node1;
        this.node2 = node2;
    }
    
    /*public Node[] getNodes() {
        Node[] nodeArray = new Node[2];
        nodeArray[0] = node1;
        nodeArray[1] = node2;
        return nodeArray;
    }*/
    
    @Override
    public String toString() {
        return this.comp + this.rezID + " " + this.node1 + " " + this.node2 + " " + this.resistance;
    }
}
