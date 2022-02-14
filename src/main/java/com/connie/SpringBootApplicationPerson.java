package com.connie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
@RestController   // add @RestController to you expose methods as REST services to clients
public class SpringBootApplicationPerson {
    static List<Person> getPeople = new ArrayList<>(); //creating list called getPeople.
                                                        // Calling outside main method, so it can be accessed universally across code

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationPerson.class, args);
        Person connie = new Person("Connie", 22, 1); //creating people as instances of the Person class
        Person alimaa = new Person("Alimaa", 22, 2);
        Person suraya = new Person("Suraya", 24, 3);
        Person robyn =  new Person("Robyn", 23, 4);
        Person suad =   new Person("Suad", 23, 5);
        Person sarina = new Person("Sarina", 22, 6);

        getPeople.add(connie); //adding people to list
        getPeople.add(alimaa);
        getPeople.add(robyn);
        getPeople.add(suraya);
        getPeople.add(suad);
        getPeople.add(sarina);
    }

    @GetMapping("people/{id}") //providing the path http://localhost:8080/people/{id} using annotation
            public Person getPersonById(@PathVariable("id") Integer id) {
        for (Person p: getPeople){ //loop through person class within
            if(id == p.getId()){
                return p;
            }
        }
        System.out.println("No id found.");
        return null;
    }

    static class Person { //person class

        private String name;
        private int age;
        private int id;

        public Person(String name, int age, int id){
            this.name=name;
            this.age=age;
            this.id=id;
        }

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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id=" + id +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && id == person.id && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, id);
        }

    }

    // create a static List of type person with few people inside
    // create a class called Person with following properties: id, name, age
    // implement getPersonById
    /*
        @GetMapping("people/{id}")
        public Person getPersonById(@PathVariable("id") Integer id) {
            // filter list and return person that matches id otherwise return null
        }
     */
    // create another method that returns all people using @GetMapping("people")
    // test your api using chrome

}