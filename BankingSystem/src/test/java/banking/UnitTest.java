package banking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class UnitTest {
    Bank bank;
    Long ameliaPond;
    Long roseTyler;
    Long acmeCorp;
    Long hackerRank;
    Person person1ameliaPond;
    Person person2roseTyler;
    Company company2hackerRank;
    Company company1acmeCorp;

    @Before
    public void setUp1() throws Exception {
        bank = new Bank();
        person1ameliaPond = new Person("Amelia", "Pond", 1);
        person2roseTyler = new Person("Rose", "Tyler", 2);
        company1acmeCorp = new Company("Acme Corp", 1);
        company2hackerRank = new Company("HackerRank", 2);
        ameliaPond = bank.openConsumerAccount(person1ameliaPond, 1111, 50.0);
        roseTyler = bank.openConsumerAccount(person2roseTyler, 2222, 456.78);
        acmeCorp = bank.openCommercialAccount(company1acmeCorp, 1111, 0.0);
        hackerRank = bank.openCommercialAccount(company2hackerRank, 2222, 9876543.21);
    }

    @After
    public void tearDown1() throws Exception {
        bank = null;
        ameliaPond = null;
        roseTyler = null;
        acmeCorp = null;
        hackerRank = null;
    }

    @Test
    public void validatePersonDetails() {
        assertEquals( "IdNumber for Amelia should be 1", 1, person1ameliaPond.getIdNumber());
        assertEquals( "First name should be Amelia ", "Amelia", person1ameliaPond.getFirstName());
        assertEquals( "Last name should be Pond", "Pond", person1ameliaPond.getLastName());
    }

    @Test
    public void validateAccountHolderDetails() {
        assertEquals("", person1ameliaPond, bank.getAccountHolder(ameliaPond));
    }

    @Test
    public void validateCompanyDetails(){
        assertEquals("", "Acme Corp", company1acmeCorp.getCompanyName());

    }

}
