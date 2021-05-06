package com.example.quizz_2;

public class Car {
    String BName;
    String CModel;
    String COwner;
    String OwnerNum;

    public Car() {
    }

    public Car(String BName, String CModel, String COwner, String ownerNum) {
        this.BName = BName;
        this.CModel = CModel;
        this.COwner = COwner;
        OwnerNum = ownerNum;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public String getCModel() {
        return CModel;
    }

    public void setCModel(String CModel) {
        this.CModel = CModel;
    }

    public String getCOwner() {
        return COwner;
    }

    public void setCOwner(String COwner) {
        this.COwner = COwner;
    }

    public String getOwnerNum() {
        return OwnerNum;
    }

    public void setOwnerNum(String ownerNum) {
        OwnerNum = ownerNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "BName='" + BName + '\'' +
                ", CModel='" + CModel + '\'' +
                ", COwner='" + COwner + '\'' +
                ", OwnerNum='" + OwnerNum + '\'' +
                '}';
    }
}
