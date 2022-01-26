package model.customer;

public class CustomerType {
    private Integer idType ;
    private String nameOfType ;

    public CustomerType() {
    }

    public CustomerType(Integer idType, String nameOfType) {
        this.idType = idType;
        this.nameOfType = nameOfType;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getNameOfType() {
        return nameOfType;
    }

    public void setNameOfType(String nameOfType) {
        this.nameOfType = nameOfType;
    }
}
