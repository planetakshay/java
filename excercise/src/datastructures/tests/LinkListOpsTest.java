package datastructures.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

import datastructures.LinkListOps;

public class LinkListOpsTest {

	
	@Test
	public void testAddToHead(){
		ArrayList<Integer> exLink = new ArrayList<Integer>();
		exLink.add(3);
		exLink.add(2);
		exLink.add(1);
		
		LinkListOps l = new LinkListOps();
		l.addLinkToHead(1);
		l.addLinkToHead(2);
		l.addLinkToHead(3);
		assertTrue("testAddToHead Failed exLink="+exLink.toString() + "and actual linklist ="+l.getLinkListData().toString(), exLink.toString().equalsIgnoreCase(l.getLinkListData().toString()));
		System.out.println("testAddToHead passed" +l.getLinkListData().toString());
		System.out.println("----");
	}
	@Test
	public void testAddToTail(){
		ArrayList<Integer> exLink = new ArrayList<Integer>();
		exLink.add(1);
		exLink.add(2);
		exLink.add(3);
		
		LinkListOps l = new LinkListOps();
		l.addLinkToTail(1);
		l.addLinkToTail(2);
		l.addLinkToTail(3);
		assertTrue("testAddToTail Failed exLink="+exLink.toString() + "and actual linklist ="+l.getLinkListData().toString(), exLink.toString().equalsIgnoreCase(l.getLinkListData().toString()));
		System.out.println("testAddToTail passed" +l.getLinkListData().toString());
		System.out.println("----");
	}
	
	@Test
	public void testAddToHeadTailHead(){
		ArrayList<Integer> exLink = new ArrayList<Integer>();
		exLink.add(3);
		exLink.add(1);
		exLink.add(2);
		
		LinkListOps l = new LinkListOps();
		l.addLinkToHead(1);
		l.addLinkToTail(2);
		l.addLinkToHead(3);
		assertTrue("testAddToHeadTailHead Failed exLink="+exLink.toString() + "and actual linklist ="+l.getLinkListData().toString(), exLink.toString().equalsIgnoreCase(l.getLinkListData().toString()));
		System.out.println("testAddToHeadTailHead passed" +l.getLinkListData().toString());
		System.out.println("----");
	}

	@Test
	public void testRandomAdd(){
		ArrayList<Integer> exLink = new ArrayList<Integer>();
		exLink.add(15);
		exLink.add(5);
		exLink.add(3);
		exLink.add(1);
		exLink.add(2);
		exLink.add(20);
		
		LinkListOps l = new LinkListOps();
		l.addLinkToHead(1);
		l.addLinkToTail(2);
		l.addLinkToHead(3);
		l.addLinkToHead(5);
		l.addLinkToHead(15);
		l.addLinkToTail(20);
		assertTrue("testRandomAdd Failed exLink="+exLink.toString() + "and actual linklist ="+l.getLinkListData().toString(), exLink.toString().equalsIgnoreCase(l.getLinkListData().toString()));
		System.out.println("testRandomAdd passed" +l.getLinkListData().toString());
		System.out.println("----");
	}

	
}
