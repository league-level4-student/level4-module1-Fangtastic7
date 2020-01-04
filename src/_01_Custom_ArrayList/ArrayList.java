package _01_Custom_ArrayList;

import _00_Intro_To_Templates.*;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] list;
	
	
	public ArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return list[loc];
	}
	
	public void add(T val) {
		T[] list2 = (T[]) new Object[list.length+1];
		for(int i = 0; i < list.length; i++) {
			list2[i] = list[i];
		}
		list2[list2.length-1] = val;
		list = list2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] list2 = (T[]) new Object[list.length+1];
		 
		for(int i =0; i < loc ; i++) {
			list2[i] = list[i];
		}
		list2[loc] = val;
		for(int i =loc+1; i < list2.length; i++) {
			list2[i] = list[i-1];
		}
		list = list2;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] list2 = (T[]) new Object[list.length-1];
		
		for(int i =0; i< loc; i++) {
			list2[i] = list[i];
		}
		for(int i = loc ; i < list2.length; i++) {
			list2[i] = list[i+1];
		}
		list = list2;
	}
	
	
	public boolean contains(T val) {
		
		if(list == val) {
			return  true;
		}
		else {
			return false;
		}
		
		
			
		
		
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}