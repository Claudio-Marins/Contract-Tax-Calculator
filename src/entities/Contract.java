package entities;

import java.util.Date;

public class Contract {
    private Date date;
    private Integer number;
    private Double totalValue;
    private Installment installments;




    public Contract() {
    }

    public Contract(Date date, Integer number, Double totalValue, Installment installments) {
        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
        this.installments = installments;
    }

    public Contract(Date date, Integer number, Double totalValue) {
        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }






}


