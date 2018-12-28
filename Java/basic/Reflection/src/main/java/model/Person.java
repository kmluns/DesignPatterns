package model;

import reflaction.SetterReflectionFunction;

/**
 * created by kmluns
 **/
public class Person implements SetterReflectionFunction {

    // These fields can not be reachable for reflection on App Class
    private String name;
    private String surname;
    private boolean gender;
    private int age;
    private Person mother;
    private Person father;

    // These fields can not be reachable for reflection on App Class
    // Because App Class and Person class is not in the same package! (Encapsulation)
    protected String dummyProtectedFieldForReflection;


    // These fields can be reachable for reflection on App Class
    public String dummyPublicFieldForReflection;



    public Person(){
        age = 50;
    }

    public Person(boolean gender){
        this();
        this.gender = gender;
    }

    public Person(Person mother, Person father, boolean gender){
        this();
        this.mother = mother;
        this.father = father;
        this.gender = gender;
        this.surname = father.getSurname();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isMale() {
        return gender;
    }

    public boolean isFemale() {
        return !gender;
    }

    public int getAge() {
        return age;
    }

    public void ageUp() {
        this.age++;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }
}
