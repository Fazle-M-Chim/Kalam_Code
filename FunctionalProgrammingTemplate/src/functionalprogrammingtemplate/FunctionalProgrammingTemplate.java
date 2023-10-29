/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functionalprogrammingtemplate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author fazle
 */
public class FunctionalProgrammingTemplate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create the ArrayList of Invoices
        List<Invoice> invoices = List.of(
        new Invoice(83,"Electric sander", 7, 57.98),
        new Invoice(24,"Power saw", 18, 99.99),
        new Invoice(7,"Sledge hammer", 11, 21.50),
        new Invoice(77,"Hammer", 76, 11.99),
        new Invoice(39,"Lawn mower", 3, 79.50),
        new Invoice(68,"Screw driver", 106, 6.99),
        new Invoice(56,"Jig saw", 21, 11.00),
        new Invoice(3,"Wrench", 34, 7.50));
        
        //Display the table of invoices using Invoice toString().
        //Print table header.
        System.out.println("Part number\tPart description\tQuantity\tPrice per item " +"\t  Value");
        invoices.stream()
                .forEach(System.out::print);
        
        //a)Use streams to sort Invoice object by partDecsription, then display the results.
        System.out.println("\nInvoices sorted by Part description");
        System.out.println("Part number\tPart description\tQuantity\tPrice per item " +"\t  Value");
        invoices.stream()
                .sorted((invoice1, invoice2) -> invoice1.getPartDescription().compareTo(invoice2.getPartDescription()))
                .forEach(System.out::print);
        
        //b)Use streams to sort Invoice object by price, then display the results.
        System.out.println("\nInvoices sorted by Price");
        System.out.println("Part number\tPart description\tQuantity\tPrice per item " +"\t  Value");
        invoices.stream()
                .sorted((invoice1,invoice2) -> Double.compare(invoice1.getPricePerItem(), invoice2.getPricePerItem()))
                .forEach(System.out::print);
        
        //c)Use streams to map each Invoice to its partDescription and quantity, 
        //  then display the results.
        System.out.println("\nPart Description and Quantity for each Invoice");
        System.out.println("Part Description\tQuantity");
        invoices.stream()
                .map(invoice -> String.format("%-11s\t\t%8d", invoice.getPartDescription(), invoice.getQuantity()))
                .sorted((desc1,desc2) -> Double.compare(Double.parseDouble(desc1.split("\t\t")[1])
                        , Double.parseDouble(desc2.split("\t\t")[1])))
                .forEach(System.out::println);
    }
    
}
