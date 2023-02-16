package org.example.services;

import org.example.entity.Company;
import org.example.entity.Customer;
import org.example.entity.Person;

import java.util.ArrayList;
import java.util.List;

public final class SampleDataInit {
    public List<Person> createPerson(){
        Person person1 = new Person("24506231362","Burak","Kolay");
        Person person2 = new Person("24534231367","Ahmet","Mehmet");
        Person person3 = new Person("24523231325","Cafer","Kesici");
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        return personArrayList;
    }

    public List<Company>  createCompany(){
        Company company1 = new Company("1234567895","Huawei");
        Company company2 = new Company("9876543210","Nokia");
        Company company3 = new Company("0536925448","Sony");
        ArrayList<Company> companyArrayList= new ArrayList<>();
        companyArrayList.add(company1);
        companyArrayList.add(company2);
        companyArrayList.add(company3);
        return companyArrayList;
    }

    public List<>
}
