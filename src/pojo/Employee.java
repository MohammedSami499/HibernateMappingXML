/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Mohammmed Sami
 */
public class Employee {
    
    private int id;
    private String name;
    private Address ad;
    private Address workAd;

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

    public Address getAd() {
        return ad;
    }

    public void setAd(Address ad) {
        this.ad = ad;
    }

    public Address getWorkAd() {
        return workAd;
    }

    public void setWorkAd(Address workAd) {
        this.workAd = workAd;
    }
    
    
    
    
}
