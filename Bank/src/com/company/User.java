package com.company;//создаем класс юзер

public class User {
    private String name;
    private String surname;
    private int age;
    public int numberAcccount;

    public User(String name, String surname, int age) throws UserException {
        setName(name);
        setSurname(surname);
        setAge(age);
    }

    private void setName(String name) throws UserException {
        if (name != null && !name.isEmpty())
            this.name = name;
        else
            throw new UserException("invalid name");

    }

    public String getName() {
        return name;
    }

    private void setSurname(String surname) throws UserException {
        if (surname != null && !surname.isEmpty())
            this.surname = surname;
        else
            throw new UserException("invalid surname");

    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) throws UserException {
        if (age >= 100 || age <= 0)
            throw new UserException("invalid age");
        else this.age = age;
    }
}

class UserException extends Exception{
    public UserException(String message){
        super(message);
    }
}
