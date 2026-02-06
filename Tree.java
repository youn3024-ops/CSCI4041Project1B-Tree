package CSCI4041Project1B-Tree;

//Written by YOUN3024

public class Tree {
    private Node root;

    public Tree(){
        this.root = null;
    }

    public boolean insertNode(Node newNode){
        if(this.root == null){
            this.root = newNode;
            return true;
        }
        return insertNodeRec(newNode, this.root);
    }
    public boolean insertNodeRec(Node newNode, Node current){
        if (newNode.getVal().compareTo(current.getVal()) < 0){
            if (current.getLeft() == null){
                return current.setLeft(newNode);
            }
            return insertNodeRec(newNode, current.getLeft());
        }else{
            if (current.getRight() == null){
                return current.setRight(newNode);
            }
            return insertNodeRec(newNode, current.getRight());
        }
    }

    public String toString(){
        return toStringRec(this.root);
    }
    public String toStringRec(Node current){
        String returnString = "";
        if (current == null){
            return returnString;
        }
        returnString += toStringRec(current.getLeft());
        returnString += current.toString() + ", ";
        returnString += toStringRec(current.getRight());
        return returnString;
    }
}