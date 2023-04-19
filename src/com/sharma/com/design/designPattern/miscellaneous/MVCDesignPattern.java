package com.sharma.com.design.designPattern.miscellaneous;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*  Separation of Concern
    MVC stands for Model View Controller.
    MVC Design Pattern is used to separate the logic of different layers in a program in independent units.

    Model : Transfer data from 1 layer to different layer
    View  : Data presented in the application.
    Controller : It accepts request from the users, Modify the data and sent it to view.


            |- - - - - - - - - -> Controller    <=======>   Model
            |                       |
            | Request               | Request
            |                       |
          Application  <=========  View
                        Response

  */
public class MVCDesignPattern {
    public static void main(String[] args) {
        PersonController personController = new PersonController();

        // Requesting for save operation
        Person p = new Person(2,"Rajesh",31);
        personController.savePerson(p);

        // Requesting to get all the person Details
        List<Person> listPerson = personController.getPersonDetails();
        listPerson.stream().forEach(
                person -> System.out.print("Person Details "+p)
        );
    }
}

class Person{
    private int id;
    private String name;
    private int age = 0;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    Person(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
// Perform Person CRUD operation Using Outbound Generics
interface PersonCRUDRepository<T>{
    public void save(T t);
}
// Using Outbound Generics
interface PersonService<T> extends PersonCRUDRepository<T>{
    public List<T> getAllPerson();
}


// Implementing Person Service
class PersonImplementation implements PersonService<Person>{

    @Override
    public void save(Person person) {
        System.out.println("Perform Save operation for person Object "+ person);
    }

    @Override
    public List<Person> getAllPerson() {
        Person p = new Person(1,"Sharma",30);
        List<Person> listPerson = Stream.of(p).collect(Collectors.toList());
       // List<Person> l = new ArrayList<>();
       // l.add(p);
        return listPerson;
    }
}


// Controller Class : Accept request from App/UI , Modify the data and sent to view

class PersonController {

    PersonService personService = new PersonImplementation();

    public void savePerson(Person person){
        personService.save(person);
    }

    public List<Person> getPersonDetails(){
        return personService.getAllPerson();
    }

}