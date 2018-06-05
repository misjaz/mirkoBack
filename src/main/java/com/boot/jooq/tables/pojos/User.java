/*
 * This file is generated by jOOQ.
*/
package com.boot.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 2054365843;

    private Integer  id;
    private String   name;
    private String   email;
    private UInteger companyId;
    private String   state;
    private String   city;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.name = value.name;
        this.email = value.email;
        this.companyId = value.companyId;
        this.state = value.state;
        this.city = value.city;
    }

    public User(
        Integer  id,
        String   name,
        String   email,
        UInteger companyId,
        String   state,
        String   city
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.companyId = companyId;
        this.state = state;
        this.city = city;
    }

    @NotNull
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Size(max = 255)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Size(max = 2000)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UInteger getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(UInteger companyId) {
        this.companyId = companyId;
    }

    @Size(max = 50)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Size(max = 50)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(email);
        sb.append(", ").append(companyId);
        sb.append(", ").append(state);
        sb.append(", ").append(city);

        sb.append(")");
        return sb.toString();
    }
}
