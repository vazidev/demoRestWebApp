package com.vazidev.demorestwebapp.domain;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {
    @Id
    UUID userId;
    String name;
    boolean tech;
    String userEmail;
    String userKey;
    String userName;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public boolean isTech() {
        return tech;
    }

    public void setTech(boolean tech) {
        this.tech = tech;
    }


   public void userData(String name, String username, String userkey, String useremail, boolean tech){
       this.userName = username;
       this.userKey = userkey;
       this.userEmail = useremail;
       this.tech = tech;
       this.name= name;
   }

   private UUID userId(){
       return UUID.randomUUID();
   }

/*** Getter and Setters **/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
        return "User [username: " + userName
                + "Name: "+ name
                + "Technician: " + tech
                + "User Id: " + userId
                + "Key: " + userKey
                + "Email: " + userEmail + "]";

    }

}
