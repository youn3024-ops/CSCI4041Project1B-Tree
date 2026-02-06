package CSCI4041Project1B-Tree;

//Written by YOUN3024

public class Node {
    private String name;
    private Node leftChild;
    private Node rightChild;

    public Node(String name, Node leftChild, Node rightChild){
        this.name = name;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getVal(){
        return this.name;
    }

    public Node getLeft(){
        return this.leftChild;
    }
    public boolean setLeft(Node newNode){
        if(this.leftChild == null){
            this.leftChild = newNode;
            return true;
        }
        Node grandLeft = this.leftChild.getLeft();
        Node grandRight = this.rightChild.getRight();
        this.leftChild = newNode;
        this.leftChild.setLeft(grandLeft);
        this.leftChild.setRight(grandRight);
        return true;
    }

    public Node getRight(){
        return this.rightChild;
    }
    public boolean setRight(Node newNode){
        if(this.rightChild == null){
            this.rightChild = newNode;
            return true;
        }
        Node grandLeft = this.rightChild.getLeft();
        Node grandRight = this.rightChild.getRight();
        this.rightChild = newNode;
        this.rightChild.setLeft(grandLeft);
        this.rightChild.setRight(grandRight);
        return true;
    }

    public String toString(){
        return this.name;
    }
}