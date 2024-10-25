package com.antonio.curso.springboot.di.factura.springboot_di_factura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.antonio.curso.springboot.di.factura.springboot_di_factura.models.ItemFactura;
import com.antonio.curso.springboot.di.factura.springboot_di_factura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<ItemFactura> itemsInvoice(){

        Product p1 = new Product("Camara Sony", 800);
        Product p2 = new Product("Bicicleta Bianchi 26", 1200);

        return Arrays.asList(new ItemFactura(p1, 2), new ItemFactura(p2, 4));
    }
}
