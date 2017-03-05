package red_black_tree_set.rbtree_ser;

import java.util.Iterator;

public interface Set<T extends Comparable<T>> {
	public void add(T Key);
	public void remove(RedBlackTreeNode<T> v);
	public Iterator<T> iterator();
	public RedBlackTreeNode<T> search(T key);
}
