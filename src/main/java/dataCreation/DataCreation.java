package dataCreation;

import com.github.javafaker.Faker;

public class DataCreation {

    //generisanje nasumicnog imena
    public static String getFirstNameFaker(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    //generisanje nasumicnog prezimena
    public static String getLastNameFaker(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }
    //generisanje nasumicnog postal koda
    public static String getZipFaker(){
        Faker faker = new Faker();
        return faker.number().digits(5);
    }
}
