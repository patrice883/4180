package com.example.devansh.homework02;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by Devansh on 9/28/2017.
 */

public class Contact implements Serializable {

    private String fname, lname, company, phone, email, url, address, birthday, nickname, fbURL, twitterURL, skypeURL, youtubeChannel;
    private Bitmap profile = null;


    @Override
    public String toString() {
        return "Contact{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", nickname='" + nickname + '\'' +
                ", fbURL='" + fbURL + '\'' +
                ", twitterURL='" + twitterURL + '\'' +
                ", skypeURL='" + skypeURL + '\'' +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                '}';
    }

    ///////////////////////////////////////////////////////////////////////////
    // Contructors
    ///////////////////////////////////////////////////////////////////////////
    
    // Contructor with profile pic
    public Contact(Bitmap img, String fname, String lname, String company, String phone, String email, String url, String address, String birthday, String nickname, String fbURL, String twitterURL, String skypeURL, String youtubeChannel) {
        this.profile = img;
        this.fname = fname;
        this.lname = lname;
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.address = address;
        this.birthday = birthday;
        this.nickname = nickname;
        this.fbURL = fbURL;
        this.twitterURL = twitterURL;
        this.skypeURL = skypeURL;
        this.youtubeChannel = youtubeChannel;
    }

    // Contructor without profile pic
    public Contact(String fname, String lname, String company, String phone, String email, String url, String address, String birthday, String nickname, String fbURL, String twitterURL, String skypeURL, String youtubeChannel) {
        this.fname = fname;
        this.lname = lname;
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.url = url;
        this.address = address;
        this.birthday = birthday;
        this.nickname = nickname;
        this.fbURL = fbURL;
        this.twitterURL = twitterURL;
        this.skypeURL = skypeURL;
        this.youtubeChannel = youtubeChannel;
    }


    ///////////////////////////////////////////////////////////////////////////
    // Getters & Setters
    ///////////////////////////////////////////////////////////////////////////

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFbURL() {
        return fbURL;
    }

    public void setFbURL(String fbURL) {
        this.fbURL = fbURL;
    }

    public String getTwitterURL() {
        return twitterURL;
    }

    public void setTwitterURL(String twitterURL) {
        this.twitterURL = twitterURL;
    }

    public String getSkypeURL() {
        return skypeURL;
    }

    public void setSkypeURL(String skypeURL) {
        this.skypeURL = skypeURL;
    }

    public String getYoutubeChannel() {
        return youtubeChannel;
    }

    public void setYoutubeChannel(String youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
    }

    public Bitmap getProfile() {
        return profile;
    }

    public void setProfile(Bitmap profile) {
        this.profile = profile;
    }
}
