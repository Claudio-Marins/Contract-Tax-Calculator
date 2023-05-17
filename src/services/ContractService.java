package services;

import entities.Contract;
import entities.Installment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContractService {
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  Date dataContract = new Date();


   public void processContract(Contract contract, Integer months,OnlinePaymentService onlinePaymentService){
       Date date = contract.getDate();

      for (int i=0;i<months;i++){
          Double installmentPartedValue = contract.getTotalValue()/months;
          Double sum;
          Installment installment = new Installment();
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(date);
          calendar.add(Calendar.MONTH,i + 1);
          installment.setDueDate(calendar.getTime());
          installmentPartedValue = onlinePaymentService.interest(installmentPartedValue, i+1);
          sum = onlinePaymentService.paymentFee(installmentPartedValue);
          installment.setAmount(sum);
          contract.addInstallments(installment);



      }
   }



}
