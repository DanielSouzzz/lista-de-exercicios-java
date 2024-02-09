package br.com.alura.loja.tipos;

public class Produto {
    private String brand;
    private double price;
    private int quantity;

    public Produto(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "\nProduto\n{\n" +
                "marca='" + brand + '\'' +
                ", \npreço=" + price +
                ", \nquantidade=" + quantity +
                "\n}";
    }
}
