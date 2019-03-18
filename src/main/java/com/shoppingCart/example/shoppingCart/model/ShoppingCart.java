package com.shoppingCart.example.shoppingCart.model;

import sun.security.util.Password;
import javax.persistence.*;
import java.util.Date;

@Entity
public class ShoppingCart{

    @Id
    @GeneratedValue
    @Column(name = "UserID")
    private Integer UserID;
    @Column(name = "UserEmail")
    private String UserEmail;
    @Column(name = "UserPassword")
    private String UserPassword;
    @Column(name = "UserFirstName")
    private String UserFirstName;
    @Column(name = "UserLastName")
    private String UserLastName;
    @Column(name = "UserCity")
    private String UserCity;
    @Column(name = "UserState")
    private String UserState;
    @Column(name = "UserZip")
    private String UserZip;
    @Column(name = "UserEmailVerified")
    private String UserEmailVerified;
    @Column(name = "UserRegistrationDate")
    private Date UserRegistrationDate;
    @Column(name = "UserVerificationCode")
    private String UserVerificationCode;
    @Column(name = "UserIP")
    private String UserIP;
    @Column(name = "UserPhone")
    private String UserPhone;
    @Column(name = "UserFax")
    private String UserFax;
    @Column(name = "UserCountry")
    private String UserCountry;
    @Column(name = "UserAddress")
    private String UserAddress;
    @Column(name = "UserAddress2")
    private String UserAddress2;

    public ShoppingCart() {
    }

    public ShoppingCart(String userEmail, String userPassword, String userFirstName, String userLastName, String userCity, String userState, String userZip, String userEmailVerified, Date userRegistrationDate, String userVerificationCode, String userIP, String userPhone, String userFax, String userCountry, String userAddress, String userAddress2) {
        UserEmail = userEmail;
        UserPassword = userPassword;
        UserFirstName = userFirstName;
        UserLastName = userLastName;
        UserCity = userCity;
        UserState = userState;
        UserZip = userZip;
        UserEmailVerified = userEmailVerified;
        UserRegistrationDate = userRegistrationDate;
        UserVerificationCode = userVerificationCode;
        UserIP = userIP;
        UserPhone = userPhone;
        UserFax = userFax;
        UserCountry = userCountry;
        UserAddress = userAddress;
        UserAddress2 = userAddress2;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        UserFirstName = userFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public String getUserCity() {
        return UserCity;
    }

    public void setUserCity(String userCity) {
        UserCity = userCity;
    }

    public String getUserState() {
        return UserState;
    }

    public void setUserState(String userState) {
        UserState = userState;
    }

    public String getUserZip() {
        return UserZip;
    }

    public void setUserZip(String userZip) {
        UserZip = userZip;
    }

    public String getUserEmailVerified() {
        return UserEmailVerified;
    }

    public void setUserEmailVerified(String userEmailVerified) {
        UserEmailVerified = userEmailVerified;
    }

    public Date getUserRegistrationDate() {
        return UserRegistrationDate;
    }

    public void setUserRegistrationDate(Date userRegistrationDate) {
        UserRegistrationDate = userRegistrationDate;
    }

    public String getUserVerificationCode() {
        return UserVerificationCode;
    }

    public void setUserVerificationCode(String userVerificationCode) {
        UserVerificationCode = userVerificationCode;
    }

    public String getUserIP() {
        return UserIP;
    }

    public void setUserIP(String userIP) {
        UserIP = userIP;
    }

    public String getUserPhone() {
        return UserPhone;
    }

    public void setUserPhone(String userPhone) {
        UserPhone = userPhone;
    }

    public String getUserFax() {
        return UserFax;
    }

    public void setUserFax(String userFax) {
        UserFax = userFax;
    }

    public String getUserCountry() {
        return UserCountry;
    }

    public void setUserCountry(String userCountry) {
        UserCountry = userCountry;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }

    public String getUserAddress2() {
        return UserAddress2;
    }

    public void setUserAddress2(String userAddress2) {
        UserAddress2 = userAddress2;
    }
}

