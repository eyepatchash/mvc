package com.tracfone.mvc.commom.model;

public class Trainees {
    private String name;
    private String role;
    private int emp_id;

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Trainees{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", emp_id=" + emp_id +
                '}';
    }

    public Trainees(String name, String role, int emp_id) {
        this.name = name;
        this.role = role;
        this.emp_id = emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getEmp_id() {
        return emp_id;
    }
}
