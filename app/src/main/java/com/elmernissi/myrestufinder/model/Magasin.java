package com.elmernissi.myrestufinder.model;

public class Magasin {
    private String nom;
    private String adresse;
    private String phone;

    public Magasin(String nom,String adresse,String phone){
        this.nom=nom;
        this.adresse=adresse;
        this.phone=phone;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPhone() {
        return phone;
    }
}
