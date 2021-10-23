package Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Drug {
    private int drugId;
    private String drugName;
    private Date mfd;
    private Date expiryDate;
    private Company manufacturer;
    private String amount;

    public Drug(int drugId, String drugName, Date mfd, Date expiryDate, Company manufacturer, String amount) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.mfd = mfd;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
        this.amount = amount;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Date getMfd() {
        return mfd;
    }

    public void setMfd(Date mfd) {
        this.mfd = mfd;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Company getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Company manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }



    @Override
    public String toString() {
        return "Drug{" +
                "drugId=" + drugId +
                ", drugName='" + drugName + '\'' +
                ", mfd=" + mfd +
                ", expiryDate=" + expiryDate +
                ", manufacturer=" + manufacturer +
                ", amount='" + amount + '\'' +
                '}';
    }
}
