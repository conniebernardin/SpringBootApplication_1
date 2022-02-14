package com.connie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;
import java.util.Objects;

@SpringBootApplication //annotation initialises/starts up the web server
@RestController //allows you to attach annotations to methods to state them as GET, POST, PUT or DELETE requests
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args); //runs application by passing args(arguments)
	}

	//localhost is route path, will default to localhost unless specified otherwise
	@GetMapping //states that this method is a get request and creates path localhost:8080
	String greet(){
		return "Hello Connie";
	}

	@GetMapping(path = "ping") //creates path localhost:8080/ping
	String ping(){
		return "pong";
	}

	@GetMapping(params = "name") //path localhost:8080/?name=foo
	//param gives optional parameters; you can choose to include it or not.
	String greetName(@RequestParam ("name") String name){ //if request parameters are chosen, give variable name and store it in String name
		return "Hello " + name + " how are you today?";
	}


	@GetMapping(path = "people") //create path localhost:8080/people
	List<Person> getPerson(){ //list that returns person class
		return List.of(
				new Person("Alex", 24),
				new Person("Connie", 22));
	}

	//create person class
	static class Person {
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Person person = (Person) o;
			return age == person.age && Objects.equals(name, person.name);
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}

		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}
}
