package model;


public class TComplex {
    private Integer id ;
    private Integer area;
    private Integer status ;
    private Integer floor ;
    private Integer typeOfName;
    private String description ;
    private Integer price ;
    private String dateStart ;
    private String dateEnd ;

    public TComplex() {
    }

    public TComplex(Integer id, Integer area, Integer status, Integer floor, Integer typeOfName, String description, Integer price, String dateStart, String dateEnd) {
        this.id = id;
        this.area = area;
        this.status = status;
        this.floor = floor;
        this.typeOfName = typeOfName;
        this.description = description;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getTypeOfName() {
        return typeOfName;
    }

    public void setTypeOfName(Integer typeOfName) {
        this.typeOfName = typeOfName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }
}
