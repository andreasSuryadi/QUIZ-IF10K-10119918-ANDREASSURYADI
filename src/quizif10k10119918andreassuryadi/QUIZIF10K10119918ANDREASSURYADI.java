/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizif10k10119918andreassuryadi;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data dari 
 * hasil perhitungan hairwash
 * 
 */

public class QUIZIF10K10119918ANDREASSURYADI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        
        String name, email, member;
        boolean isMember;
        int service;
        float priceService;
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : ");
        name = scanner.next();
        System.out.print("Customer Email : ");
        email = scanner.next();
        customer.displayService();
        service = scanner.nextInt();
        System.out.print("Are you member (yes/no) : ");
        member = scanner.next();
        
        customer.setName(name);
        customer.setEmail(email);
        
        isMember = customer.checkMemberStatus(member);
        customer.setMember(isMember);
        
        priceService = customer.getPrice(service);
        customer.setPriceService(priceService);
        
        float discount = customer.getSale(customer.isMember(), customer.getPriceService());
        float totalPay = customer.getTotalPay(customer.getPriceService(), discount);
        
        System.out.println("\n\n#********************************#");
        System.out.println("#********CUSTOMER INVOICE********#");
        System.out.println("Date Transaction : " + customer.currentTime());
        System.out.println("Service Price : Rp." + customer.getPriceService() + ".0");
        System.out.println("Discount : Rp." + discount);
        System.out.println("Total Pay : Rp." + totalPay);
    }
    
}
