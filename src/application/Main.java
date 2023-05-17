package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        ContractService contractService = new ContractService();

        //Data inputs
        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        String contractDate = sc.nextLine();
        Date date = sdf.parse(contractDate);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();


        Contract contract = new Contract(date,number,totalValue);
        contractService.processContract(contract,months, new PaypalService());
        System.out.println("Parcelas:");

        for (Installment n : contract.getInstallments()) {
            Date dueDate = n.getDueDate();
            System.out.print(sdf.format(dueDate) +" - "+ n.getAmount() );
            System.out.println();
        }
        sc.close();

    }
}