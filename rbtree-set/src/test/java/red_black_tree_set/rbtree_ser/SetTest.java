package red_black_tree_set.rbtree_ser;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class SetTest extends TestCase {
	
	Set<Integer> tree;
	Iterator<Integer> i;
	@Before
	public void setUp(){
		tree = new RedBlackTree<Integer>();
	}
	@Test
	
	public void testAdd(){
		tree.add(10);
		tree.add(5);
		tree.add(15);
		tree.add(18);
		tree.add(3);
		tree.add(19);
		tree.add(1);
		tree.add(4);
		tree.add(8);
		tree.add(11);
		assertEquals(tree.search(10).key,new Integer(10));
		assertEquals(tree.search(15).key,new Integer(15));
		assertEquals(tree.search(5).key,new Integer(5));
		assertEquals(tree.search(18).key,new Integer(18));
		assertEquals(tree.search(3).key,new Integer(3));
		assertEquals(tree.search(19).key,new Integer(19));
		assertEquals(tree.search(1).key,new Integer(1));
		assertEquals(tree.search(4).key,new Integer(4));
		assertEquals(tree.search(8).key,new Integer(8));
		assertEquals(tree.search(11).key,new Integer(11));
		
	}
	@Test
	public void testRemove(){
		tree.add(10);
		tree.add(5);
		tree.add(15);
		tree.add(18);
		tree.add(3);
		tree.add(19);
		tree.add(1);
		tree.add(4);
		tree.add(8);
		tree.add(11);
		assertEquals(tree.search(10).key,new Integer(10));
		assertEquals(tree.search(15).key,new Integer(15));
		assertEquals(tree.search(5).key,new Integer(5));
		assertEquals(tree.search(18).key,new Integer(18));
		assertEquals(tree.search(3).key,new Integer(3));
		assertEquals(tree.search(19).key,new Integer(19));
		assertEquals(tree.search(1).key,new Integer(1));
		assertEquals(tree.search(4).key,new Integer(4));
		assertEquals(tree.search(8).key,new Integer(8));
		assertEquals(tree.search(11).key,new Integer(11));
		tree.remove(tree.search(10));
		tree.remove(tree.search(15));
		tree.remove(tree.search(5));
		tree.remove(tree.search(18));
		tree.remove(tree.search(3));
		assertNull(tree.search(10));
		assertNull(tree.search(15));
		assertNull(tree.search(18));
		assertNull(tree.search(5));
		assertNull(tree.search(3));
		assertEquals(tree.search(19).key,new Integer(19));
		assertEquals(tree.search(1).key,new Integer(1));
		assertEquals(tree.search(4).key,new Integer(4));
		assertEquals(tree.search(8).key,new Integer(8));
		assertEquals(tree.search(11).key,new Integer(11));
	
	}
	@Test
	public void testhasNext(){
		i = tree.iterator();
		assertEquals(i.hasNext(),false);
		tree.add(10);
		i = tree.iterator();
		assertEquals(i.hasNext(),true);	
	}
	@Test
	public void testNext(){
		i = tree.iterator();
		assertNull(i.next());
		tree.add(10);
		tree.add(15);
		tree.add(3);
		i = tree.iterator();
		assertEquals(i.next(),new Integer(3));
		assertEquals(i.next(),new Integer(10));
		assertEquals(i.next(),new Integer(15));
	}

}
