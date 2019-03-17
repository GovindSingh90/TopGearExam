package com.assignment.oflambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {
	
	public static void main(String[] args) {
		
		List<String> strlist = Arrays.asList("abc", "", "bcd", "", "defg","govind");
		
		
		// count the  string whose length is greate than 5

		  long count1=strlist.stream().filter(x->x.length()>5).count();
		  System.out.printf("List %s has %d  strings has length more than 5 %n", strlist, count1);
		  
		// count the empty string
			long count=strlist.stream().filter(x->x.isEmpty()).count();
			  System.out.printf("List %s has %d empty strings %n", strlist, count);
		// storing empty string into arrayList.
			 List<String>  s=strlist.stream().filter(x->x.isEmpty()).collect(Collectors.toList());
						 System.out.println(s);
			}
	}


