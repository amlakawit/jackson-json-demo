package com.gmail.mamlakawit.jackson_json_demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Jackson JSON databinding demo
 *
 */
public class DemoDriverApp {
	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read JSON file and map it to java POJO
			//Student student = mapper.readValue(new File("data/simple.json"), Student.class);
			Student student = mapper.readValue(new File("data/nested.json"), Student.class);


			// print the object
			System.out.println("Student: " + student);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
