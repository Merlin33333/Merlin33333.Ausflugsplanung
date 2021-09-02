/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompany.com.la_webanwendung_zur_ausflugsplanung;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author vande
 */
@Named("dtBasicView")
@ApplicationScoped
public class BasicView implements Serializable {

    private List<Product> products;

    @Inject
    private ProductService service;

    @PostConstruct
    public void init() {
        products = service.getProducts();
    }

    public List<Product> getProducts() {
        products = service.getProducts();
        return products;
    }

    public ProductService getService() {
        return service;
    }

    public void setService(ProductService service) {
        this.service = service;
    }
}