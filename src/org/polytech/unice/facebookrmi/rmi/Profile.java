package org.polytech.unice.facebookrmi.rmi;

import java.io.Serializable;

/**
 * Created by Mortadha on 31/05/14.
 */
public class Profile implements Serializable {

    private String name;
    private String lastname;
    private Status status;


    public Profile(String name,String lastname,Status status){
        this.name = name;
        this.lastname = lastname;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

enum Status{
    Single,
    InARelationship,
    Complicated;
}
