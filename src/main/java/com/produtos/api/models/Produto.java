package com.produtos.api.models;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;




//Serializable vai habilitar que um objeto de uma classa possa
//ter seu estado persistido pela api padrão do java
@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    //Vai gerar um id aleatório
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    private BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
