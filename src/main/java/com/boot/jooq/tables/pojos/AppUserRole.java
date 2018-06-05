/*
 * This file is generated by jOOQ.
*/
package com.boot.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

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
public class AppUserRole implements Serializable {

    private static final long serialVersionUID = -1235413094;

    private UInteger userId;
    private UInteger roleId;

    public AppUserRole() {}

    public AppUserRole(AppUserRole value) {
        this.userId = value.userId;
        this.roleId = value.roleId;
    }

    public AppUserRole(
        UInteger userId,
        UInteger roleId
    ) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @NotNull
    public UInteger getUserId() {
        return this.userId;
    }

    public void setUserId(UInteger userId) {
        this.userId = userId;
    }

    @NotNull
    public UInteger getRoleId() {
        return this.roleId;
    }

    public void setRoleId(UInteger roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AppUserRole (");

        sb.append(userId);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}
