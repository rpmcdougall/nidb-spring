package com.phatlabs.ninja.nidbspring.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "netinterfaces")
public class NetInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column
    private String intname;

    @NotNull
    @Column

    private String intdesc;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hostname", nullable = false)
    private Switch parentSwitch;



    public NetInterface() {}

    public NetInterface(@NotNull String intname, @NotNull String intdesc) {
        this.intname = intname;
        this.intdesc = intdesc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntname() {
        return intname;
    }

    public void setIntname(String intname) {
        this.intname = intname;
    }

    public String getIntdesc() {
        return intdesc;
    }

    public void setIntdesc(String desc) {
        this.intdesc = desc;
    }

    public Switch getParentSwitch() {
        return parentSwitch;
    }

    public void setParentSwitch(Switch parentSwitch) {
        this.parentSwitch = parentSwitch;
    }
}
