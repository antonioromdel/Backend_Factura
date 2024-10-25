package com.antonio.curso.springboot.di.factura.springboot_di_factura.models;

public class ItemFactura {

    private Product product;
    private Integer quantity;

    public ItemFactura(){}

    public ItemFactura(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getImport(){
        return quantity*product.getPrice();
    }
}
