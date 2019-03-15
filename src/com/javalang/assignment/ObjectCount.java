package com.javalang.assignment;

public class ObjectCount {
	
	static int count=0;
	
	public ObjectCount(){
		count++;
	}
	
	public ObjectCount(double ...a){
		count++;
	}
	public ObjectCount(String ...str){
		count++;
	}
	public ObjectCount(char ...ch){
		count++;
	}
	public static void main(String[] args) {
		
		ObjectCount c = new ObjectCount();
		ObjectCount c1 = new ObjectCount(10);
		ObjectCount c2 = new ObjectCount(10.0f,20.0f);
		System.out.println("count of object is:"+count);
	}
}
