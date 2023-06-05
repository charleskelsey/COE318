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
public class Node {
    private static int countID = 0;
    private static int countNXT = 1;
    private int id;
    private int nxt;
    
    public Node() {
        this.id = countID++;
        this.nxt = countNXT++;
    }
    
    @Override
    public String toString() {
        return "" + this.id;
    }
}
