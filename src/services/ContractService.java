package services;

import entities.Contract;

import java.util.Date;

public class ContractService {
    private Contract contract;
    private Date month;

    public ContractService(Contract contract, Date month) {
        this.contract = contract;
        this.month = month;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }






}
