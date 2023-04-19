package com.sharma.practices.java8.customMultiGroup;

public class GroupBy {
    private String designation;
    private String gender;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public GroupBy(String designation, String gender) {
        this.designation = designation;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return this.designation.length() + this.gender.length();
    }

    @Override
    public boolean equals(Object obj) {
        GroupBy other = (GroupBy) obj;
        if (other.getDesignation().equals(this.designation) && other.getGender().equals(this.gender))
            return true;
        return false;
    }


    public String toString() {
        return "GroupBy [designation=" + designation + ", gender=" + gender + "]";
    }
}
