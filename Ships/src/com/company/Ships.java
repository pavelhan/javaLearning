package com.company;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "products")
public class Ships {
    @DatabaseField(id = true)
    String productCode;
    @DatabaseField(canBeNull = false)
    String productName;
    @DatabaseField(canBeNull = false)
    String productLine;
    @DatabaseField(canBeNull = false)
    String productScale;
    @DatabaseField(canBeNull = false, useGetSet = true)
    String productVendor;
    @DatabaseField(canBeNull = false, useGetSet = true)
    String productDescription;
    @DatabaseField(canBeNull = false, useGetSet = true)
    int quantityInStock;
    @DatabaseField(canBeNull = false, useGetSet = true)
    double buyPrice;
    @DatabaseField(canBeNull = false, useGetSet = true)
    double MSRP;

    Ships() {
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Ships{" +
                "productName='" + productName + '\'' +
                '}';
    }

    public void setQuantityInStock(int squantityInStock) {
        quantityInStock = squantityInStock;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }

    public String getProductVendor() {

        return productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getMSRP() {
        return MSRP;
    }
}
