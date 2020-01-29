package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {

        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }



    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Job))return false;
        Job job = (Job)o;
        return getId()==job.getId();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getId());
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        String data = "";
        boolean jobNotEmpty = false;
        data+= "ID: " + getId()+"\n";
        if(getName()==null||getName().equals("")){
            data+= "Name: Data not available\n";
        }else{
            data+= "Name: "+getName()+"\n";
            jobNotEmpty = true;
        }

        if(getEmployer()==null||getEmployer().getValue().equals("")){
            data+= "Employer: Data not available\n";
        }else{
            data+= "Employer: "+getEmployer().getValue()+"\n";
            jobNotEmpty = true;
        }

        if(getLocation()==null||getLocation().getValue().equals("")){
            data+= "Location: Data not available\n";
        }else{
            data+= "Location: "+getLocation().getValue()+"\n";
            jobNotEmpty = true;
        }

        if(getPositionType()==null||getPositionType().getValue().equals("")){
            data+= "Position Type: Data not available\n";
        }else{
            data+= "Position Type: "+getPositionType().getValue()+"\n";
            jobNotEmpty = true;
        }

        if(getCoreCompetency()==null||getCoreCompetency().getValue().equals("")){
            data+= "Core Competency: Data not available";
        }else{
            data+= "Core Competency: "+getCoreCompetency().getValue();
            jobNotEmpty = true;
        }

        if(!jobNotEmpty){
            data = "OOPS! This job does not seem to exist.";
        }
        return data;
    }
}
