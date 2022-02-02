/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author Mohamed Hamdy
 */
public class contactPerson {
    int ID;
    String name;
    String nick_name;
    String address;
    String home_phone;
    String cell_phone;
    String email;
    String birthdate;
    String web_site;
    String profession;
 
    public contactPerson() {
        name="";
        nick_name="";
        address="";
        home_phone="";
        cell_phone="";
        email="";
        birthdate="";
        web_site="";
        profession="";
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHome_phone(String home_phone) {
        this.home_phone = home_phone;
    }

    public void setCell_phone(String cell_phone) {
        this.cell_phone = cell_phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setWeb_site(String web_site) {
        this.web_site = web_site;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public String getAddress() {
        return address;
    }

    public String getHome_phone() {
        return home_phone;
    }

    public String getCell_phone() {
        return cell_phone;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getWeb_site() {
        return web_site;
    }

    public String getProfession() {
        return profession;
    }
}
