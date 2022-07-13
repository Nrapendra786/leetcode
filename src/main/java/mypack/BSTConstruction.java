package mypack;

public class BSTConstruction {
    static class BST {
            public int value;
            public BST left;
            public BST right;

            public BST(int value) {
                this.value = value;
            }

            public BST insert(int value) {
                // Write your code here.
                // Do not edit the return statement of this method.
                if(value < this.value){
                    if(left == null){
                        BST newBST = new BST(value);
                        left = newBST;
                    } else {
                        left.insert(value);
                    }
                } else {
                    if(right == null){
                        BST newBST = new BST(value);
                        right = newBST;
                    } else {
                        right.insert(value);
                    }
                }
                return this;
            }

            public boolean contains(int value) {
                // Write your code here.
                if(value < this.value){
                    if(left == null){
                        return false;
                    } else {
                        return left.contains(value);
                    }
                } else if(value > this.value){
                    if(right == null){
                        return false;
                    } else {
                       return right.contains(value);
                    }
                }
                return false;
            }

            public BST remove(int value) {
                // Write your code here.
                // Do not edit the return statement of this method.
                if(value < this.value){
                    if(left == null){
                        BST newBST = new BST(value);
                        left = newBST;
                    } else {
                       return left.remove(value);
                    }
                } else {
                    if(right == null){
                        BST newBST = new BST(value);
                        right = newBST;
                    } else {
                        right.remove(value);
                    }
                }
                return this;
            }
        }
    }
