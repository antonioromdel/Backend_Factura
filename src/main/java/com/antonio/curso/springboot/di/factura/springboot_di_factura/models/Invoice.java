package com.antonio.curso.springboot.di.factura.springboot_di_factura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description}")
    private String description;
    
    @Autowired
    private List<ItemFactura> items;

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<ItemFactura> getItems() {
        return items;
    }
    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

    public Integer getTotal(){

        int total = 0;
        for(ItemFactura item : items){
            total += item.getImport();
        }

        return total;
    }
}
