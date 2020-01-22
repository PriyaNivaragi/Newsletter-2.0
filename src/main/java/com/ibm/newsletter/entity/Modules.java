package com.ibm.newsletter.entity;

import javax.persistence.*;

@Table(name = "MODULES")
@Entity
public class Modules {

    @Id
    @GeneratedValue
    @Column(name = "MODULE_ID", nullable = false)
    private int moduleId;

    @Column(name = "MODULE_NAME", nullable = false)
    private String moduleName;

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

}
