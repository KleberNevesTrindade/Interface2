package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contrato;
import entities.Prestacao;
import services.ServicoContrato;
import services.ServicoPaypal;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
        System.out.println("Enter contract data");
        System.out.print("%tNumber: ");
        int numero = sc.nextInt();
        System.out.print("Data :");
        Date mdata = sdf.parse(sc.next());
        System.out.print("Valor :");
        Double valorEmp = sc.nextDouble();

        Contrato contrato = new Contrato(numero, mdata, valorEmp);
        ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal()); 

        System.out.printl("Numero de parcelas: ");
        int np = sc.nextInt();

        servicoContrato.processarContrato(contrato, np);

        System.out.println("Parcelas: ");
        for (Prestacao p : contrato.getPrestacoes()){
            System.out.println(p);
        }

        sc.close();
    }
}
