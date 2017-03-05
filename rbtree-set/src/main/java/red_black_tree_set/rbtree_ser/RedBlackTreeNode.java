package red_black_tree_set.rbtree_ser;

class RedBlackTreeNode<T extends Comparable<T>> {    
    
	public static final int BLACK = 0;
    public static final int RED = 1;
	public T key;
    
	RedBlackTreeNode<T> parent;    
    RedBlackTreeNode<T> left;
    RedBlackTreeNode<T> right;
    
    public int color;

    RedBlackTreeNode(){
        color = BLACK;
        parent = null;
        left = null;
        right = null;
    }
	
	RedBlackTreeNode(T key){
        this();
        this.key = key;
	}
}