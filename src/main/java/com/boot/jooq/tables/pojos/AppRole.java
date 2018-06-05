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
public class AppRole implements Serializable {

    private static final long serialVersionUID = 289632433;

    private UInteger id;
    private String   name;
    private String   description;

    public AppRole() {}

    public AppRole(AppRole value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
    }

    public AppRole(
        UInteger id,
        String   name,
        String   description
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @NotNull
    public UInteger getId() {
        return this.id;
    }

    public void setId(UInteger id) {
        this.id = id;
    }

    @NotNull
    @Size(max = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Size(max = 250)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppRole (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
