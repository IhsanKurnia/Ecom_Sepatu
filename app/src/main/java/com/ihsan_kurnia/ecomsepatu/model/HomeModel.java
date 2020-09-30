package com.ihsan_kurnia.ecomsepatu.model;

public class HomeModel {
    private int id_Product;
    private String namaproduct;
    private String statusproduct;
    private String diskonproduct;
    private String imageproduct;


    public HomeModel(int id_Product, String namaproduct, String statusproduct, String diskonproduct, String imageproduct) {
        this.id_Product = id_Product;
        this.namaproduct = namaproduct;
        this.statusproduct = statusproduct;
        this.diskonproduct = diskonproduct;
        this.imageproduct = imageproduct;
    }

    public int getId_Product() {
        return id_Product;
    }

    public void setId_Product(int id_Product) {
        this.id_Product = id_Product;
    }

    public String getNamaproduct() {
        return namaproduct;
    }

    public void setNamaproduct(String namaproduct) {
        this.namaproduct = namaproduct;
    }

    public String getStatusproduct() {
        return statusproduct;
    }

    public void setStatusproduct(String statusproduct) {
        this.statusproduct = statusproduct;
    }

    public String getDiskonproduct() {
        return diskonproduct;
    }

    public void setDiskonproduct(String diskonproduct) {
        this.diskonproduct = diskonproduct;
    }

    public String getImageproduct() {
        return imageproduct;
    }

    public void setImageproduct(String imageproduct) {
        this.imageproduct = imageproduct;
    }
}
