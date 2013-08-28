package datastructures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import datastructures.stackUsingArrayList;

public class stackUsingArrayListTest  {

	@Before
	public void setup() throws Exception{
		
	}
	@Test
	public void test(){
		stackUsingArrayList<Integer> myStack = new stackUsingArrayList<Integer>();
		myStack.push(1);
		myStack.push(2);
		Assert.assertEquals("Error Message",(Object) myStack.pop(),1);
		//Assert.assertEquals
		//assertTrue(2==myStack.pop());
	}
	
}
