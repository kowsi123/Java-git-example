package com.cognizant;

import com.cognizant.model.Model;
import com.cognizant.model.Person;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello");
		Person person=new Person();
		Model model =new Model();
		System.out.println("hello "+person.getName()+" welcome");
		System.out.println(model.getMessage());
		
	}
}
