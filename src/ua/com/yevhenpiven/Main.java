package ua.com.yevhenpiven;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
	for(int i=2;i<=100;i++) {
		boolean isTrue=false;
		LinkedList <Integer> list=new LinkedList<>();
		for(int j=1;j<=i;j++) {
			
			if(i%j==0) {
				
			list.add(j);
			//isTrue=false;
			//break;
		}}
			if(list.size()==2)
			isTrue=true;
			
		if (isTrue)
			System.out.println(i);
	}	}}
	
	
	

