package model;

public class Vehicle {
    private Integer id;
    private String name ;
    private Double price ;
    private String dateOfProduce ;
    private String description;

    public Vehicle() {
    }

    public Vehicle(Integer id, String name, Double price, String dateOfProduce, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateOfProduce = dateOfProduce;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDateOfProduce() {
        return dateOfProduce;
    }

    public void setDateOfProduce(String dateOfProduce) {
        this.dateOfProduce = dateOfProduce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
