package th.ac.ku.bankaccount.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int customerId;
    private String type;
    private double balance;

    //  ให้ Generate..
    //       - Getters และ Setters ทั้งหมด
    //       - toString()

}
