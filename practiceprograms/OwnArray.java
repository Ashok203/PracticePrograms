package com.technoelevate.practiceprograms;

import java.util.Iterator;

public class OwnArray implements Iterable {
	private Object[] ownArray;
	private int position;

	public OwnArray(int size) {
		this.ownArray = new Object[size];
	}

	public void addElements(Object obj) {
		if (this.position >= this.ownArray.length) {
			grow();
		}
		this.ownArray[position]=obj;
		position++;
		

	}

	private void grow() {
		Object[] temp = this.ownArray;
		this.ownArray = new Object[size() * 2];
		for (int i = 0; i < temp.length; i++) {
			this.ownArray[i] = temp[i];
		}

	}

	public int size() {
		return this.ownArray.length;

	}
	public Object getElements(int index) {
		return this.ownArray[index];
		
	}
	public void getAllElements() {
		for(Object item :ownArray) {
			System.out.println(item +" , ");
		}
		
	}

	@Override
	public Iterator iterator() {
		
		return new ownclass();
	} 
	private class ownclass implements Iterator{
		int cursor =0;

		@Override
		public boolean hasNext() {
			
			return cursor<position?true:false;
		}

		@Override
		public Object next() {
			
			return ownArray[cursor++];
		}

	}

}


