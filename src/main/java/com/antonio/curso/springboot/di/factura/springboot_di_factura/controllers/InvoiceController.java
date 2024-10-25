package com.antonio.curso.springboot.di.factura.springboot_di_factura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonio.curso.springboot.di.factura.springboot_di_factura.models.Invoice;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show(){
        return invoice;
    }

}
