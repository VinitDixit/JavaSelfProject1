package TestLearn.appraisalSystem;

import java.util.Objects;

public class Employee {
    Integer id;
    String fName;
    String lName;
    Double salary;
    Float tenure;
    Character underNoticePeriod;
    Appraisal appraisal;

    public Employee() {
    }

    public Employee(Integer id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public Integer getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public Double getSalary() {
        return salary;
    }

    public Float getTenure() {
        return tenure;
    }

    public Character getUnderNoticePeriod() {
        return underNoticePeriod;
    }

    public Appraisal getAppraisal() {
        return appraisal;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setTenure(Float tenure) {
        this.tenure = tenure;
    }

    public void setUnderNoticePeriod(Character underNoticePeriod) {
        this.underNoticePeriod = underNoticePeriod;
    }

    public void setAppraisal(Appraisal appraisal) {
        this.appraisal = appraisal;
    }

    @Override
    public String toString() {
        return "Employee Details::{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                ", tenure=" + tenure +
                ", underNoticePeriod=" + underNoticePeriod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) && fName.equals(employee.fName) && lName.equals(employee.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fName, lName);
    }
}
