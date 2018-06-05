/*
 * This file is generated by jOOQ.
*/
package com.boot.jooq.tables;


import com.boot.jooq.Keys;
import com.boot.jooq.Wiza;
import com.boot.jooq.tables.records.AppRoleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
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
public class AppRole extends TableImpl<AppRoleRecord> {

    private static final long serialVersionUID = 1873897540;

    /**
     * The reference instance of <code>wiza.app_role</code>
     */
    public static final AppRole APP_ROLE = new AppRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppRoleRecord> getRecordType() {
        return AppRoleRecord.class;
    }

    /**
     * The column <code>wiza.app_role.id</code>.
     */
    public final TableField<AppRoleRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>wiza.app_role.name</code>.
     */
    public final TableField<AppRoleRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>wiza.app_role.description</code>.
     */
    public final TableField<AppRoleRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(250).nullable(false), this, "");

    /**
     * Create a <code>wiza.app_role</code> table reference
     */
    public AppRole() {
        this("app_role", null);
    }

    /**
     * Create an aliased <code>wiza.app_role</code> table reference
     */
    public AppRole(String alias) {
        this(alias, APP_ROLE);
    }

    private AppRole(String alias, Table<AppRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppRole(String alias, Table<AppRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Wiza.WIZA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AppRoleRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_APP_ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AppRoleRecord> getPrimaryKey() {
        return Keys.KEY_APP_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AppRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<AppRoleRecord>>asList(Keys.KEY_APP_ROLE_PRIMARY, Keys.KEY_APP_ROLE_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AppRole as(String alias) {
        return new AppRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppRole rename(String name) {
        return new AppRole(name, null);
    }
}
