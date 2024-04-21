package objects;

import java.util.ArrayList;
///how will we add a picture to profile?


public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean isSelling;
    //Object should be replaced with class of recipe
    private ArrayList<Object> myFavorite;

    ///here to create the basic account you need only 3 parameters specified
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

        this.address = "unknown";
        this.isSelling = false;
        myFavorite = new ArrayList<Object>();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSelling(boolean selling) {
        isSelling = selling;
    }


}


