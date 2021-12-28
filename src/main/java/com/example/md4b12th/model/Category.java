package com.example.md4b12th.model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  long id;
    private String name;

    @OneToMany(targetEntity = Smartphone.class)
    private List<Smartphone> products;
    public Category() {
    }

    public long getId() {
        return id;
    }

    public List<Smartphone> getProducts() {
        return products;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProducts(List<Smartphone> products) {
        this.products = products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
