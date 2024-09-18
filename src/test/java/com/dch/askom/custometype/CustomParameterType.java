package com.dch.askom.custometype;

import com.dch.askom.domainobjects.Product;

public class CustomParameterType {

    public Product product(String name) {
        return new Product(name.replace("\"", ""));
    }
}
