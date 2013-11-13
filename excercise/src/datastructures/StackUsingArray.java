package datastructures;

import java.util.Arrays;

public class StackUsingArray<E> {
	private int size=0;
	private static final int DEFAULT_CAPACITY=10;
	private Object elements[];
	
	public StackUsingArray(){
		elements = new Object[DEFAULT_CAPACITY];
	}
	
	public void push(E e){
		if(size == elements.length){
			ensureCapacity();
		}
		elements[size++]=e;
	}
	public E pop(){
		E e = (E) elements[size--];
		elements[size] = null;
		return e;
	}
	public void ensureCapacity(){
		int newSize = elements.length*2;
		elements = Arrays.copyOf(elements, newSize);
	}
}
