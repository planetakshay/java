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
		System.out.println(l.getLinkListData().toString());
		System.out.println("----");
		
	}
}
