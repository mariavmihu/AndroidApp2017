package com.example.maria.mariamihucoopculminating;

/**
 * Created by Maria on 2017-12-31.
 */

public class Counsellors {
    String cFirstname, cLastname, cAge, cPosition, cAllergies, cExtra, accountAccess;

    public void setCounsellorFirstName(String cFirstname){
        this.cFirstname = cFirstname;
    }
    public String getCounsellorFirstName(){
        return this.cFirstname;
    }

    public void setCounsellorLastName(String cLastname){
        this.cLastname = cLastname;
    }
    public String getCounsellorLastName(){
        return this.cLastname;
    }

    public void setCounsellorAge(String cAge){
        this.cAge = cAge;
    }
    public String getCounsellorAge(){
        return this.cAge;
    }

    public void setCounsellorPosition(String cPosition){
        this.cPosition = cPosition;
    }
    public String getCounsellorPosition(){
        return this.cPosition;
    }

    public void setCounsellorAllergies(String cAllergies){
        this.cAllergies = cAllergies;
    }
    public String getCounsellorAllergies(){
        return this.cAllergies;
    }

    public void setCounsellorExtraNotes(String cExtra){
        this.cExtra = cExtra;
    }
    public String getCounsellorExtraNotes(){
        return this.cExtra;
    }

    public void setAccountAccess(String accountAccess){
        this.accountAccess = accountAccess;
    }
    public String getAccountAccess(){
        return this.accountAccess;
    }
}
