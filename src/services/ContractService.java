package services;

import entities.Contract;
import entities.Installment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContractService {

   public void processContract(Contract contract, Integer months,OnlinePaymentService onlinePaymentService){
       Date date = contract.getDate();


      for (int i=0;i<months;i++){
          Double installmentPartedValue = contract.getTotalValue()/months;
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(date);
          calendar.add(Calendar.MONTH,i + 1);
          installmentPartedValue += onlinePaymentService.interest(installmentPartedValue, i+1);
          Double sum = onlinePaymentService.paymentFee(installmentPartedValue);
          contract.addInstallments( new Installment(calendar.getTime(), sum));



      }
   }

}
