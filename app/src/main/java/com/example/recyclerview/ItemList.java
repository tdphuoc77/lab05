package com.example.recyclerview;

public class ItemList {
    private int img;
    private String productName;
    private int quantity;
    private float rating;
    private double price;
    private int discount;

    @Override
    public String toString() {
        return "Item{" +
                "img=" + img +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", rating=" + rating +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public ItemList(int img, String productName, int quantity, float rating, double price, int discount) {
        this.img = img;
        this.productName = productName;
        this.quantity = quantity;
        this.rating = rating;
        this.price = price;
        this.discount = discount;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
