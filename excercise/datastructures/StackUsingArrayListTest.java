package datastructures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import datastructures.StackUsingArrayList;

public class StackUsingArrayListTest  {

	@Before
	public void setup() throws Exception{
		
	}
	@Test
	public void test(){
		StackUsingArrayList<Integer> myStack = new StackUsingArrayList<Integer>();
		myStack.push(1);
		myStack.push(2);
		Assert.assertEquals("Error Message",(Object) myStack.pop(),1);
		//Assert.assertEquals
		//assertTrue(2==myStack.pop());
	}
	
}
