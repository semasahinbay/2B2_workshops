package org.example;

public class Main {
    public static <CorporateCustomer> void main(String[] args) {
        String message = "Vade orani: ";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(9);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(1);
        product1.setImageUrl("img1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(2);
        product2.setImageUrl("img2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(4800);
        product3.setUnitsInStock(3);
        product3.setImageUrl("img3.jpg");

        Product[] products = {product1,product2,product3};
        System.out.println("<ul>");

        for(Product product : products){
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05000000000");
        individualCustomer.setCustomerNumber("15624");
        individualCustomer.setFirstName("Sema");
        individualCustomer.setLastName("Şahinbay");




    }
}