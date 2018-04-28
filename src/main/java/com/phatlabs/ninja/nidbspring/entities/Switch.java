package com.phatlabs.ninja.nidbspring.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Switches")
public class Switch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(unique = true)
    private String hostname;

    @NotNull
    @Column(nullable = false)
    private String model;

    @OneToMany(
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "id"
    )
    private Set<NetInterface> interfaces = new HashSet<>();

    public Switch() {}

    public Switch(@NotNull String hostname, @NotNull String model, Set<NetInterface> interfaces) {
        this.hostname = hostname;
        this.model = model;
        this.interfaces = interfaces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<NetInterface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(Set<NetInterface> interfaces) {
        this.interfaces = interfaces;
    }
}
