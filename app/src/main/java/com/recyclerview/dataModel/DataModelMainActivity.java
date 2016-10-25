package com.recyclerview.dataModel;


public class DataModelMainActivity {

    private int image;
    private String name;
    private String status;
    private String mobile;


    public DataModelMainActivity(int image, String name, String status, String mobile) {
        this.image = image;
        this.name = name;
        this.status = status;
        this.mobile = mobile;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}