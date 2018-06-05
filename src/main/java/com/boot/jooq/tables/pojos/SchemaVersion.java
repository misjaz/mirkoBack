/*
 * This file is generated by jOOQ.
*/
package com.boot.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class SchemaVersion implements Serializable {

    private static final long serialVersionUID = 2004129154;

    private Integer   installedRank;
    private String    version;
    private String    description;
    private String    type;
    private String    script;
    private Integer   checksum;
    private String    installedBy;
    private Timestamp installedOn;
    private Integer   executionTime;
    private Byte      success;

    public SchemaVersion() {}

    public SchemaVersion(SchemaVersion value) {
        this.installedRank = value.installedRank;
        this.version = value.version;
        this.description = value.description;
        this.type = value.type;
        this.script = value.script;
        this.checksum = value.checksum;
        this.installedBy = value.installedBy;
        this.installedOn = value.installedOn;
        this.executionTime = value.executionTime;
        this.success = value.success;
    }

    public SchemaVersion(
        Integer   installedRank,
        String    version,
        String    description,
        String    type,
        String    script,
        Integer   checksum,
        String    installedBy,
        Timestamp installedOn,
        Integer   executionTime,
        Byte      success
    ) {
        this.installedRank = installedRank;
        this.version = version;
        this.description = description;
        this.type = type;
        this.script = script;
        this.checksum = checksum;
        this.installedBy = installedBy;
        this.installedOn = installedOn;
        this.executionTime = executionTime;
        this.success = success;
    }

    @NotNull
    public Integer getInstalledRank() {
        return this.installedRank;
    }

    public void setInstalledRank(Integer installedRank) {
        this.installedRank = installedRank;
    }

    @Size(max = 50)
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @NotNull
    @Size(max = 200)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull
    @Size(max = 20)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @NotNull
    @Size(max = 1000)
    public String getScript() {
        return this.script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Integer getChecksum() {
        return this.checksum;
    }

    public void setChecksum(Integer checksum) {
        this.checksum = checksum;
    }

    @NotNull
    @Size(max = 100)
    public String getInstalledBy() {
        return this.installedBy;
    }

    public void setInstalledBy(String installedBy) {
        this.installedBy = installedBy;
    }

    public Timestamp getInstalledOn() {
        return this.installedOn;
    }

    public void setInstalledOn(Timestamp installedOn) {
        this.installedOn = installedOn;
    }

    @NotNull
    public Integer getExecutionTime() {
        return this.executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    @NotNull
    public Byte getSuccess() {
        return this.success;
    }

    public void setSuccess(Byte success) {
        this.success = success;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SchemaVersion (");

        sb.append(installedRank);
        sb.append(", ").append(version);
        sb.append(", ").append(description);
        sb.append(", ").append(type);
        sb.append(", ").append(script);
        sb.append(", ").append(checksum);
        sb.append(", ").append(installedBy);
        sb.append(", ").append(installedOn);
        sb.append(", ").append(executionTime);
        sb.append(", ").append(success);

        sb.append(")");
        return sb.toString();
    }
}
