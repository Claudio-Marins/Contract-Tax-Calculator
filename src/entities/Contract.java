package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Date date;
    private Integer number;
    private Double totalValue;
    private List<Installment> installments = new ArrayList<>();



    public Contract() {
    }

    public Contract(Date date, Integer number, Double totalValue, Installment installments) {
        this.date = date;
        this.number = number;
        this.totalValue = totalValue;
        this.installments.add(installments);
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

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallments(Installment installments) {
        this.installments.add(installments);
    }
}


